package com.politecnico.modelo;

import java.time.LocalDate;

public class Item {
    private String titulo;
    private String nombre;
    private String fecha;
    private String texto;
    private String tema;

    public Item(String titulo,String nombre,String tema,String fecha,String texto){
        this.titulo = titulo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.texto = texto;
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
