package dao;

import io.github.cdimascio.dotenv.Dotenv;

public class LectorENV {

    private Dotenv dotenv;

    public LectorENV(){
        dotenv = Dotenv.configure().directory("C:\\Users\\usuario\\IdeaProjects\\ProyectoFinal\\resources").load();
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
    public String getDB(){
        return dotenv.get("db_db");
    }
}
