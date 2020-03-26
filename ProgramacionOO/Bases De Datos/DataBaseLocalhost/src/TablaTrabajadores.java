import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TablaTrabajadores {
    private JPanel panelEmpresa;
    private JTable tableTrabajadores;
    private JButton btnWWE;
    private JButton btnAEW;
    private JButton btnNJPW;
    private JButton btnOtras;
    private JButton btnTodos;
    private JTextField txtPatronBusca;
    private JButton btnBuscar;
    private JButton btnInsert;
    private JButton btnModificar;
    private JButton btnBorrar;
    private JTextField txtTotal;
    private JLabel lblTotal;
    private Controlador controlador;

    public TablaTrabajadores(Controlador controlador){
        this.controlador = controlador;
        actualizarTabla(controlador.getEmpleados());
        //style();

        btnTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Trabajador> lista = controlador.getEmpleados();
                actualizarTabla(lista);
                txtTotal.setText(String.valueOf(controlador.contar()));
            }
        });

        btnAEW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Trabajador> lista = controlador.getTrabajadorAEW();
                actualizarTabla(lista);
                txtTotal.setText(String.valueOf(controlador.contar("AEW")));
            }
        });

        btnWWE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Trabajador> lista = controlador.getTrabajadorWWE();
                actualizarTabla(lista);
                txtTotal.setText(String.valueOf(controlador.contar("WWE")));
            }
        });
        btnNJPW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Trabajador> lista = controlador.getTrabajadorNJPW();
                actualizarTabla(lista);
                txtTotal.setText(String.valueOf(controlador.contar("NJPW")));
            }
        });
        btnOtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Trabajador> lista = controlador.getTrabajadorOtra();
                actualizarTabla(lista);
                txtTotal.setText(String.valueOf(controlador.contarOtros()));
            }
        });
        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CreationDialog cr = new CreationDialog();
                cr.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                cr.pack();
                cr.aparecerDialogo();
                JOptionPane.showMessageDialog(SwingUtilities.getRoot((Component) actionEvent.getSource()),""+cr.getNombreLuchador()+" será creado en breve...");
                ArrayList<Trabajador> trabajadores = controlador.insert(0,cr.getNombreLuchador(),cr.getEmpresa());
                actualizarTabla(trabajadores);
            }
        });
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DeleteDialog seleccion = new DeleteDialog();
                CreationDialog update = new CreationDialog();
                seleccion.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                update.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                seleccion.pack();
                update.pack();
                seleccion.aperturaDialogo();
                update.aparecerDialogo();
                ArrayList<Trabajador> trabajadores = controlador.update(seleccion.getNombreSeleccionado(),update.getNombreLuchador(),update.getEmpresa());
                actualizarTabla(trabajadores);
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DeleteDialog borrado = new DeleteDialog();
                borrado.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                borrado.pack();
                borrado.aperturaDialogo();
                ArrayList<Trabajador> trabajadores = controlador.borrar(borrado.getNombreSeleccionado());
                actualizarTabla(trabajadores);
            }
        });
    }

    public void actualizarTabla(ArrayList<Trabajador> listaEmpleados){
        DefaultTableModel model = (DefaultTableModel) tableTrabajadores.getModel();
        model.setRowCount(0);
        for (Trabajador empleado: listaEmpleados){
            Object[] row = {empleado.getId(),empleado.getName(),empleado.getEmpresa()};
            model.addRow(row);
        }
    }

    private void createUIComponents() {
        tableTrabajadores = new JTable();
        Object[] columnas = {"ID","LUCHADOR","EMPRESA"};
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnas);
        tableTrabajadores.setModel(tableModel);
    }
    public JPanel getPanel(){
        return panelEmpresa;
    }
}
