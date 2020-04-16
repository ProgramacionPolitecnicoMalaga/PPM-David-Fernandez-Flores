import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JPanel pnlMain;
    private JPanel pnlIntercambio;
    private JMenuBar mnBar;
    private JMenu menu;
    private JMenuItem itemPanel1;
    private JMenuItem itemPanel2;
    private Panel1 panel1;
    private Panel2 panel2;

    public Principal(){
        panel1 = new Panel1();
        panel2 = new Panel2();
        pnlIntercambio.add(panel1.getPanel1(),"panel1");
        pnlIntercambio.add(panel2.getPanel2(),"panel2");

        itemPanel1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CardLayout layout = (CardLayout) pnlIntercambio.getLayout();
                layout.show(pnlIntercambio,"panel1");
            }
        });

        itemPanel2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CardLayout layout = (CardLayout) pnlIntercambio.getLayout();
                layout.show(pnlIntercambio,"panel2");
            }
        });
    }

    public JPanel getPanel(){
        return pnlMain;
    }
}
