package dao;

import modelo.Credencial;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasDAO {

    private DBConn conn;

    public ConsultasDAO() throws SQLException{
        conn = new DBConn();
    }

    public ArrayList<Credencial> getCredenciales() throws SQLException{
        ArrayList<Credencial> credenciales = new ArrayList<>();
        ResultSet r = conn.read("SELECT * FROM credenciales");
        while(r.next()){
            credenciales.add(new Credencial(r.getString("nombre"),r.getString("password"),r.getString("hash"),r.getString("algoritmo"),r.getString("salt")));
        }
        return credenciales;
    }

    public ArrayList<String> getNombres() throws SQLException{
        ArrayList<String> nombres = new ArrayList<>();
        ResultSet r = conn.read("SELECT nombre FROM credenciales");
        while (r.next()){
            nombres.add(r.getString("nombre"));
        }
        return nombres;
    }

    public String getSalt(String nombre) throws SQLException {
        String salt = "";
        ResultSet r = conn.read("SELECT salt FROM credenciales WHERE nombre = '"+nombre+"'");
        while (r.next()){
            salt = r.getString("salt");
        }
        return salt;
    }

    public String getHash(String nombre) throws SQLException {
        String hash = "";
        ResultSet r = conn.read("SELECT hash FROM credenciales WHERE nombre = '"+nombre+"'");
        while (r.next()){
            hash = r.getString("hash");
        }
        return hash;
    }

    public String getAlg(String nombre) throws SQLException{
        String alg = "";
        ResultSet r = conn.read("SELECT algoritmo FROM credenciales WHERE nombre = '"+nombre+"'");
        while (r.next()){
            alg = r.getString("algoritmo");
        }
        return alg;
    }

    public ArrayList<Credencial> insercion(Credencial credencial) throws SQLException{
        ArrayList<Credencial> credenciales = new ArrayList<>();
        int res = crear(credencial);
        credenciales = getCredenciales();
        return credenciales;
    }

    public int crear(Credencial cr) throws SQLException{
        return create(cr.getNombre(),cr.getHash(),cr.getAlgoritmo(),cr.getSalt(),cr.getContraseña());
    }
    public int create(String nom,String hash,String alg,String salt,String pass) throws SQLException{
        return conn.crud("INSERT INTO credenciales(nombre, hash, algoritmo, salt,password) VALUES ('"+nom+"','"+hash+"','"+alg+"','"+salt+"','"+pass+"')");
    }

}
