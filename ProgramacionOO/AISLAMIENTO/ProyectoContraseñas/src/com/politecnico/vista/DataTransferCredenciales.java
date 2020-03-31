package com.politecnico.vista;

import com.politecnico.modelo.Credencial;

public class DataTransferCredenciales {
    public static Credencial transformar(DataTransfer data){
        String nombre = (String) data.get("nombre");
        String contraseña = (String) data.get("pass");
        String algoritmo = (String) data.get("algoritmo");
        String hash = (String) data.get("hash");
        return new Credencial(nombre,contraseña,algoritmo,hash);
    }
}
