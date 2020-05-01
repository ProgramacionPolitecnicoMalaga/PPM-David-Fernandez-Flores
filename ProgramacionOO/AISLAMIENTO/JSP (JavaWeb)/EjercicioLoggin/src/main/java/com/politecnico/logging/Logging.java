package com.politecnico.logging;

import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class Logging {

    private static final Logger logger = Logger.getLogger(Logging.class.getName());
    private static FileHandler handler = null;
    File archivo;

    public void crearArchivo() throws IOException {
        archivo = new File("/opt/tomcat/logs/SumaLogging/", "SumaLogging.log");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
    }
        /*try {
            handler = new FileHandler("/opt/tomcat/logs/SumaLogging/SumaLogging.log");
            Formatter formatter = new SimpleFormatter(); // new XMLFormatter();
            handler.setFormatter(formatter);
            logger.addHandler(handler);
        } catch (IOException e) {
            logger.log(Level.SEVERE,"Error en la creación de la bitácora");
        }
    }*/

}

