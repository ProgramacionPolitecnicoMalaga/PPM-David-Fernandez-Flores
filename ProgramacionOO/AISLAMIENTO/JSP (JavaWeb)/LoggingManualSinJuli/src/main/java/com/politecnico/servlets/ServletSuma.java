package com.politecnico.servlets;

import com.politecnico.Operaciones.Suma;
import com.politecnico.logger.LoggingClass;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class ServletSuma extends HttpServlet {

    private LoggingClass logging;
    private Logger logger;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logging = new LoggingClass();
        logger = logging.getLogger();
        logger.info("Comienzo de programa");
        double sumando1 = Double.parseDouble(req.getParameter("num1"));
        double sumando2 = Double.parseDouble(req.getParameter("num2"));
        double result = Suma.sumar(sumando1,sumando2);
        logger.info("Datos recibidos: "+sumando1+ " y "+sumando2);
        req.setAttribute("resultado", result);
        req.setAttribute("logger",logger);
        logger.info("El resultado será: "+result);
        RequestDispatcher view = req.getRequestDispatcher("vista.jsp");
        view.forward(req,resp);
    }
}
