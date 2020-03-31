package com.politecnico.dao;

import io.github.cdimascio.dotenv.Dotenv;

public class LectorCredenciales {

    Dotenv dotenv;

    public LectorCredenciales(){
        dotenv = Dotenv.configure().directory("C:\\Users\\usuario\\IdeaProjects\\ProyectoContraseñas\\resources").load();
    }
    public String getUser(){
        return dotenv.get("db_user");
    }
    public String getPass(){
        return dotenv.get("db_password");
    }
    public String getHost(){
        return dotenv.get("db_host");
    }
    public String getDataBase(){
        return dotenv.get("db_db");
    }
}
