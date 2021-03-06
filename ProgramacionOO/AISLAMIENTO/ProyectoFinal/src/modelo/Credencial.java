package modelo;

public class Credencial {
    private String nombre;
    private String contraseña;
    private String algoritmo;
    private String hash;
    private String salt;

    public Credencial(String nombre,String contraseña,String algoritmo,String hash,String salt){
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.algoritmo = algoritmo;
        this.hash = hash;
        this.salt = salt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
