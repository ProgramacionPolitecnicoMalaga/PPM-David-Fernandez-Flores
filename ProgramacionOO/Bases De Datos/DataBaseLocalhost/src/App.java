import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        try{
        Consultas consultas = new Consultas();
        System.out.println(consultas.getTrabajadores());

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
