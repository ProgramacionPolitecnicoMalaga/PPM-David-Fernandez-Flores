import builder.Builder;
import builder.BuilderDirector;
import modelo.ServPack;
import vista.SelectorDeServicio;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Selección de Servicio Hotel"); // Marco de la aplicación.
        frame.setContentPane(new SelectorDeServicio().getPanel()); // Alturas: nombre del Form enmarcado y de su clase correspondiente.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = 125;
        int width = 360;
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width,125));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
