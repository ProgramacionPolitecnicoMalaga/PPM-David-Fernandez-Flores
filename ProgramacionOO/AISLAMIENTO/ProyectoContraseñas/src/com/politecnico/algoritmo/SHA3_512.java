package com.politecnico.algoritmo;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHA3_512 {
    private static byte[] salt = createSalt();;
    private static String algoritmo = "SHA-512";

    public SHA3_512() throws NoSuchAlgorithmException{}

    public String generateHash(String datos, String algoritmo,byte[] salt) throws NoSuchAlgorithmException{
        MessageDigest digest = MessageDigest.getInstance(algoritmo);
        digest.reset();
        digest.update(salt);
        byte[] hash = digest.digest(datos.getBytes());
        return Hex.encodeHexString(hash);
    }

    public static byte[] createSalt(){
        byte[] bytes = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(bytes);
        return bytes;
    }

    /*public static void main(String[] args) throws NoSuchAlgorithmException {
        String datos = "Paco";
        System.out.println(generateHash(datos, algoritmo, salt));
    }*/
}
