package com.politecnico.dao;

import com.politecnico.modelo.Item;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasDAO {
    private DBConn conn;

    public ConsultasDAO() throws SQLException {
        conn = new DBConn();
    }

    public ArrayList<Item> getDatosItem() throws SQLException {
        ResultSet result = conn.read("SELECT titulo,nombre,tema,fecha,texto FROM item");
        ArrayList<Item> items = new ArrayList<>();
        while (result.next()){
            items.add(new Item(result.getString("titulo"),result.getString("nombre"),result.getString("tema"),result.getString("fecha"),result.getString("texto")));
        }
        return items;
    }
    public ArrayList <Item> insertar(Item item) throws SQLException {
        int res = crear(item);
        ArrayList<Item> items = getDatosItem();
        return items;
    }
    public int crear(Item item) throws SQLException {
        return create(item.getTitulo(),item.getNombre(),item.getTema(),item.getFecha(),item.getTexto());
    }
    public int create(String tit,String nom,String tem,String dat,String text) throws SQLException {
        return conn.crud("INSERT INTO item(titulo,nombre,tema,fecha,texto) VALUES('"+tit+"','"+nom+"','"+tem+"','"+dat+"','"+text+"')");
    }
    public ArrayList<Item> realizarBorrado(Item item) throws SQLException {
        int res = borrar(item);
        ArrayList<Item> items = getDatosItem();
        return items;
    }

    public int borrar(Item item) throws SQLException {
        return delete(item.getTitulo(),item.getNombre(),item.getTema(),item.getFecha(),item.getTexto());
    }
    public int delete(String tit,String nom,String tem,String dat,String text) throws SQLException {
        return conn.crud("DELETE FROM item WHERE titulo = '"+tit+"' AND nombre = '"+nom+"' AND tema = '"+tem+"' AND fecha = '"+dat+"' AND texto = '"+text+"'");
    }
}
