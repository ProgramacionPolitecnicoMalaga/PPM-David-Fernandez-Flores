package algoritmos;

import java.security.NoSuchAlgorithmException;

public class TestSHA {
    private static SHA512 sha;

    public static String getSalt(){
        return sha.getSalt();
    }

    public static void main(String[] args) {
        String pass = "Paco";
        try {
            sha = new SHA512();
            String salt = getSalt();
            String hash = sha.getSaltedPassword(pass,salt);
            System.out.println(hash);
            System.out.println(getSalt());
            System.out.println(getSalt());
            System.out.println(getSalt());
            System.out.println(sha.verificarPassword("Paco",salt,hash));
        } catch (NoSuchAlgorithmException a){
            a.printStackTrace();
        }



    }
}
