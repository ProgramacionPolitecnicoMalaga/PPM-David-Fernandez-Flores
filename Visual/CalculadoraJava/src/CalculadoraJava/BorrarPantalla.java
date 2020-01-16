package CalculadoraJava;

import javax.swing.*;

public class BorrarPantalla {

    private String cadena;
    private String cadenaFinal;

    public String evaluacionPantalla(JTextField txtCommand){
        if (txtCommand.getText() != null){
            cadena = String.valueOf(txtCommand.getText());
            cadenaFinal = cadena.substring(0,cadena.length()-1);
        }
        return cadenaFinal;
    }
    public void borradoDePantalla(JTextField txtCommand, JTextField txtSol){
        txtCommand.setText("");
        txtSol.setText("");
    }
}
