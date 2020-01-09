package CalculadoraJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalculadoraVisual {
    private JPanel panelCalculadora;
    private JTextField txtCommandLine;
    private JTabbedPane panelBotones;
    private JButton butNumeroNueve;
    private JButton butResta;
    private JButton butSuma;
    private JButton butNumeroSiete;
    private JButton butNumeroOcho;
    private JButton butMultiplicacion;
    private JButton butNumeroCuatro;
    private JButton butNumeroCinco;
    private JButton butNumeroSeis;
    private JButton butNumeroUno;
    private JButton butNumeroDos;
    private JButton butNumeroTres;
    private JButton butPuntoComa;
    private JButton butNumeroCero;
    private JButton butRaizCuadrada;
    private JButton butDivision;
    private JPanel PanelTablaBotones;
    private JButton butEqual;

    private static final int SUMA = 1;
    private static final int RESTA = 2;
    private static final int MULTIPLICACION = 3;
    private static final int DIVISION = 4;
    private static final int RAIZ = 5;
    private static final int POTENCIA = 6;

    private Operaciones op = new Operaciones();
    private DecimalFormat formateo = new DecimalFormat("####,##");
    private double numerocalculo1=0, numerocalculo2=0, resultado, variableDeAsignacion=0;
    private int operacionARealizar;

    public CalculadoraVisual() {
        butNumeroCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(0));
            }
        });
        butNumeroUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(1));
            }
        });
        butNumeroDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(2));
            }
        });
        butNumeroTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(3));
            }
        });
        butNumeroCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(4));
            }
        });
        butNumeroCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(5));
            }
        });
        butNumeroSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(6));
            }
        });
        butNumeroSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(7));
            }
        });
        butNumeroOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(8));
            }
        });
        butNumeroNueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(String.valueOf(9));
            }
        });
        butSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                operacionARealizar = SUMA;
                txtCommandLine.setText(numerocalculo1+" + ");
            }
        });
        butResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                operacionARealizar = RESTA;
                txtCommandLine.setText(numerocalculo1+" - ");
            }
        });
        butMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                operacionARealizar = MULTIPLICACION;
                txtCommandLine.setText(numerocalculo1+" x ");
            }
        });
        butDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                operacionARealizar = DIVISION;
                txtCommandLine.setText(numerocalculo1+" / ");
            }
        });
        butRaizCuadrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                operacionARealizar = RAIZ;
                txtCommandLine.setText("Pulse el boton de Operación");
            }
        });
        butEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo2 = Double.parseDouble(txtCommandLine.getText());
                evaluacionDeOperacion();
                mostrarResultadosEnPantalla();
            }
        });
    }
    public void NotSupportedAction(){
        txtCommandLine.setText("  Esta operacion no está disponible aún.");
    }
    public void mostrarResultadosEnPantalla(){
        txtCommandLine.setText(String.valueOf(resultado));
    }
    public void evaluacionDeOperacion(){
        switch (operacionARealizar){
            case SUMA: operacionSuma(); break;
            case RESTA: operacionResta(); break;
            case MULTIPLICACION: operacionMultiplicacion(); break;
            case DIVISION: operacionDivision(); break;
            case RAIZ: operacionRaizCuadrada(); break;
            default: NotSupportedAction();
        }
    }
    public void operacionSuma(){
        op.OperacionSuma(numerocalculo1,numerocalculo2);
    }
    public void operacionResta(){
        op.OperacionResta(numerocalculo1,numerocalculo2);
    }
    public void operacionMultiplicacion(){
        op.OperacionMultiplicacion(numerocalculo1,numerocalculo2);
    }
    public void operacionDivision(){
        op.OperacionDivision(numerocalculo1,numerocalculo2);
    }
    public void operacionRaizCuadrada(){
        op.OperacionRaizCuadrada(numerocalculo1);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("CALCULADORA");
        frame.setContentPane(new CalculadoraVisual().panelCalculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
