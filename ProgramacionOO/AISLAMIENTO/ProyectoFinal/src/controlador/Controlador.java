package controlador;

import dao.ConsultasDAO;
import modelo.Credencial;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {

    public ArrayList<Credencial> crear(Credencial cr){
        ArrayList<Credencial> credenciales = new ArrayList<>();
        try {
            ConsultasDAO co = new ConsultasDAO();
            credenciales = co.insercion(cr);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return credenciales;
    }

    public ArrayList<Credencial> getCredenciales(){
        ArrayList<Credencial> credenciales = new ArrayList<>();
        try {
            ConsultasDAO co = new ConsultasDAO();
            credenciales = co.getCredenciales();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return credenciales;
    }

    public ArrayList<String> getNames(){
        ArrayList<String> nombres = new ArrayList<>();
        try{
            ConsultasDAO co = new ConsultasDAO();
            nombres = co.getNombres();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return nombres;
    }

    public String getSalt(String nombre){
        String salt = "";
        try{
            ConsultasDAO co = new ConsultasDAO();
            salt = co.getSalt(nombre);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return salt;
    }

    public String getHash(String nombre){
        String salt = "";
        try{
            ConsultasDAO co = new ConsultasDAO();
            salt = co.getHash(nombre);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return salt;
    }
    public String getAlg(String nombre){
        String salt = "";
        try{
            ConsultasDAO co = new ConsultasDAO();
            salt = co.getAlg(nombre);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return salt;
    }
}
