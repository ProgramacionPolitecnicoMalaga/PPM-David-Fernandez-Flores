package com.politecnico;

import java.io.IOException;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        try {
            LoggingClass logging = new LoggingClass();
            Logger logger = logging.logger;
            logger.severe("Prueba de log de Error");
            logger.warning("Prueba de log de Warnning");
            logger.info("Prueba de log de Info");
            logger.config("Prueba de log de Config");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
