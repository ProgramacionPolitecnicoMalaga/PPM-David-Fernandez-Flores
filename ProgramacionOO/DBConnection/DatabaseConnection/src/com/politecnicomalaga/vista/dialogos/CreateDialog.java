package com.politecnicomalaga.vista.dialogos;

import javax.swing.*;
import java.awt.event.*;

public class CreateDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblEdad;
    private int id;
    private String nombre;
    private int edad;

    public CreateDialog() {
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
        id = Integer.parseInt(txtId.getText());
        nombre = txtNombre.getText();
        edad = Integer.parseInt(txtEdad.getText());
        setVisible(false);
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public int getId(){
        setVisible(true);
        return id;
    }

    public String getNombre(){
        setVisible(true);
        return nombre;
    }

    public int getEdad(){
        setVisible(true);
        return edad;
    }
}
