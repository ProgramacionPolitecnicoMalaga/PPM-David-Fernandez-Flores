package com.politecnicomalaga;

import java.time.LocalDate;
import java.util.Date;

public class Item {
    private String autor;
    private LocalDate fecha;
    private String texto;

    public Item(String autor, LocalDate fecha, String texto) {
        this.autor = autor;
        this.fecha = fecha;
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
