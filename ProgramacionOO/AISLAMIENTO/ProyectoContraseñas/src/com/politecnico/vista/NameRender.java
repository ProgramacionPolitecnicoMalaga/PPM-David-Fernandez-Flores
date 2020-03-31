package com.politecnico.vista;

import com.politecnico.modelo.Credencial;

import javax.swing.*;
import java.awt.*;

public class NameRender implements ListCellRenderer<Credencial> {
    private JPanel pnlName;
    private JLabel lblName;

    @Override
    public Component getListCellRendererComponent(JList<? extends Credencial> jList, Credencial credencial, int i, boolean b, boolean b1) {
        lblName.setText(credencial.getNombre());
        return pnlName;
    }
}
