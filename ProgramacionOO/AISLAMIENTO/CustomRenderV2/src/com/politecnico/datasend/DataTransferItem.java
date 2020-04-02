package com.politecnico.datasend;

import com.politecnico.modelo.Item;

import java.time.LocalDate;

public class DataTransferItem {
        public static Item transformar(DataTransfer data) {
            String titulo = (String) data.get("titulo");
            String nombre = (String) data.get("nombre");
            String tema = (String) data.get("tema");
            String fecha = (String) data.get("fecha");
            String texto = (String) data.get("texto");
            return new Item(titulo,nombre,tema,fecha,texto);
    }
}
