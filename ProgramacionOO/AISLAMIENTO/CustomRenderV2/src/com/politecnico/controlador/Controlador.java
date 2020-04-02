package com.politecnico.controlador;

import com.politecnico.dao.ConsultasDAO;
import com.politecnico.modelo.Item;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {

    public ArrayList<Item> getItems(){
        ArrayList<Item> items = new ArrayList<>();
        try {
            ConsultasDAO cons = new ConsultasDAO();
            items = cons.getDatosItem();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return items;
    }

    public ArrayList<Item> crear(Item item){
        ArrayList<Item> items = new ArrayList<>();
        try{
            ConsultasDAO cons = new ConsultasDAO();
            items = cons.insertar(item);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return items;
    }
    public ArrayList<Item> borrar(Item item){
        ArrayList<Item> items = new ArrayList<>();
        try{
            ConsultasDAO cons = new ConsultasDAO();
            items = cons.realizarBorrado(item);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return items;
    }
}
