
import io.github.cdimascio.dotenv.Dotenv;

public class LectorCredenciales {

    Dotenv dotenv;

    public LectorCredenciales(){
        dotenv = Dotenv.configure().directory("C:\\Users\\usuario\\IdeaProjects\\PruebaConexionVM\\credenciales").load();
    }

    public String getUsuario(){
        return dotenv.get("db_user");
    }
    public String getContraseña(){
        return dotenv.get("db_pass");
    }
    public String getDataBase(){
        return dotenv.get("db_database");
    }
    public String getHost(){
        return dotenv.get("db_host");
    }

}
