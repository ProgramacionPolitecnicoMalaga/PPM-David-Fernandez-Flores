package algoritmos;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHA512 {
    private static MessageDigest messageDigest;
    public SHA512() throws NoSuchAlgorithmException {
        messageDigest = MessageDigest.getInstance("SHA-512");
    }
    public String getSalt(){
        SecureRandom secureRandom = null;
        try{
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            byte[] salt = new byte[16];
            secureRandom.nextBytes(salt);
            return Hex.encodeHexString(salt);
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return "Salt!";
        }
    }
    public String getSaltedPassword(String password, String salt) throws NoSuchAlgorithmException {
        if (messageDigest == null){
            throw new NoSuchAlgorithmException("No existe el algoritmo de hash");
        }
        messageDigest.update(salt.getBytes());
        byte[] bytes = messageDigest.digest(password.getBytes());
        return Hex.encodeHexString(bytes);
    }
    public boolean verificarPassword(String password, String salt, String passwordHash) throws NoSuchAlgorithmException{
        String nuevoHash = getSaltedPassword(password,salt);
        return nuevoHash.equals(passwordHash);
    }
}
