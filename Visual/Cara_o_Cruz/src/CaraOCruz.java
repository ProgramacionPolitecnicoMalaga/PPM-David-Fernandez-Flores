import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CaraOCruz {
    private JPanel PanelPrincipal;
    private JPanel LeftPanel;
    private JPanel RightPanel;
    private JButton butTirar;
    private JPanel DownPanel;
    private JTextField txtSetTiradas;
    private JButton butRepetir;
    private JButton butLimpiar;
    private JTextField txtActual;
    private JLabel LActual;
    private JTextField txtRecuentoCara;
    private JLabel LRecuentoCara;
    private JTextField txtTiradas;
    private JLabel LTiradas;
    private JTextField txtRecuentoCruz;
    private JLabel LRecuentoCruz;
    private JTextField txtPorcentajeCruz;
    private JTextField txtPorcentajeCara;
    private JLabel LPorcentajeCara;
    private JLabel LPorcentajeCruz;
    private JLabel LImagen;
    private JButton butInicio;


    DecimalFormat formatoDosDecimales = new DecimalFormat("#.##");


    private int aleatorio;
    public static final int CARA = 0;
    public static final int CRUZ = 1;

    private double tiradasAHacer = 0;
    private int tiradasHechas = 0;
    private int contCara = 0;
    private int contCruz = 0;
    private double porcentajeCara;
    private double porcentajeCruz;

    private String cara = "CARA";
    private String cruz = "CRUZ";

    ImageIcon fotoInicio = new ImageIcon("Foto_inicial.png");
    Image ImagenInicio = fotoInicio.getImage();
    ImageIcon fotoCara = new ImageIcon("cara_moneda.png");
    Image ImagenCara = fotoCara.getImage();
    ImageIcon fotoCruz = new ImageIcon("cruz_moneda.png");
    Image ImagenCruz = fotoCruz.getImage();


    public int ConseguirAleatorio(){
        aleatorio = (int) Math.floor(Math.random()*2);
        return aleatorio;
    }

    public void proporcionarPorcentaje() {
        tiradasAHacer = tiradasHechas;
        porcentajeCara = (contCara / tiradasAHacer) * 100;
        porcentajeCruz = (contCruz / tiradasAHacer) * 100;
    }

    public void UnaTirada() {
        if (aleatorio == CARA) {
            txtActual.setText("");
            txtActual.setText(cara);
            LImagen.setIcon(new ImageIcon(ImagenCara));
            contCara++;
            tiradasHechas++;
        }

        if (aleatorio == CRUZ) {
            txtActual.setText("");
            txtActual.setText(cruz);
            LImagen.setIcon(new ImageIcon(ImagenCruz));
            contCruz++;
            tiradasHechas++;
        }
    }

        public void EscribirEnPantalla(){
            txtTiradas.setText(String.valueOf(tiradasHechas));
            txtRecuentoCara.setText(String.valueOf(contCara));
            txtRecuentoCruz.setText(String.valueOf(contCruz));
            txtPorcentajeCara.setText(String.valueOf(formatoDosDecimales.format(porcentajeCara))+ " %");
            txtPorcentajeCruz.setText(String.valueOf(formatoDosDecimales.format(porcentajeCruz))+ " %");
        }


    public CaraOCruz() {
        butTirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ConseguirAleatorio();
                UnaTirada();
                proporcionarPorcentaje();
                EscribirEnPantalla();
            }
        });

        butRepetir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                contCara = 0;
                contCruz = 0;
                tiradasHechas = 0;
                double tiradasAHacer = Double.parseDouble(txtSetTiradas.getText());
                
                    for (int i = 0; i < tiradasAHacer; i++) {
                        ConseguirAleatorio();
                        UnaTirada();
                    }
                    proporcionarPorcentaje();
                    EscribirEnPantalla();                 
                }
        });

        butLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                contCara = 0;
                contCruz = 0;
                tiradasAHacer = 0;
                tiradasHechas = 0;
                porcentajeCara = 0;
                porcentajeCruz = 0;
                txtActual.setText("");
                txtSetTiradas.setText("");
                txtTiradas.setText("");
                txtRecuentoCara.setText("");
                txtRecuentoCruz.setText("");
                txtPorcentajeCara.setText("");
                txtPorcentajeCruz.setText("");
                LImagen.setIcon(new ImageIcon(ImagenInicio));
            }
        });
        butInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                LImagen.setIcon(new ImageIcon(ImagenInicio));
                butTirar.setEnabled(true);
                txtSetTiradas.setEnabled(true);
                butRepetir.setEnabled(true);
                butLimpiar.setEnabled(true);
                butInicio.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CARA O CRUZ");
        frame.setContentPane(new CaraOCruz().PanelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

