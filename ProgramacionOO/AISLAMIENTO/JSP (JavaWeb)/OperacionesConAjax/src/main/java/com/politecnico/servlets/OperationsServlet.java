package com.politecnico.servlets;

import com.politecnico.operaciones.Operaciones;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

@WebServlet(
        name = "ServletDeOperaciones",
        urlPatterns = {"/calculo.do"}
)
public class OperationsServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cadenaResultante = "";
        String cadenaRecibida = req.getReader().lines().collect(Collectors.joining());
        JSONParser parser = new JSONParser();
        try {
            JSONObject json = (JSONObject) parser.parse(cadenaRecibida);
            double a = Double.parseDouble((String) json.get("a"));
            double b = Double.parseDouble((String) json.get("b"));
            double suma = Operaciones.sumar(a,b);
            double resta = Operaciones.restar(a,b);
            double multp = Operaciones.multiplicar(a,b);
            double div = Operaciones.divida(a,b);

            cadenaResultante = "{\"status\":\"yes\",\"suma\":\""+suma+"\",\"resta\":\""+resta+"\",\"multp\":\""+multp+"\",\"divid\":\""+div+"\"}";
        } catch (Exception e){
            cadenaResultante = "{\"status\":\"no\"}";
            e.printStackTrace();
        }

        PrintWriter out = resp.getWriter();
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        out.print(cadenaResultante);
    }
}
