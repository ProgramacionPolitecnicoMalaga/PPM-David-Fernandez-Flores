package com.politecnico.vista;

import com.politecnico.controlador.Controlador;
import com.politecnico.datasend.DataTransfer;
import com.politecnico.datasend.DataTransferItem;
import com.politecnico.modelo.Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaPrincipal {
    private JPanel pnlPrinc;
    private JList lstItem;
    private DefaultListModel<Item> listModel;
    private JButton btnNew;
    private JButton btnDelete;
    private Controlador controlador = new Controlador();

    public VentanaPrincipal() {
        actualizarLista(controlador.getItems());
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DataTransfer data = new DataTransfer();
                CreateDialog create = new CreateDialog(data);
                create.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                create.pack();
                create.mostrar();
                Item item = DataTransferItem.transformar(data);
                if (create.getConsultaOK()){
                actualizarLista(controlador.crear(item));
                }
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (lstItem.isSelectedIndex(lstItem.getSelectedIndex())) {
                    Item item = (Item) lstItem.getSelectedValue();
                    int res = JOptionPane.showConfirmDialog(SwingUtilities.getRoot((Component)actionEvent.getSource()),"¿ Seguro que desea borrarlo ?");
                    if (res == JOptionPane.OK_OPTION){
                    actualizarLista(controlador.borrar(item));
                    }
                }
            }
        });
    }

    public JPanel getPanel() {
        return pnlPrinc;
    }

    public void actualizarLista(ArrayList<Item> lista) {
        if (!lista.isEmpty()) {
            listModel.clear();
            for (int i = 0; i < lista.size(); i++) {
                listModel.addElement(lista.get(i));
            }
        }
    }

    private void createUIComponents() {
        lstItem = new JList();
        listModel = new DefaultListModel<Item>();
        lstItem.setModel(listModel);
        lstItem.setCellRenderer(new RenderItem());
    }
}

