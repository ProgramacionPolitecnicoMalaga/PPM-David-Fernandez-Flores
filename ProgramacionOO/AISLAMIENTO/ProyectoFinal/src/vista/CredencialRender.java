package vista;

import modelo.Credencial;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.ImageObserver;

public class CredencialRender implements ListCellRenderer<Credencial> {
    private static final String fileCorrecta = "C:\\Users\\usuario\\IdeaProjects\\ProyectoFinal\\resources\\correct.png";
    private static final String fileErronea = "C:\\Users\\usuario\\IdeaProjects\\ProyectoFinal\\resources\\error.png";
    private JPanel pnlMain;
    private JPanel pnlExterior;
    private JLabel lblNombre;
    private JPanel pnlNombre;
    private JPanel pnlContraseña;
    private JLabel lblContraseña;
    private JPanel pnlImagen;
    private JLabel lblImagen;
    private JLabel lblSalt;
    private JPanel pnlSalt;
    private JLabel lblHash;
    private JPanel pnlHash;
    private JLabel lblAlgoritmo;
    private boolean imagen;

    @Override
    public Component getListCellRendererComponent(JList<? extends Credencial> jList, Credencial credencial, int i, boolean b, boolean hasFocus) {
        Border borde = BorderFactory.createLineBorder(Color.BLACK);
        lblNombre.setText(credencial.getNombre());
        lblContraseña.setText(credencial.getContraseña());
        lblAlgoritmo.setText(credencial.getAlgoritmo());
        lblSalt.setText(credencial.getSalt());
        lblHash.setText(credencial.getHash());
        imagen = RegisterDialog.getVerifTrue();
        pnlMain.setBorder(borde);

        if (hasFocus){
            pnlExterior.setBackground(Color.GRAY);
        }
        else {
            pnlExterior.setBackground(Color.LIGHT_GRAY);
        }

        if (imagen){
            lblImagen.setIcon(new ImageIcon(fileCorrecta));
        }
        else{
            lblImagen.setIcon(new ImageIcon(fileErronea));
        }

        return pnlMain;
    }
}
