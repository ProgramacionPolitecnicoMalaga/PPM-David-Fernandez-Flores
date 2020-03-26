import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {

    public ArrayList<Trabajador> getEmpleados(){
        ArrayList<Trabajador> listaEmpleados = new ArrayList<>();
        try {
            Consultas consult = new Consultas();
            listaEmpleados =  consult.getTrabajadores();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEmpleados;
    }

    public ArrayList<Trabajador> getTrabajadorAEW(){
        ArrayList<Trabajador> list = new ArrayList<>();
        try{
            Consultas consult = new Consultas();
            list = consult.getAEW();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Trabajador> getTrabajadorWWE(){
        ArrayList<Trabajador> list = new ArrayList<>();
        try{
            Consultas cons = new Consultas();
            list = cons.getWWE();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Trabajador> getTrabajadorNJPW(){
        ArrayList<Trabajador> list = new ArrayList<>();
        try{
            Consultas cons = new Consultas();
            list = cons.getNJPW();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Trabajador> getTrabajadorOtra(){
        ArrayList<Trabajador> list = new ArrayList<>();
        try{
            Consultas cons = new Consultas();
            list = cons.getOtros();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Trabajador> insert(int id, String name, String empresa){
        ArrayList<Trabajador> list = new ArrayList<>();
        try{
            Consultas cons = new Consultas();
            list = cons.realizarInserccion(id, name, empresa);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Trabajador> update(String name, String newName, String empresa){
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        try{
            Consultas consulta = new Consultas();
            trabajadores = consulta.realizarModificacion(name, newName, empresa);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return trabajadores;
    }
    public ArrayList<Trabajador> borrar(String name){
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        try{
            Consultas consulta = new Consultas();
            trabajadores = consulta.realizarDeleccion(name);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return trabajadores;
    }
    public int contar(String empresa){
        int numeroTotal = 0;
        try {
            Consultas consulta = new Consultas();
            numeroTotal = consulta.contar(empresa);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return numeroTotal;
    }
    public int contar(){
        int numeroTotal = 0;
        try {
            Consultas consulta = new Consultas();
            numeroTotal = consulta.contarTodos();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return numeroTotal;
    }
    public int contarOtros(){
        int numeroTotal = 0;
        try {
            Consultas consulta = new Consultas();
            numeroTotal = consulta.contarOtros();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return numeroTotal;
    }

}
