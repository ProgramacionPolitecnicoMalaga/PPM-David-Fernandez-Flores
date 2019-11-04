import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Area_Rectangulo {
    private JPanel Panel;
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtDatos;
    private JTextField txtArea;
    private JButton butAñadir;
    private JLabel LBase;
    private JLabel LAltura;
    private JLabel LDatos;
    private JLabel LArea;
    private JButton butEmpiece;

    static float[] base_altura = new float[2];
    static float area;
    private int k = 0;


    public Area_Rectangulo() {
        butAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                showDatos();
                base_altura[0] = Float.parseFloat(txtBase.getText());
                base_altura[1] = Float.parseFloat(txtAltura.getText());

                area = base_altura[0] * base_altura[1];
                txtArea.setText(String.valueOf(area));
            }
        });
        butEmpiece.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtBase.setEnabled(true);
                txtAltura.setEnabled(true);
                txtDatos.setEnabled(true);
                txtArea.setEnabled(true);
            }
        });
    }

        public static void main(String[] args) {
            JFrame frame = new JFrame("AREA_RECTANGULO");
            frame.setContentPane(new Area_Rectangulo().Panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

        private void showDatos(){
        String strDatos;
            strDatos = (" " + base_altura[0] + " - " + base_altura[1]);
            txtDatos.setText(strDatos);
        }
}