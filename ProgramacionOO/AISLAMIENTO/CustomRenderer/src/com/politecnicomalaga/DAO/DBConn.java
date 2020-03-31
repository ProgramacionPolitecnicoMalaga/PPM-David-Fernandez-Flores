package com.politecnicomalaga.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {

    Connection conn;
    private static final LectorCredenciales credenciales = new LectorCredenciales();
    private static final String url = "jdbc:mysql://"+ credenciales.getHost()+"/"+credenciales.getDatabase();
    private static final String user = credenciales.getUser();
    private static final String pass = credenciales.getPass();

    public DBConn() throws SQLException {
        conn = DriverManager.getConnection(url,user,pass);
    }

    public ResultSet read(String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeQuery();
    }
    public int crud(String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeUpdate();
    }
}
