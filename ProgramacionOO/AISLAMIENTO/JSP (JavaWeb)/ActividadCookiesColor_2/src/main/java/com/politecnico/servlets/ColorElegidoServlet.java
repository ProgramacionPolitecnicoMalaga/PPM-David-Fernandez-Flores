package com.politecnico.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

public class ColorElegidoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String recibido = req.getReader().lines().collect(Collectors.joining());
        String color = null;
        String cadenaResultado = "";
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("color")) {
                    color = cookie.getValue();
                }
            }
            cadenaResultado = "{\"status\":\"ok\",\"color\":\""+color+"\"}";
        }
        else {
            cadenaResultado = "{\"status\":\"ko\"}"; }

        PrintWriter out = resp.getWriter();
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        out.print(cadenaResultado);
    }
}
