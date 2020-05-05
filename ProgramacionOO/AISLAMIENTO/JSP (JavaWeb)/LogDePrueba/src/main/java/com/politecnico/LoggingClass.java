package com.politecnico;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.logging.*;

public class LoggingClass {

    Logger logger = Logger.getLogger(LoggingClass.class.getName());
    FileHandler handler = null;
    File archivo;

    public LoggingClass() throws IOException {
        archivo = new File("C:\\Users\\usuario\\IdeaProjects\\LogP\\src\\main\\resources\\logs.log");
        crearArchivo();
        handler = new FileHandler(archivo.toString());
        SimpleFormatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
    }

    public void crearArchivo() throws IOException {
        if (!archivo.exists()){
            archivo.createNewFile();
        }
    }
}
