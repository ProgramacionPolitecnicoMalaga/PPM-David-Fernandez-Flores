package com.politecnico;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(
        name="servlet fibonacci",
        urlPatterns={"/calculo.do"}
)

public class ServletFibonacci extends HttpServlet {

    private int numeroPosicion;
    private int numeroFinal;
    private ArrayList<Integer> serieDeFibonacci = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        numeroPosicion = Integer.parseInt(req.getParameter("numPosicion"));
        Fibonacci serieFibonacci = new Fibonacci(serieDeFibonacci);
        serieFibonacci.calculoFibonacci(numeroPosicion,serieDeFibonacci);
        numeroFinal = serieFibonacci.getPosicionDeFibonacci(numeroPosicion,serieDeFibonacci);
        req.setAttribute("resultado",numeroFinal);
        RequestDispatcher view = req.getRequestDispatcher("/resultadoCalculo.jsp");
        view.forward(req,resp);
    }
}
