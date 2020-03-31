package com.politecnicomalaga;

import com.politecnicomalaga.DAO.controlador.Controlador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.time.LocalDate;
import java.util.ArrayList;

public class VentanaPrincipal {
    private JPanel pnlMain;
    private JButton btnEliminar;
    private JButton btnNuevo;
    private JList lstItems;
    private Controlador controlador = new Controlador();

    public VentanaPrincipal(){

        DefaultListModel<Item> lstModel = new DefaultListModel<>();
        for (int i=0;i<controlador.getItems().size();i++){
            lstModel.addElement(controlador.getItems().get(i));
        }

        btnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CrearEntrada insert = new CrearEntrada();
                insert.setLocationRelativeTo(SwingUtilities.getRoot((Component) actionEvent.getSource()));
                insert.pack();
                actualizarList(controlador.insert(new Item(insert.getAutor(),insert.getFecha(),insert.getTexto())));
            }
        });



        lstItems.setModel(lstModel);
        lstItems.setCellRenderer(new ItemPanel());

        lstItems.setFixedCellWidth(pnlMain.getWidth());

        lstItems.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Estiramos la celda a 1000 px de altura
                lstItems.setFixedCellHeight(1000);
                // Asignamos el valor -1 para que se recalcule la altura
                lstItems.setFixedCellHeight(-1);
            }
        });
    }

    public void actualizarList(ArrayList<Item> items){
        DefaultListModel<Item> model = (DefaultListModel) lstItems.getModel();
        model.setSize(0);
        for (Item item: items){
            //Object row = {item.getAutor(),item.getFecha(),item.getTexto()};
            model.addElement(new Item(item.getAutor(),item.getFecha(),item.getTexto()));
        }
    }

    public Container getPanel() {
        return pnlMain;
    }
}
