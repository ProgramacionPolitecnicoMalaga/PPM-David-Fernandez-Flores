package com.politecnico.vista;

import com.politecnico.datasend.DataTransfer;
import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.event.*;

public class
CreateDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtTitulo;
    private JTextField txtNombre;
    private JTextField txtTexto;
    private JTextField txtTema;
    private JTextField txtFecha;
    private JComboBox cmbTema;
    private DataTransfer data;
    private boolean consulta = false;

    public CreateDialog(DataTransfer data) {
        this.data = data;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        data.put("titulo",txtTitulo.getText());
        data.put("nombre",txtNombre.getText());
        data.put("tema",cmbTema.getItemAt(cmbTema.getSelectedIndex()));
        data.put("fecha",txtFecha.getText());
        data.put("texto",txtTexto.getText());
        consulta = true;
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
    public void mostrar(){
        setVisible(true);
    }
    public boolean getConsultaOK(){
        return consulta;
    }

    private void createUIComponents() {
        cmbTema = new JComboBox();
        cmbTema.addItem("IT");
        cmbTema.addItem("Desarrollo");
        cmbTema.addItem("Mantenimiento");
        cmbTema.addItem("General");
    }
}
