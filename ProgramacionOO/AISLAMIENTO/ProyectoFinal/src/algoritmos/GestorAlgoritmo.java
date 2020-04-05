package algoritmos;

import java.security.NoSuchAlgorithmException;

public class GestorAlgoritmo {
    private SHA512 sha;

    public GestorAlgoritmo(){
        try {
            sha = new SHA512();
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
    }
    public String obtenerSalt() throws NoSuchAlgorithmException{
        String salt = sha.getSalt();
        return salt;
    }
    public String obtenerHash(String password,String salt) throws NoSuchAlgorithmException{
        String hash = sha.getSaltedPassword(password,salt);
        return hash;
    }
    public boolean verificarPassword(String pass,String salt, String hash) throws NoSuchAlgorithmException{
        return sha.verificarPassword(pass,salt,hash);
    }
}
