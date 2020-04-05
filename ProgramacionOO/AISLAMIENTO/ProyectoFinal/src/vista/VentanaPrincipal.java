package vista;

import controlador.Controlador;
import datasend.DataTransfer;
import datasend.DataTransferCredencial;
import modelo.Credencial;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaPrincipal {
    private JPanel pnlMain;
    private JPanel pnlExterior;
    private JList listVerif;
    private JScrollPane scrollpnlNames;
    private JScrollPane scrollpnlVerif;
    private JButton btnRegister;
    private JButton btnVerify;
    private JTable tblNombres;
    private Controlador controlador = new Controlador();
    private DefaultListModel<Credencial> credencialModel;


    public VentanaPrincipal(){
        actualizarTabla(controlador.getCredenciales());
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DataTransfer data = new DataTransfer();
                CreateDialog create = new CreateDialog(data);
                create.setLocationRelativeTo(SwingUtilities.getRoot((Component)actionEvent.getSource()));
                create.pack();
                create.mostrarDialog();
                Credencial credencial = DataTransferCredencial.transformar(data);
                if (create.getConsultaSi()){
                    controlador.crear(credencial);
                    actualizarTabla(controlador.getCredenciales());
                }
            }
        });
        btnVerify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DataTransfer data = new DataTransfer();
                RegisterDialog verify = new RegisterDialog(data);
                verify.setLocationRelativeTo(SwingUtilities.getRoot((Component)actionEvent.getSource()));
                verify.pack();
                verify.mostrar();
                Credencial credencial = DataTransferCredencial.transformar(data);
                if (verify.getIfVerifica()) {
                    credencialModel.clear();
                    credencialModel.addElement(credencial);
                }
                else{
                    JOptionPane.showMessageDialog(SwingUtilities.getRoot((Component)actionEvent.getSource()),"No se puede verificar nada");
                }
            }
        });
    }

    public void actualizarTabla(ArrayList<Credencial> credenciales){
        DefaultTableModel model = (DefaultTableModel) tblNombres.getModel();
        model.setRowCount(0);
        for (Credencial credencial: credenciales){
            Object[] row = {credencial.getNombre()};
            model.addRow(row);
        }
    }

    public void actualizarModel(ArrayList<Credencial> credenciales){
        for(int i=0; i< credenciales.size(); i++) {
            credencialModel.addElement(credenciales.get(i));
        }
    }

    public JPanel getPanel(){
        return pnlMain;
    }

    private void createUIComponents() {
        scrollpnlNames = new JScrollPane();
        scrollpnlNames.setSize(100,200);
        tblNombres = new JTable();
        Object[] columnas = {"Usuarios"};
        DefaultTableModel tableModel = new DefaultTableModel();

        tableModel.setColumnIdentifiers(columnas);
        tblNombres.setModel(tableModel);
        listVerif = new JList();
        credencialModel = new DefaultListModel<>();
        listVerif.setModel(credencialModel);
        listVerif.setCellRenderer(new CredencialRender());
    }
}
