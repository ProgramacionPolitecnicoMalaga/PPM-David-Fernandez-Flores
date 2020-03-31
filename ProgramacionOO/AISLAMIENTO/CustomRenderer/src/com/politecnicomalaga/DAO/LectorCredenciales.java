package com.politecnicomalaga.DAO;

import io.github.cdimascio.dotenv.Dotenv;

public class LectorCredenciales {

    Dotenv dotenv;

    public LectorCredenciales(){
        dotenv = Dotenv.configure().directory("C:\\Users\\usuario\\IdeaProjects\\CustomRenderer\\credenciales").load();
    }
    public String getUser(){
        return dotenv.get("db_user");
    }
    public String getPass(){
        return dotenv.get("db_pass");
    }
    public String getHost(){
        return dotenv.get("db_host");
    }
    public String getDatabase(){
        return dotenv.get("db_database");
    }
}
