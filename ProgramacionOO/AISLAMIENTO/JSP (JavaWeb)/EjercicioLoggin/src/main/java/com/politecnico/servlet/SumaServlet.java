package com.politecnico.servlet;

import com.politecnico.logging.Logging;
import com.politecnico.operaciones.Suma;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class SumaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double numero1 = Double.parseDouble(req.getParameter("num1"));
        double numero2 = Double.parseDouble(req.getParameter("num2"));
        Logger logger = Logger.getLogger(this.getServletInfo());
        logger.info("Los sumandos recibidos son: "+numero1+ " y " +numero2);
        Suma suma = new Suma();
        double result = suma.sumar(numero1,numero2);
        req.setAttribute("resultado",result);
        logger.info("El resultado es: "+result);
        RequestDispatcher view = req.getRequestDispatcher("suma.jsp");
        view.forward(req,resp);
    }
}
