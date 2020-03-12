package com.politecnicomalaga.dao;

import com.politecnicomalaga.modelo.Empleado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpleadoDAO {

    private DBConn conn;

    public EmpleadoDAO() throws SQLException {
        conn = new DBConn();
    }

    public ArrayList<Empleado> buscarPorPatron(String patron) throws SQLException{
        ResultSet result = conn.read("SELECT id, nombre, edad FROM Empleado WHERE nombre LIKE '%" + patron + "%'");
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        while (result.next()){
            listaEmpleados.add(new Empleado(result.getInt("id"),result.getString("nombre"),result.getInt("edad")));
        }
        return listaEmpleados;
    }

    public ArrayList<Empleado> getEmpleados() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM Empleado");
        ArrayList<Empleado> lista = new ArrayList<>();
        while (result.next()){
            lista.add(new Empleado(result.getInt("id"),result.getString("nombre"),result.getInt("edad")));
        }
        return lista;
    }

    public ArrayList<Empleado> borrar(String nombre) throws SQLException{
        int result = conn.delete("DELETE FROM Empleado WHERE nombre = '"+nombre+"'");
        ArrayList<Empleado> lista = getEmpleados();
        return lista;
    }

    public ArrayList<Empleado> inserction(int id,String nombre,int edad) throws SQLException {
        Empleado empleado = new Empleado(id, nombre, edad);
        int res = crear(empleado);
        ArrayList<Empleado> lista = getEmpleados();
        return lista;
    }

    public ArrayList<Empleado> updateTable(String name, String newName, int edad)throws SQLException{
        int result = conn.update("UPDATE Empleado SET nombre='"+newName+"',edad='"+edad+"' WHERE nombre='"+name+"'");
        ArrayList<Empleado> list = getEmpleados();
        return list;
    }

    public ArrayList<Empleado> busquedaMenoresEdad() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM Empleado WHERE edad < 18");
        ArrayList<Empleado> lista = new ArrayList<>();
        while (result.next()){
            lista.add(new Empleado(result.getInt("id"),result.getString("nombre"),result.getInt("edad")));
        }
        return lista;
    }

    public ArrayList<Empleado> busquedaMayoresEdad() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM Empleado WHERE edad > 18");
        ArrayList<Empleado> lista = new ArrayList<>();
        while (result.next()){
            lista.add(new Empleado(result.getInt("id"),result.getString("nombre"),result.getInt("edad")));
        }
        return lista;
    }

    public int crear (String nombre,int edad) throws SQLException {
        return conn.create("INSERT INTO Empleado(nombre, edad) VALUES ('"+nombre+"','"+edad+"')");
    }
    public int crear (Empleado empleado) throws SQLException {
        return crear(empleado.getNombre(),empleado.getEdad());
    }
}
