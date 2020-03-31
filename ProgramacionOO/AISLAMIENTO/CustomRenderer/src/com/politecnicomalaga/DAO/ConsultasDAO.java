package com.politecnicomalaga.DAO;

import com.politecnicomalaga.Item;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ConsultasDAO {

    private DBConn conn;

    public ConsultasDAO() throws SQLException {
        conn = new DBConn();
    }

    public ArrayList<Item> getItems() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM item");
        ArrayList<Item> items = new ArrayList<>();
        while (result.next()){
            items.add(new Item(result.getString("autor"),LocalDate.parse(String.valueOf(result.getDate("fecha"))),result.getString("comentario")));
        }
        return items;
    }

    public int create (String autor, LocalDate fecha, String texto) throws SQLException {
        return conn.crud("INSERT INTO item(autor,fecha,comentario) VALUES ('"+autor+"','"+Date.valueOf(fecha)+"','"+texto+"')");
    }
    public int create (Item item) throws SQLException {
        return create(item.getAutor(),item.getFecha(),item.getTexto());
    }
    public ArrayList<Item> inserction(Item item) throws SQLException{
        int res = create(item);
        ArrayList<Item> items = getItems();
        return items;
    }
}
