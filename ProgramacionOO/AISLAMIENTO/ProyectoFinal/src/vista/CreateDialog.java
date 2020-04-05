package vista;

import algoritmos.GestorAlgoritmo;
import datasend.DataTransfer;

import javax.swing.*;
import java.awt.event.*;
import java.security.NoSuchAlgorithmException;

public class CreateDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtNombre;
    private JTextField txtPassword;
    private JComboBox cmbAlgoritmo;
    private DataTransfer data;
    private GestorAlgoritmo gestor = new GestorAlgoritmo();
    private boolean consulta = false;

    public CreateDialog(DataTransfer data) {
        this.data = data;
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
        String algoritmo = (String) cmbAlgoritmo.getItemAt(cmbAlgoritmo.getSelectedIndex());
        try{
        String salt = gestor.obtenerSalt();
        data.put("nombre",txtNombre.getText());
        data.put("contraseña",txtPassword.getText());
        data.put("algoritmo",algoritmo);
        data.put("salt",salt);
        data.put("hash",gestor.obtenerHash(txtPassword.getText(),salt));
        consulta = true;
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public boolean getConsultaSi(){
        return consulta;
    }

    public void mostrarDialog(){
        setVisible(true);
    }

    private void createUIComponents() {
        cmbAlgoritmo = new JComboBox();
        cmbAlgoritmo.addItem("SHA-512");
        cmbAlgoritmo.addItem("BCrypt");
    }
}
