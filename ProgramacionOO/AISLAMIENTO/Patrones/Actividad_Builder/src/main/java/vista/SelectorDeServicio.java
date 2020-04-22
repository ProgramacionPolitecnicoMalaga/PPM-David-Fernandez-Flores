package vista;

import builder.Builder;
import builder.BuilderDirector;
import modelo.ServPack;
import modelo.TiposServ;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectorDeServicio {
    private JPanel pnlMain;
    private JComboBox cmbService;
    private JLabel lblServicio;
    private JButton btnEnviar;
    private String nombreServicio;
    private Builder builder;
    private ServPack servicio;
    private BuilderDirector creador;

    public SelectorDeServicio(){
        Border borde = BorderFactory.createLineBorder(Color.BLACK);
        cmbService.setBorder(borde);
        pnlMain.setBorder(borde);
        builder = new Builder();
        creador = new BuilderDirector(builder);

        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                nombreServicio = String.valueOf(cmbService.getItemAt(cmbService.getSelectedIndex()));
                servicio = crearServicio(nombreServicio);
                System.out.println(nombreServicio + ":  " + servicio);
            }
        });
    }

    public ServPack crearServicio(String nombre){
        if (nombre.toUpperCase().equals(String.valueOf(TiposServ.BASICO))){
            return creador.servicioBasico();
        }
        else if (nombre.toUpperCase().equals(String.valueOf(TiposServ.ROMANCE))){
            return creador.servicioRomance();
        }

        else if (nombre.toUpperCase().equals(String.valueOf(TiposServ.FAMILIAR))){
            return creador.servicioFamiliar();
        }

        else if (nombre.toUpperCase().equals(String.valueOf(TiposServ.PADRES_RELAJADOS))){
            return creador.servicioPadresRelajados();
        }

        else if (nombre.toUpperCase().equals(String.valueOf(TiposServ.DELUXE))){
            return creador.servicioDeluxe();
        }

        else if (nombre.toUpperCase().equals(String.valueOf(TiposServ.DELUXE_FAMILIAR))){
           return creador.servicioDeluxeFamiliar();
        }
        return null;
    }

    public JPanel getPanel(){
        return pnlMain;
    }

    private void createUIComponents() {
        cmbService = new JComboBox();
        cmbService.addItem(TiposServ.BASICO);
        cmbService.addItem(TiposServ.ROMANCE);
        cmbService.addItem(TiposServ.FAMILIAR);
        cmbService.addItem(TiposServ.PADRES_RELAJADOS);
        cmbService.addItem(TiposServ.DELUXE);
        cmbService.addItem(TiposServ.DELUXE_FAMILIAR);
    }
}
