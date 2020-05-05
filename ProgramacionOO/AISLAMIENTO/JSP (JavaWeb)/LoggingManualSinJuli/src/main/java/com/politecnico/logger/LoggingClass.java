package com.politecnico.logger;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingClass {

    private static final String RUTA_ARCHIVO = "/opt/tomcat/latest/logs/LoggingManualSinJuli/CustomLog.log";

    private Logger logger = Logger.getLogger(LoggingClass.class.getName());
    private FileHandler handler = null;
    private File archive;

    public LoggingClass() throws IOException {
        archive = new File(RUTA_ARCHIVO);
        createIfNotExist();
        handler = new FileHandler(RUTA_ARCHIVO);
        SimpleFormatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
    }

    public void createIfNotExist() throws IOException {
        if (!archive.exists()){
            archive.createNewFile();
        }
    }

    public Logger getLogger(){
        return logger;
    }
}
