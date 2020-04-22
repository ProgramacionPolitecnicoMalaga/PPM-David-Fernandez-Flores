package com.politecnico;

import java.util.ArrayList;

public class Fibonacci {

    private int numero1;
    private int numero2;
    private int temp;
    private ArrayList<Integer> serieFib;

    public Fibonacci(ArrayList<Integer> serieFibonacci){
        numero1 = 0;
        numero2 = 1;
        this.serieFib = serieFibonacci;
        serieFibonacci.add(numero1);
        serieFibonacci.add(numero2);
    }

    public void calculoFibonacci(int num, ArrayList<Integer> lista){
        for (int i= 0; i<num; i++){
            temp = numero1;
            numero1 = numero2;
            numero2 = temp + numero1;
            lista.add(numero2);
        }
    }
    public int getPosicionDeFibonacci(int num,ArrayList<Integer> lista){
        return lista.get(num-1);
    }

    public ArrayList<Integer> getSerieFib(){
        return serieFib;
    }
}
