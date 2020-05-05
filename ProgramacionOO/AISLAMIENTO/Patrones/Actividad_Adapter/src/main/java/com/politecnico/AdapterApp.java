package com.politecnico;

import com.politecnico.vista.VistaPrincipal;

import javax.swing.*;

public class AdapterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion de Custom JTable");
        frame.setContentPane(new VistaPrincipal().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
