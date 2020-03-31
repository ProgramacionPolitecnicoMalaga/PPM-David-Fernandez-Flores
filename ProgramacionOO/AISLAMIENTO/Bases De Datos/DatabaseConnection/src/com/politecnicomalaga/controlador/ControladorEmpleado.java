package com.politecnicomalaga.controlador;

import com.politecnicomalaga.dao.EmpleadoDAO;
import com.politecnicomalaga.modelo.Empleado;

import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorEmpleado {

    public ArrayList<Empleado> getEmpleados(){
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            listaEmpleados =  empleadoDAO.getEmpleados();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEmpleados;
    }

    public ArrayList<Empleado> getBusquedaPatron(String patron){
        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            empleados = empleadoDAO.buscarPorPatron(patron);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    public ArrayList<Empleado> getListaTrasBorrado(String nombreMod){
        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            empleados = empleadoDAO.borrar(nombreMod);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return  empleados;
    }

    public ArrayList<Empleado> createInserction(int id, String nombre, int edad){
        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            empleados = empleadoDAO.inserction(id, nombre, edad);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return empleados;
    }

    public ArrayList<Empleado> consultaUpdate(String name,String newName,int edad){
        ArrayList<Empleado> empleados = new ArrayList<>();
        try{
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            empleados = empleadoDAO.updateTable(name,newName,edad);
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return empleados;
    }

    public ArrayList<Empleado> mostrarMenoresDeEdad(){
        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            empleados = empleadoDAO.busquedaMenoresEdad();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return empleados;
    }

    public ArrayList<Empleado> mostrarMayoresDeEdad(){
        ArrayList<Empleado> empleados = new ArrayList<>();
        try {
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            empleados = empleadoDAO.busquedaMayoresEdad();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return empleados;
    }
}
