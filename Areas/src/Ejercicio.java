import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio {
    private JPanel Panel;
    private JLabel LBase;
    private JTextField txtBase;
    private JLabel LAltura;
    private JTextField txtAltura;
    private JLabel LRadio;
    private JTextField txtRadio;
    private JLabel LDatos;
    private JTextField txtDatos;
    private JLabel LArea;
    private JTextField txtArea;
    private JButton butCuadrado;
    private JButton butCirculo;
    private JButton butTriangulo;
    private JButton butRectangulo;
    private JButton butAñadir;
    private JButton butReset;

    static float base, altura, radio;
    static float area = 0;
    static int figura = 0;
    //static int cococha = 12;


    public Ejercicio() {
        butCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                butAñadir.setEnabled(true);
                txtBase.setEnabled(true);
                butRectangulo.setEnabled(false);
                butCirculo.setEnabled(false);
                butTriangulo.setEnabled(false);
                txtAltura.setEnabled(false);
                txtRadio.setEnabled(false);
                altura = 0;
                radio = 0;
                figura = 1;

            }
        });

        butAñadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (figura == 1) {
                    areaCuad();
                }
                if (figura == 2) {
                    areaRect();
                }
                if (figura == 3){
                    areaCirc();
                }
                if (figura == 4){
                    areaTrian();
                }

                txtBase.grabFocus();
                txtAltura.grabFocus();
                txtRadio.grabFocus();
                txtBase.setText("");
                txtAltura.setText("");
                txtRadio.setText("");
                showDatos();
                butAñadir.setEnabled(false);

            }
        });

        butRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                butAñadir.setEnabled(true);
                butCuadrado.setEnabled(false);
                butCirculo.setEnabled(false);
                butTriangulo.setEnabled(false);
                txtBase.setEnabled(true);
                txtAltura.setEnabled(true);
                txtRadio.setEnabled(false);
                radio = 0;
                figura = 2;
            }
        });

        butCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                butAñadir.setEnabled(true);
                butCuadrado.setEnabled(false);
                butRectangulo.setEnabled(false);
                butTriangulo.setEnabled(false);
                txtBase.setEnabled(false);
                txtAltura.setEnabled(false);
                txtRadio.setEnabled(true);
                base = 0;
                altura = 0;
                figura = 3;
            }
        });
        butReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                butAñadir.setEnabled(false);
                butCuadrado.setEnabled(true);
                butRectangulo.setEnabled(true);
                butCirculo.setEnabled(true);
                butTriangulo.setEnabled(true);
                txtBase.setText("");
                txtAltura.setText("");
                txtRadio.setText("");
                txtDatos.setText("");
                txtArea.setText("");
                txtBase.setEnabled(false);
                txtAltura.setEnabled(false);
                txtRadio.setEnabled(false);
            }
        });
        butTriangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                butAñadir.setEnabled(true);
                butCuadrado.setEnabled(false);
                butRectangulo.setEnabled(false);
                butCirculo.setEnabled(false);
                txtBase.setEnabled(true);
                txtAltura.setEnabled(true);
                txtRadio.setEnabled(false);
                radio = 0;
                figura = 4;
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("EJERCICIO_AREAS");
        frame.setContentPane(new Ejercicio().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


    public void showDatos() {
        /*String strDatos = "";
        strDatos += String.valueOf(base) += String.valueOf(radio);
        strDatos += " - ";
        txtDatos.setText(strDatos);*/
        String strDatos;
        /*base = Float.parseFloat(txtBase.getText());
        altura = Float.parseFloat(txtAltura.getText());
        radio = Float.parseFloat(txtRadio.getText());*/
        strDatos = (" " + base + " - " + altura + " - " + radio);
        txtDatos.setText(strDatos);
    }

    public void areaCuad() {
        base = Float.parseFloat(txtBase.getText());
        area = base * base;
        txtArea.setText(String.valueOf(area));
    }

    public void areaRect() {
        base = Float.parseFloat(txtBase.getText());
        altura = Float.parseFloat(txtAltura.getText());
        area = base * altura;
        txtArea.setText(String.valueOf(area));
    }

    public void areaCirc(){
        radio = Float.parseFloat(txtRadio.getText());
        txtArea.setText(String.valueOf(Math.PI * (radio * radio)));
    }

    public void areaTrian(){
        base = Float.parseFloat(txtBase.getText());
        altura = Float.parseFloat(txtAltura.getText());
        area = (base * altura)/2;
        txtArea.setText(String.valueOf(area));
    }
}