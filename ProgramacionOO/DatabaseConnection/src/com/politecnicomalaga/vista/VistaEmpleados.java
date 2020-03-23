package com.politecnicomalaga.vista;

import com.politecnicomalaga.controlador.ControladorEmpleado;
import com.politecnicomalaga.modelo.Empleado;
import com.politecnicomalaga.vista.dialogos.CreateDialog;
import com.politecnicomalaga.vista.dialogos.DeleteDialog;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VistaEmpleados {
    private JTextField txtPatron;
    private JButton btnBuscar;
    private JTable tblEmpleados;
    private JPanel pnlEmpleado;
    private JLabel lblPatron;
    private JButton btnInsertar;
    private JButton btnBorrar;
    private JButton btnUpdate;
    private JButton btnMayores;
    private JButton btnMenores;
    private JButton btnTodos;
    private ControladorEmpleado controlador;
    private JButton[] buttons;

    public void agregarBotones(){
        buttons = new JButton[]{btnMenores, btnMayores, btnBuscar, btnBorrar, btnInsertar, btnUpdate, btnTodos};
    }

    public void style(){
        agregarBotones();
        for (int i=0; i<buttons.length;i++){
            buttons[i].setBackground(Color.decode("#b3b3ff"));
            buttons[i].setForeground(Color.BLACK);
        }
        tblEmpleados.setBackground(Color.decode("#e6e6ff"));
    }

    public VistaEmpleados(ControladorEmpleado controlador){
        this.controlador = controlador;
        actualizarTabla(controlador.getEmpleados());
        style();
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String patron = txtPatron.getText();
                ArrayList<Empleado> lista = controlador.getBusquedaPatron(patron);
                actualizarTabla(lista);
            }
        });

        btnTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArrayList<Empleado> lista = controlador.getEmpleados();
                actualizarTabla(lista);
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DeleteDialog delete = new DeleteDialog();
                delete.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                delete.pack();
                String nombreModificado = delete.getNombreEscrito();
                int resp = JOptionPane.showConfirmDialog(SwingUtilities.getRoot((Component) actionEvent.getSource()),"¿ Estas seguro de que desea borrar: "+nombreModificado+" ?");
                if (resp == JOptionPane.OK_OPTION){
                    ArrayList<Empleado> listaEmpleados = controlador.getListaTrasBorrado(nombreModificado);
                    actualizarTabla(listaEmpleados);
                }
            }
        });

        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CreateDialog insert = new CreateDialog();
                insert.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                insert.pack();
                insert.crearDialogo();
                int id = 0;
                String nombre = insert.getNombre();
                int edad = insert.getEdad();
                JOptionPane.showMessageDialog(SwingUtilities.getRoot((Component) actionEvent.getSource()),""+nombre+" será creado en breve...");
                ArrayList<Empleado> empleados = controlador.createInserction(id, nombre, edad);
                actualizarTabla(empleados);
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DeleteDialog update = new DeleteDialog();
                update.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                update.pack();
                String nombreBusqueda = update.getNombreEscrito();
                CreateDialog create = new CreateDialog();
                create.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                create.pack();
                ArrayList<Empleado> empleados = controlador.consultaUpdate(nombreBusqueda,create.getNombre(),create.getEdad());
                actualizarTabla(empleados);
            }
        });
        btnMenores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                actualizarTabla(controlador.mostrarMenoresDeEdad());
            }
        });
        btnMayores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                actualizarTabla(controlador.mostrarMayoresDeEdad());
            }
        });
    }

    public void actualizarTabla(ArrayList<Empleado> listaEmpleados){
        DefaultTableModel model = (DefaultTableModel) tblEmpleados.getModel();
        model.setRowCount(0);
        for (Empleado empleado: listaEmpleados){
            Object[] row = {empleado.getId(),empleado.getNombre(),empleado.getEdad()};
            model.addRow(row);
        }
    }

    private void createUIComponents() {
        tblEmpleados = new JTable();
        Object[] columnas = {"id","nombre","edad"};
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnas);
        tblEmpleados.setModel(tableModel);
    }

    public JPanel getPanel(){
        return pnlEmpleado;
    }
}
