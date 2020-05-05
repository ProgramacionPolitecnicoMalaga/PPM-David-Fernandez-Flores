package com.politecnico.vista;

import com.politecnico.modelo.ListaPersonas;
import com.politecnico.tableModel.CustomTableModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VistaPrincipal {
    private JPanel pnlMain;
    private JTable tblPersonas;
    private JButton btnAñadir;
    private JButton btnOutPrint;
    private JButton btnDeletion;
    private ListaPersonas listaPersonas;

    public VistaPrincipal(){
        CustomTableModel model = (CustomTableModel) tblPersonas.getModel();
        listaPersonas = ListaPersonas.getInstance();

        btnAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                model.addNewRow();
            }
        });

        btnOutPrint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(listaPersonas);
            }
        });

        btnDeletion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                model.removeRow(tblPersonas.getSelectedRow());
            }
        });

        tblPersonas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE){
                    int conf = JOptionPane.showConfirmDialog(null,"¿Seguro que desea realizar esta operacion?","Borrado",JOptionPane.WARNING_MESSAGE);
                    if (conf == JOptionPane.OK_OPTION){
                        tblPersonas.getCellEditor().stopCellEditing();
                        model.removeRow(tblPersonas.getSelectedRow());
                    }
                }
            }
        });
    }


    public JPanel getPanel(){
        return pnlMain;
    }

    private void createUIComponents() {
        CustomTableModel customModel = new CustomTableModel();
        tblPersonas = new JTable();
        tblPersonas.setModel(customModel);
    }
}
