package vista;

import modelo.Credencial;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class NameRender implements ListCellRenderer<Credencial> {
    private JPanel pnlMain;
    private JPanel pnlNombre;
    private JLabel lblNombre;

    @Override
    public Component getListCellRendererComponent(JList<? extends Credencial> jList, Credencial credencial, int i, boolean b, boolean b1) {
        Border borde = BorderFactory.createLineBorder(Color.BLACK);
        lblNombre.setText(credencial.getNombre());
        pnlMain.setBorder(borde);
        return pnlMain;
    }
}
