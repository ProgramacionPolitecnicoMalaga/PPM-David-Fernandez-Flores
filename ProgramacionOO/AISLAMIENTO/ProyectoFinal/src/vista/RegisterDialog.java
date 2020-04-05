package vista;

import algoritmos.GestorAlgoritmo;
import controlador.Controlador;
import datasend.DataTransfer;

import javax.swing.*;
import java.awt.event.*;
import java.security.NoSuchAlgorithmException;

public class RegisterDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtName;
    private JTextField txtPass;
    private String nombre = "";
    private String password = "";
    private DataTransfer data;
    private Controlador controlador;
    private boolean verificaSi;
    private static boolean verificacionCorrecta;
    private GestorAlgoritmo gestorAlgoritmo;

    public RegisterDialog(DataTransfer data) {
        this.data = data;
        controlador = new Controlador();
        gestorAlgoritmo = new GestorAlgoritmo();
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        nombre = txtName.getText();
        password = txtPass.getText();
        String salt = controlador.getSalt(nombre);
        String hash = controlador.getHash(nombre);
        String alg = controlador.getAlg(nombre);
        verificacionCorrecta = verificar(password,salt,hash);
        data.put("nombre",nombre);
        data.put("contraseña",password);
        data.put("algoritmo",alg);
        data.put("salt",salt);
        data.put("hash",hash);
        verificaSi = true;
        dispose();
    }

    public boolean verificar(String password,String salt,String hash){
        boolean verif = false;
        try {
            verif = gestorAlgoritmo.verificarPassword(password, salt, hash);
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return verif;
    }

    public void mostrar(){
        setVisible(true);
    }

    public boolean getIfVerifica(){
        return verificaSi;
    }

    public static boolean getVerifTrue(){
        return verificacionCorrecta;
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
