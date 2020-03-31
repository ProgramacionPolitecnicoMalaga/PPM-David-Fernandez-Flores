import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Consultas {

    private DBConn conn;

    public Consultas() throws SQLException {
        conn = new DBConn();
    }

    public ArrayList<Trabajador> getTrabajadores() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM trabajadores ORDER BY nombre ASC");
        ArrayList<Trabajador> luchadores = new ArrayList<>();
        while (result.next()){
            luchadores.add(new Trabajador(result.getInt("Id"),result.getString("nombre"),result.getString("empresa")));
        }
        return luchadores;
    }

    public ArrayList<Trabajador> getAEW() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM trabajadores WHERE empresa = 'AEW'");
        ArrayList<Trabajador> luchadoresAEW = new ArrayList<>();
        while (result.next()){
            luchadoresAEW.add(new Trabajador(result.getInt("Id"),result.getString("nombre"),result.getString("empresa")));
        }
        return luchadoresAEW;
    }
    public ArrayList<Trabajador> getWWE() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM trabajadores WHERE empresa = 'WWE'");
        ArrayList<Trabajador> luchadoresAEW = new ArrayList<>();
        while (result.next()){
            luchadoresAEW.add(new Trabajador(result.getInt("Id"),result.getString("nombre"),result.getString("empresa")));
        }
        return luchadoresAEW;
    }
    public ArrayList<Trabajador> getNJPW() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM trabajadores WHERE empresa = 'NJPW'");
        ArrayList<Trabajador> luchadoresAEW = new ArrayList<>();
        while (result.next()){
            luchadoresAEW.add(new Trabajador(result.getInt("Id"),result.getString("nombre"),result.getString("empresa")));
        }
        return luchadoresAEW;
    }
    public ArrayList<Trabajador> getOtros() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM trabajadores WHERE empresa NOT IN('WWE','AEW','NJPW')");
        ArrayList<Trabajador> luchadoresOtro = new ArrayList<>();
        while (result.next()){
            luchadoresOtro.add(new Trabajador(result.getInt("Id"),result.getString("nombre"),result.getString("empresa")));
        }
        return luchadoresOtro;
    }
    public int create (String nombre,String empresa) throws SQLException {
        return conn.crud("INSERT INTO trabajadores(nombre, empresa) VALUES ('"+nombre+"','"+empresa+"')");
    }
    public int create (Trabajador empleado) throws SQLException {
        return create(empleado.getName(),empleado.getEmpresa());
    }
    public ArrayList<Trabajador> realizarInserccion(int id,String name, String empresa) throws SQLException{
        Trabajador trabajador = new Trabajador(id,name,empresa);
        int res = create(trabajador);
        ArrayList<Trabajador> trabajadores = getTrabajadores();
        return trabajadores;
    }
    public ArrayList<Trabajador> realizarModificacion(String name,String newName,String newEmpresa) throws SQLException{
        int result = conn.crud("UPDATE trabajadores SET nombre='"+newName+"',empresa='"+newEmpresa+"' WHERE nombre='"+name+"'");
        ArrayList<Trabajador> list = getTrabajadores();
        return list;
    }
    public ArrayList<Trabajador> realizarDeleccion(String nombre) throws SQLException{
        int result = conn.crud("DELETE FROM trabajadores WHERE nombre = '"+nombre+"'");
        ArrayList<Trabajador> list = getTrabajadores();
        return list;
    }
    public int contar(String empresa) throws SQLException{
        int total = 0;
        ResultSet result = conn.read("SELECT COUNT(nombre) AS total FROM trabajadores WHERE empresa = '"+empresa+"'");
        while (result.next()){
            total = result.getInt("total");
        }
        return total;
    }
    public int contarTodos() throws SQLException{
        int total = 0;
        ResultSet result = conn.read("SELECT COUNT(nombre) AS total FROM trabajadores");
        while (result.next()){
            total = result.getInt("total");
        }
        return total;
    }
    public int contarOtros() throws SQLException{
        int total = 0;
        ResultSet result = conn.read("SELECT COUNT(nombre) AS total FROM trabajadores WHERE empresa NOT IN('AEW','NJPW','WWE')");
        while (result.next()){
            total = result.getInt("total");
        }
        return total;
    }
}
