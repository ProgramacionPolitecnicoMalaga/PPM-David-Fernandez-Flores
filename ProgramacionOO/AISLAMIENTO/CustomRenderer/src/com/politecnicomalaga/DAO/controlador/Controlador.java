package com.politecnicomalaga.DAO.controlador;

import com.politecnicomalaga.DAO.ConsultasDAO;
import com.politecnicomalaga.Item;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {
    public ArrayList<Item> insert(Item item){
        ArrayList<Item> list = new ArrayList<>();
        try{
            ConsultasDAO cons = new ConsultasDAO();
            list = cons.inserction(item);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Item> getItems(){
        ArrayList<Item> listaEmpleados = new ArrayList<>();
        try {
            ConsultasDAO consult = new ConsultasDAO();
            listaEmpleados =  consult.getItems();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEmpleados;
    }
    public ArrayList<Item> deleteItem(){
        ArrayList<Item> items = new ArrayList<>();
        return items;
    }
}
