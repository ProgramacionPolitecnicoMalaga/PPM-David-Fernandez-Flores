package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {

    private Connection conn;
    private static LectorENV lc = new LectorENV();
    private static final String url = "jdbc:mysql://"+lc.getHost()+"/"+lc.getDB();
    private static final String user = lc.getUser();
    private static final String pass = lc.getPass();

    public DBConn() throws SQLException{
        conn = DriverManager.getConnection(url,user,pass);
    }
    public ResultSet read(String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeQuery();
    }
    public int crud(String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeUpdate();
    }
}
