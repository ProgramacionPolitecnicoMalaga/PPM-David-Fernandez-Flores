package com.politecnico.controlador;

import com.politecnico.dao.ConsultasDAO;
import com.politecnico.modelo.Credencial;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {
    public ArrayList<String> crear(Credencial credencial){
        ArrayList<String> credenciales = new ArrayList<>();
        try {
            ConsultasDAO cons = new ConsultasDAO();
            credenciales = cons.creacion(credencial);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return credenciales;
    }
    public ArrayList<String> leerNombres(){
        ArrayList<String> nombres = new ArrayList<>();
        try{
            ConsultasDAO cons = new ConsultasDAO();
            nombres = cons.getNombres();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return nombres;
    }
}
