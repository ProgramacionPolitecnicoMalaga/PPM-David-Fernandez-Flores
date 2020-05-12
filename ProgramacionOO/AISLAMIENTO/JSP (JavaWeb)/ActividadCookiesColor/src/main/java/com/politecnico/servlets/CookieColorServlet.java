package com.politecnico.servlets;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

@WebServlet(
        name = "ServletDeColor",
        urlPatterns = {"/color.get"}
)
public class CookieColorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cadenaResultante = "";
        String colorValue = "";
        String cadenaRecibida = req.getReader().lines().collect(Collectors.joining());
        JSONParser parser = new JSONParser();
        try {
            JSONObject json = (JSONObject) parser.parse(cadenaRecibida);
            String color = ((String) json.get("color"));
            colorValue = color;
            //cadenaResultante = "{\"status\":\"yes\",\"color\":\""+color+"\"}";
        } catch (Exception e){
            cadenaResultante = "{\"status\":\"no\"}";
            e.printStackTrace();
        }
        Cookie cookieColor = new Cookie("color",colorValue);
        resp.addCookie(cookieColor);
        cadenaResultante = "{\"status\":\"yes\",\"color\":\""+cookieColor.getValue()+"\"}";

        PrintWriter out = resp.getWriter();
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        out.print(cadenaResultante);
    }
}
