import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {

    private Connection conn;
    private final static LectorCredenciales credenciales = new LectorCredenciales();
    private final static String url = "jdbc:mysql://"+ credenciales.getHost()+"/"+credenciales.getDataBase();
    private final static String user = credenciales.getUsuario();
    private final static String password = credenciales.getContraseña();

    public DBConn() throws SQLException{
        conn = DriverManager.getConnection(url,user,password);
    }

    public Connection getConnection(){
        return conn;
    }

    public ResultSet read(String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeQuery();
    }
    public int crud (String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeUpdate();
    }
}
