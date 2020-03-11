import com.politecnicomalaga.controlador.ControladorEmpleado;
import com.politecnicomalaga.dao.DBConn;
import com.politecnicomalaga.dao.EmpleadoDAO;
import com.politecnicomalaga.modelo.Empleado;
import com.politecnicomalaga.vista.VistaEmpleados;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("EMPLEADOS");
        ControladorEmpleado controladorEmpleado = new ControladorEmpleado();
        frame.setContentPane(new VistaEmpleados(controladorEmpleado).getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);







       /* try{
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            ArrayList<Empleado> listaEmpleados = empleadoDAO.buscarPorPatron("io");

            for (Empleado empleado: listaEmpleados){
                System.out.println(empleado.getNombre());
            }

            Empleado empleado = new Empleado(5,"David Fernández Flores",20);
            empleadoDAO.crear(empleado);


        } catch (SQLException e){
            e.printStackTrace();
        }
    }*/
    }
}
