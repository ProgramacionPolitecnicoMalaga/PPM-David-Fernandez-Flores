package com.politecnico.dao;

import io.github.cdimascio.dotenv.Dotenv;

public class LectorCredenciales {

    private Dotenv dotenv;

    public LectorCredenciales(){
        dotenv = Dotenv.configure().directory("C:\\Users\\usuario\\IdeaProjects\\CustomRenderV2\\resources").load();
    }
    public String getUser(){
        return dotenv.get("db_user");
    }
    public String getHost(){
        return dotenv.get("db_host");
    }
    public String getPassword(){
        return dotenv.get("db_password");
    }
    public String getDataBase(){
        return dotenv.get("db_db");
    }
}
