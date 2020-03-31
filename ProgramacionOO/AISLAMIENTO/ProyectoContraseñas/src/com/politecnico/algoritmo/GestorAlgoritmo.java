package com.politecnico.algoritmo;

import org.apache.commons.codec.binary.Hex;

import java.security.NoSuchAlgorithmException;

public class GestorAlgoritmo {
    private static SHA3_512 sha;
    private static HashBcrypt bcrypt;

    public GestorAlgoritmo() {
        try {
            sha = new SHA3_512();
            bcrypt = new HashBcrypt();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    public String getHash(String pass,String algoritmo) {
        String hashedPass = "";
        if (algoritmo.equals("SHA-512")){
            try{
            hashedPass = sha.generateHash(pass,algoritmo,SHA3_512.createSalt());
            } catch (NoSuchAlgorithmException e){
                e.printStackTrace();
            }
        }
        else if (algoritmo.equals("BCrypt")){
            hashedPass = bcrypt.getPasswordHash(pass);
        }
        return hashedPass;
    }
}
