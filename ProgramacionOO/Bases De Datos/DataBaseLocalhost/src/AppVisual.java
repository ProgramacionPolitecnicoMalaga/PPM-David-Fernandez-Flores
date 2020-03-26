import javax.swing.*;

public class AppVisual {
    public static void main(String[] args) {
        JFrame frame = new JFrame("EMPLEADOS");
        /*ImageIcon img = new ImageIcon("bbdd.png");
        frame.setIconImage(img.getImage());*/
        Controlador controlador = new Controlador();
        frame.setContentPane(new TablaTrabajadores(controlador).getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
