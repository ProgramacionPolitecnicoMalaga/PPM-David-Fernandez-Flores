package com.politecnico.vista;

import com.politecnico.controlador.Controlador;
import com.politecnico.modelo.Credencial;
import javafx.css.Size;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private DefaultListModel<Credencial> renderModel;
    private DefaultListModel<String> nameList;
    private JPanel pnlMain;
    private JList list;
    private JButton btnRegister;
    private JButton btnVerify;
    private JScrollPane pnlScrollRenders;
    private JScrollPane pnlScrollNombres;
    private JList listNames;
    private JTextArea txaAreaNombres;
    private Controlador controlador = new Controlador();

    public VentanaPrincipal(){
        escrituraNombres();
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DataTransfer data = new DataTransfer();
                RegisterDialog registro = new RegisterDialog(data);
                registro.setLocationRelativeTo(SwingUtilities.getRoot((Component)actionEvent.getSource()));
                registro.pack();
                registro.mostrar();
                Credencial credencial = DataTransferCredenciales.transformar(data);
                controlador.crear(credencial);
                escrituraNombres();
                renderModel.addElement(credencial);
            }
        });
        btnVerify.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DataTransfer data = new DataTransfer();
                RegisterDialog registerDialog = new RegisterDialog(data);
                registerDialog.setLocationRelativeTo(SwingUtilities.getRoot((Component)actionEvent.getSource()));
                registerDialog.pack();
                registerDialog.mostrar();
                Credencial credencial = DataTransferCredenciales.transformar(data);
                renderModel.addElement(credencial);
            }
        });
    }

    public JPanel getPanel(){
        return pnlMain;
    }

    public void escrituraNombres(){
        for (int i=0; i<controlador.leerNombres().size(); i++){
            txaAreaNombres.setRows(controlador.leerNombres().size());
            txaAreaNombres.setText(String.valueOf(controlador.leerNombres().get(i)));
        }
    }

    private void createUIComponents() {
        txaAreaNombres = new JTextArea();
        txaAreaNombres.setLineWrap(true);
        list = new JList();
        listNames = new JList();
        renderModel = new DefaultListModel<>();
        list.setModel(renderModel);
        list.setCellRenderer(new RenderCredencial());
    }
}
