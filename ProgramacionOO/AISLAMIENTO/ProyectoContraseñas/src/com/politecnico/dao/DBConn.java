package com.politecnico.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
    Connection conn;
    private static LectorCredenciales credenciales = new LectorCredenciales();
    private static final String url = "jdbc:mysql://"+ credenciales.getHost() + "/" + credenciales.getDataBase();
    private static final String user = credenciales.getUser();
    private static final String pass = credenciales.getPass();

    public DBConn() throws SQLException {
        conn = DriverManager.getConnection(url,user,pass);
    }
    public Connection getConnection(){
        return conn;
    }
    public ResultSet read (String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeQuery();
    }
    public int CRUD (String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeUpdate();
    }
}
