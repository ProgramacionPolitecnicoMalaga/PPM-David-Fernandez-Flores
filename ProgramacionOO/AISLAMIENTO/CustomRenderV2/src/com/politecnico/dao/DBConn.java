package com.politecnico.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {

    private Connection conn;
    private static final LectorCredenciales lc = new LectorCredenciales();
    private static final String url = "jdbc:mysql://"+lc.getHost()+"/"+lc.getDataBase();
    private static final String user = lc.getUser();
    private static final String password = lc.getPassword();

    public DBConn() throws SQLException {
        conn = DriverManager.getConnection(url,user,password);
    }
    public Connection getConnection(){
        return conn;
    }
    public ResultSet read (String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeQuery();
    }
    public int crud (String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeUpdate();
    }
}
