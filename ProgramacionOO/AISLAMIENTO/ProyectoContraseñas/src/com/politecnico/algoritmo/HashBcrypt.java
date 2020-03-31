package com.politecnico.algoritmo;

import org.mindrot.jbcrypt.BCrypt;

import java.security.NoSuchAlgorithmException;

public class HashBcrypt {
    public String getPasswordHash(String password) {
        return BCrypt.hashpw(password,BCrypt.gensalt(12));
    }
    public boolean verificarPassword(String password, String passwordHash){
        return BCrypt.checkpw(password,passwordHash);
    }

    /*public static void main(String[] args) {
        String password = "Paco";
        System.out.println(getPasswordHash(password));
    }*/
}
