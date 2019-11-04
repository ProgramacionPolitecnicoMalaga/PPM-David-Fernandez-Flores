import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba_Visual {
    private JLabel LAltura;
    private JTextField TxtAltura;
    private JButton ButtonAñadir;
    private JTextField TxtShowAlturas;
    private JTextField TxtMedias;
    private JLabel LMedias;
    private JLabel LShowAlturas;
    private JPanel Panel;


    static float[] alturas = new float[5];
        static float promedio = 0;
        private int k = 0;

        public Prueba_Visual() {
            ButtonAñadir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!TxtAltura.getText().equals("")) {
                        if (k < alturas.length) {
                            alturas[k] = Float.parseFloat(TxtAltura.getText());
                            k++;
                            showAlturas();
                            TxtMedias.setText(String.valueOf(media()));
                            TxtAltura.setText("");
                            TxtAltura.grabFocus();
                            if (k == alturas.length) {
                                ButtonAñadir.setEnabled(false);
                            }
                        }
                    }
                }
            });
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Alturas");
            frame.setContentPane(new Prueba_Visual().Panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
        private void showAlturas() {
            String strAlturas = "";
            for (int i = 0; i < alturas.length; i++) {
                strAlturas += String.valueOf(alturas[i]);
                if (i < 4) {
                    strAlturas += " - ";
                }
            }
            TxtShowAlturas.setText(strAlturas);
        }

        private float media() {
            float mediaAlturas = 0;
            for (int i = 0; i < alturas.length; i++) {
                mediaAlturas += alturas[i];
            }
            return mediaAlturas / alturas.length;
        }
    }

