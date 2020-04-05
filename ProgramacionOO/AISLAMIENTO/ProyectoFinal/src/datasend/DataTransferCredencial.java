package datasend;

import modelo.Credencial;

public class DataTransferCredencial {
    public static Credencial transformar(DataTransfer data){
        String nombre = (String) data.get("nombre");
        String contraseña = (String) data.get("contraseña");
        String algoritmo = (String) data.get("algoritmo");
        String salt = (String) data.get("salt");
        String hash = (String) data.get("hash");
        return new Credencial(nombre,contraseña,algoritmo,hash,salt);
    }
}
