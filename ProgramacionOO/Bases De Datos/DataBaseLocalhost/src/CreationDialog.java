import javax.swing.*;
import java.awt.event.*;

public class CreationDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField txtLuchador;
    private JTextField txtEmpresa;
    private JLabel lblEmpresa;
    private JLabel lblLuchador;
    private String nombre;
    private String empresa;

    public CreationDialog() {
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
        // add your code here
        nombre = txtLuchador.getText();
        empresa = txtEmpresa.getText();
        setVisible(false);
    }

    private void onCancel() {
        // add your code here if necessary
        setVisible(false);
    }
     public void aparecerDialogo(){
        setVisible(true);
     }

     public String getNombreLuchador(){
        return nombre;
     }
     public String getEmpresa(){
        return empresa;
     }
}
