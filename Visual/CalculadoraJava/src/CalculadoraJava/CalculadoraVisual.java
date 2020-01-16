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
    private JButton deleteButton;

    private static final int SUMA = 1;
    private static final int RESTA = 2;
    private static final int MULTIPLICACION = 3;
    private static final int DIVISION = 4;
    private static final int RAIZ = 5;
    private static final int POTENCIA = 6;

    private double num2;
    private double solucion;
    private boolean botonComa;
    private int operacionARealizar;
    private double numerocalculo1 = 0;
    private double numerocalculo2 = 0;
    private Operaciones op = new Operaciones();
    private DecimalFormat formateo = new DecimalFormat("####.##");
    private DecimalFormat d = new DecimalFormat("####");
    BorrarPantalla borrar = new BorrarPantalla();

    public CalculadoraVisual() {
        butNumeroCero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+0);
                num2 = Double.parseDouble(txtCommandLine.getText());

            }
        });
        butNumeroUno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+1);
                num2 = Double.parseDouble(txtCommandLine.getText());
                //concat.concatenacionEvaluada(txtCommandLine,num2);
            }
        });
        butNumeroDos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+2);
                num2 = Double.parseDouble(txtCommandLine.getText());
                //concat.concatenacionEvaluada(txtCommandLine,num2);
            }
        });
        butNumeroTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+3);
                num2 = Double.parseDouble(txtCommandLine.getText());
                //concat.concatenacionEvaluada(txtCommandLine,num2);
            }
        });
        butNumeroCuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+4);
                num2 = Double.parseDouble(txtCommandLine.getText());
                //concat.concatenacionEvaluada(txtCommandLine,num2);
            }
        });
        butNumeroCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+5);
                num2 = Double.parseDouble(txtCommandLine.getText());
                //concat.concatenacionEvaluada(txtCommandLine,num2);
            }
        });
        butNumeroSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+6);
                num2 = Double.parseDouble(txtCommandLine.getText());
                //concat.concatenacionEvaluada(txtCommandLine,num2);
            }
        });
        butNumeroSiete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+7);
                num2 = Double.parseDouble(txtCommandLine.getText());
                //concat.concatenacionEvaluada(txtCommandLine,num2);
            }
        });
        butNumeroOcho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+8);
                num2 = Double.parseDouble(txtCommandLine.getText());
                //concat.concatenacionEvaluada(txtCommandLine,num2);
            }
        });
        butNumeroNueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(txtCommandLine.getText()+9);
                num2 = Double.parseDouble(txtCommandLine.getText());
                //concat.concatenacionEvaluada(txtCommandLine,num2);
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
                operacionARealizar = RAIZ;
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
                numerocalculo1 = Double.parseDouble(txtCommandLine.getText());
                txtCommandLine.setText(d.format(numerocalculo1) + ".");
                botonComa = true;
            }
        });
        butBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                borrar.borradoDePantalla(txtCommandLine,txtSoluciones);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtCommandLine.setText(borrar.evaluacionPantalla(txtCommandLine));
            }
        });
    }
    public void NotSupportedAction(){
        txtCommandLine.setText("  Esta operacion no está disponible aún.");
    }
    public void mostrarResultadosEnPantalla(){
        txtSoluciones.setText(String.valueOf(solucion));
    }
    public void evaluacionDeOperacion(){
        switch (operacionARealizar){
            case SUMA: operacionSuma(); break;
            case RESTA: operacionResta(); break;
            case MULTIPLICACION: operacionMultiplicacion(); break;
            case DIVISION: operacionDivision(); break;
            case RAIZ: operacionPotencia(); break;
            default: NotSupportedAction();
        }
    }
    public void operacionSuma(){
        txtCommandLine.setText(numerocalculo1 +"  +  "+numerocalculo2);
        solucion = op.OperacionSuma(numerocalculo1,numerocalculo2);
    }
    public void operacionResta(){
        txtCommandLine.setText(numerocalculo1 +"  -  "+numerocalculo2);
        solucion = op.OperacionResta(numerocalculo1,numerocalculo2);
    }
    public void operacionMultiplicacion(){
        txtCommandLine.setText(numerocalculo1 +"  x  "+numerocalculo2);
        solucion = op.OperacionMultiplicacion(numerocalculo1,numerocalculo2);
    }
    public void operacionDivision(){
        txtCommandLine.setText(numerocalculo1 +"  /  "+numerocalculo2);
        solucion = op.OperacionDivision(numerocalculo1,numerocalculo2);
    }
    public void operacionPotencia(){
        txtCommandLine.setText(numerocalculo1 +"  elevado a  "+numerocalculo2);
        solucion = op.OperacionPotencia(numerocalculo1,numerocalculo2);
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
