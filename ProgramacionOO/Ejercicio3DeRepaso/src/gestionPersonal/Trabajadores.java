package gestionPersonal;

import java.util.Scanner;

public class Trabajadores {
    private String nombre;
    private String apellidos;
    public Salarios salarios = new Salarios();
    public Scanner lectorTeclado = new Scanner(System.in);


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Trabajadores(String nombre,String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Trabajadores(){

    }
}
