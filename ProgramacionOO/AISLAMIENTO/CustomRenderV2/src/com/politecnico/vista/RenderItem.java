package com.politecnico.vista;

import com.politecnico.modelo.Item;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class RenderItem implements ListCellRenderer<Item>{
    private JPanel pnlRender;
    private JLabel lblNombre;
    private JLabel lblFecha;
    private JLabel lblTema;
    private JLabel lblTexto;
    private JLabel lblTitulo;
    private JPanel pnlTexto;
    private JPanel pnlExterior;
    private JPanel pnlTitulo;
    private JPanel pnlNombre;
    private JPanel pnlTema;
    private JPanel pnlFecha;
    private JPanel[] paneles = {pnlExterior,pnlTitulo,pnlNombre,pnlTema,pnlFecha,pnlTexto};

    @Override
    public Component getListCellRendererComponent(JList<? extends Item> jList, Item item, int i, boolean isSelected, boolean cellHasFocus) {
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        lblTitulo.setText(item.getTitulo());
        lblNombre.setText(item.getNombre());
        lblTema.setText(item.getTema());
        lblFecha.setText(String.valueOf(item.getFecha()));
        lblTexto.setText(item.getTexto());
        String tema = item.getTema();

        if (tema.toLowerCase().equals("it")){
            pnlTema.setBackground(Color.GREEN);
        }
        else if (tema.toLowerCase().equals("desarrollo")){
            pnlTema.setBackground(Color.CYAN);
        }
        else if (tema.toLowerCase().equals("mantenimiento")){
            pnlTema.setBackground(Color.ORANGE);
        }
        else if (tema.toLowerCase().equals("general")){
            pnlTema.setBackground(Color.decode("#a6a6a6"));
        }

        /*if (isSelected){
            pnlRender.setBackground(Color.LIGHT_GRAY);
        } else {
            pnlRender.setBackground(Color.WHITE);
        }*/

        if (cellHasFocus){
            //lblTexto.setFont(new Font("SansSerif",Font.BOLD,14));
            Color back = Color.GRAY;
            pnlExterior.setBackground(back);
            pnlTexto.setBackground(back);

        } else {
            //lblTexto.setFont(new Font("SansSerif",Font.PLAIN,10));
            Color color = Color.decode("#cccccc");
            pnlExterior.setBackground(color);
            pnlTexto.setBackground(color);
        }
        pnlExterior.setBorder(border);
        pnlRender.setBorder(border);
        return pnlRender;
    }

    public void setFondoPaneles(Color color){
        for (int i=0;i<paneles.length;i++){
            paneles[i].setBackground(color);
        }
    }
}
