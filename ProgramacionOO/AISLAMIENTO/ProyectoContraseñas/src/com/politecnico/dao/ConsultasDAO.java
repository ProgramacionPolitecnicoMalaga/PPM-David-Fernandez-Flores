package com.politecnico.dao;

import com.politecnico.algoritmo.GestorAlgoritmo;
import com.politecnico.modelo.Credencial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasDAO {
    private DBConn conn;
    private GestorAlgoritmo gestorAlg = new GestorAlgoritmo();

    public ConsultasDAO() throws SQLException {
        conn = new DBConn();
    }
    public ArrayList<Credencial> getNombres() throws SQLException{
        ResultSet res = conn.read("SELECT * FROM credenciales");
        ArrayList<Credencial> credenciales = new ArrayList<>();
        while (res.next()){
            credenciales.add(new Credencial(res.getString("nombre"),"0",res.getString("algoritmo"),res.getString("hash"),res.getString("salt")));
        }
        return credenciales;
    }
    public int create (Credencial cr) throws SQLException {
        return conn.CRUD("INSERT INTO credenciales(nombre, hash, algoritmo, salt) VALUES ('"+cr.getNombre()+"','"+cr.getHash()+"','"+cr.getAlgoritmo()+"','"+cr.getSalt()+"')");
    }
    /*public int create (Credencial credencial) throws SQLException {
        return create(credencial.getNombre(),credencial.getHash(),credencial.getAlgoritmo());
    }*/
    public ArrayList<Credencial> creacion(Credencial credencial) throws SQLException{
        int res = create(credencial);
        ArrayList<Credencial> credenciales = getNombres();
        return credenciales;
    }

}
