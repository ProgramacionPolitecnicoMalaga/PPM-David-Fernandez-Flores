package com.politecnico.vista;

import com.politecnico.algoritmo.GestorAlgoritmo;
import com.politecnico.modelo.Credencial;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RenderCredencial implements ListCellRenderer<Credencial> {
    private static final String filenameCorrecta = "resources/correct.png";
    private static final String filenameErronea = "resources/error.png";
    private ImageIcon icon;
    private JLabel lblnombre;
    private JLabel lblImagen;
    private JLabel lblContraseña;
    private JLabel lblHash;
    private JLabel lblAlgoritmo;
    private JPanel pnlRender;
    private JPanel pnlImagen;
    private JPanel pnlInterior;
    private Image imgCorrecta;
    private Image imgErronea;
    private GestorAlgoritmo gestor;

    @Override
    public Component getListCellRendererComponent(JList<? extends Credencial> jList, Credencial credencial, int i, boolean isSelected, boolean CellHasFocus) {
        gestor = new GestorAlgoritmo();
        lblnombre.setText(credencial.getNombre());
        lblContraseña.setText(credencial.getContraseña());
        String hash = gestor.getHash(credencial.getContraseña(),credencial.getAlgoritmo());
        credencial.setHash(hash);
        lblHash.setText(credencial.getHash());
        lblAlgoritmo.setText(credencial.getAlgoritmo());
        return pnlRender;
    }

    private void createUIComponents() {
        // TODO : Create Components bla bla bla.
    }
}
