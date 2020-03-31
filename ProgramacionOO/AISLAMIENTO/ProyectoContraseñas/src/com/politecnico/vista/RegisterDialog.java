package com.politecnico.vista;

import javax.swing.*;
import java.awt.event.*;

public class RegisterDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtNombre;
    private JComboBox cbAlgoritmo;
    private JLabel lblNombre;
    private JLabel lblContraseña;
    private JLabel lblAlgoritmo;
    private JTextField txtPassword;
    //private JPasswordField pswPassword;
    private JTextField txtHash;
    private DataTransfer data;

    public RegisterDialog(DataTransfer data) {
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
        // add your code here
        Object item = cbAlgoritmo.getItemAt(cbAlgoritmo.getSelectedIndex());
        data.put("nombre",txtNombre.getText());
        data.put("pass",txtPassword.getText());
        data.put("algoritmo",(String) item);
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
    public void mostrar(){
        setVisible(true);
    }
    public String getAlgoritmoSelected(){
        return String.valueOf(cbAlgoritmo.getSelectedItem());
    }

    private void createUIComponents() {
        cbAlgoritmo = new JComboBox();
        cbAlgoritmo.addItem("SHA-512");
        cbAlgoritmo.addItem("BCrypt");
    }
}
