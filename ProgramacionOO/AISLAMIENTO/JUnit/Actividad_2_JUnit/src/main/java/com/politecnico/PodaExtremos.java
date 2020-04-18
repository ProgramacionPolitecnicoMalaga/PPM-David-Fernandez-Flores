package com.politecnico;

import java.util.ArrayList;

public class PodaExtremos {
    private ArrayList<Integer> listaNumeros;

    public PodaExtremos(){
        listaNumeros = new ArrayList<Integer>();
    }

    public int podarMasProximo(int num, ArrayList<Integer> lista){
        int menor = lista.get(0);
        int difer = Math.abs((lista.get(0) - num));
        for (int i=0; i<lista.size(); i++){
            if (Math.abs((lista.get(i)-num)) < difer) {
                menor = lista.get(i);
                difer = Math.abs((lista.get(i) - num));
            }
        }
        return menor;
    }
    public int podarMasLejano(int num, ArrayList<Integer> lista){
        int menor = lista.get(0);
        int difer = Math.abs((lista.get(0) - num));
        for (int i=0; i<lista.size(); i++){
            if (Math.abs((lista.get(i)-num)) > difer) {
                menor = lista.get(i);
                difer = Math.abs((lista.get(i) - num));
            }
        }
        return menor;
    }
}
