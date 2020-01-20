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
    private JTextField txtSoluciones;
    private JButton butBorrar;
    private JButton butDelete;
    private JButton butLn;
    private JButton butLog;
    private JButton butRaiz;
    private JButton butSeno;
    private JButton butCoseno;
    private JButton butTangente;

    private static final int SUMA = 1;
    private static final int RESTA = 2;
    private static final int MULTIPLICACION = 3;
    private static final int DIVISION = 4;
    private static final int POTENCIA = 5;
    private static final int NEPERIANO = 6;
    private static final int LOGARITMO = 7;
    private static final int RAIZ = 8;
    private static final int SENO = 9;
    private static final int COSENO = 10;
    private static final int TANGENTE = 11;

    private double solucion;
    private int operacionARealizar;
    private double numerocalculo1 = 0;
    private double numerocalculo2 = 0;
    private boolean aproximacionesSi = false;
    private boolean aproximacionesNO = false;
    private Operaciones op = new Operaciones();
    BorrarPantalla borrar = new BorrarPantalla();
    private DecimalFormat d = new DecimalFormat("####");
    private DecimalFormat formatoDecimal = new DecimalFormat("####.###");

    public CalculadoraVisual() {
        butNumeroCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+0);
            }
        });
        butNumeroUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+1);
            }
        });
        butNumeroDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+2);
            }
        });
        butNumeroTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+3);
            }
        });
        butNumeroCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+4);
            }
        });
        butNumeroCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+5);
            }
        });
        butNumeroSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+6);
            }
        });
        butNumeroSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+7);
            }
        });
        butNumeroOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+8);
            }
        });
        butNumeroNueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+9);
            }
        });
        butSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                txtCommandLine.setText("");
                txtSoluciones.setText(numerocalculo1+" + ");
                operacionARealizar = SUMA;
            }
        });
        butResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                txtCommandLine.setText("");
                txtSoluciones.setText(numerocalculo1+" - ");
                operacionARealizar = RESTA;
            }
        });
        butMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                txtCommandLine.setText("");
                txtSoluciones.setText(numerocalculo1+" x ");
                operacionARealizar = MULTIPLICACION;
            }
        });
        butDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                txtCommandLine.setText("");
                txtSoluciones.setText(numerocalculo1+" / ");
                operacionARealizar = DIVISION;
            }
        });
        butRaizCuadrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                txtCommandLine.setText("");
                txtSoluciones.setText(numerocalculo1+" elevado a ");
                operacionARealizar = POTENCIA;
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
        butPuntoComa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(d.format(Double.parseDouble(txtCommandLine.getText())) + ".");
            }
        });
        butBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                borrar.borradoDePantalla(txtCommandLine,txtSoluciones);
            }
        });
        butDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(borrar.evaluacionPantalla(txtCommandLine));
            }
        });
        butLn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText("");
                txtSoluciones.setText("Logaritmo neperiano de :  ");
                operacionARealizar = NEPERIANO;
            }
        });
        butLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText("");
                txtSoluciones.setText(" Logaritmo de :  ");
                operacionARealizar = LOGARITMO;
            }
        });
        butRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText("");
                txtSoluciones.setText(" Raiz cuadrada de :  ");
                operacionARealizar = RAIZ;
            }
        });
        butSeno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText("");
                txtSoluciones.setText(" Seno de :  ");
                operacionARealizar = SENO;
            }
        });
        butCoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText("");
                txtSoluciones.setText(" Coseno de :  ");
                operacionARealizar = COSENO;
            }
        });
        butTangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText("");
                txtSoluciones.setText(" Tangente de :  ");
                operacionARealizar = TANGENTE;
            }
        });
    }
    public void NotSupportedAction(){
        txtCommandLine.setText("  Esta operacion no está disponible aún.");
    }
    public void mostrarResultadosEnPantalla(){
        txtCommandLine.setText("");
        txtCommandLine.setText(String.valueOf(formatoDecimal.format(solucion)));
    }
    public void evaluacionDeOperacion(){
        switch (operacionARealizar){
            case SUMA: operacionSuma(); break;
            case RESTA: operacionResta(); break;
            case MULTIPLICACION: operacionMultiplicacion(); break;
            case DIVISION: operacionDivision(); break;
            case POTENCIA: operacionPotencia(); break;
            case NEPERIANO: operacionLn(); break;
            case LOGARITMO: operacionLog(); break;
            case RAIZ: operacionRaiz(); break;
            case SENO: operacionSeno(); break;
            case COSENO: operacionCoseno(); break;
            case TANGENTE: operacionTangente(); break;
            default: NotSupportedAction();
        }
    }
    public void operacionSuma(){
        txtSoluciones.setText(numerocalculo1 +"  +  "+numerocalculo2);
        solucion = op.OperacionSuma(numerocalculo1,numerocalculo2);
    }
    public void operacionResta(){
        txtSoluciones.setText(numerocalculo1 +"  -  "+numerocalculo2);
        solucion = op.OperacionResta(numerocalculo1,numerocalculo2);
    }
    public void operacionMultiplicacion(){
        txtSoluciones.setText(numerocalculo1 +"  x  "+numerocalculo2);
        solucion = op.OperacionMultiplicacion(numerocalculo1,numerocalculo2);
    }
    public void operacionDivision(){
        txtSoluciones.setText(numerocalculo1 +"  /  "+numerocalculo2);
        solucion = op.OperacionDivision(numerocalculo1,numerocalculo2);
    }
    public void operacionPotencia(){
        txtSoluciones.setText(numerocalculo1 +"  elevado a  "+numerocalculo2);
        solucion = op.OperacionPotencia(numerocalculo1,numerocalculo2);
    }
    public void operacionLn(){
        txtSoluciones.setText("  Logaritmo neperiano de :  "+numerocalculo2);
        solucion = op.OperacionNeperiano(numerocalculo2);
    }
    public void operacionLog(){
        txtSoluciones.setText("  Logaritmo de :  "+numerocalculo2);
        solucion = op.OperacionLogaritmo(numerocalculo2);
    }
    public void operacionRaiz(){
        txtSoluciones.setText("  Raiz cuadrada de : "+numerocalculo2);
        solucion = op.OperacionRaiz(numerocalculo2);
    }
    public void operacionSeno(){
        txtSoluciones.setText("  Seno de : "+numerocalculo2);
        solucion = op.OperacionSeno(numerocalculo2);
    }
    public void operacionCoseno(){
        txtSoluciones.setText("  Coseno de : "+numerocalculo2);
        solucion = op.OperacionCoseno(numerocalculo2);
    }
    public void operacionTangente(){
        txtSoluciones.setText("  Tangente de : "+numerocalculo2);
        solucion = op.OperacionTangente(numerocalculo2);
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
