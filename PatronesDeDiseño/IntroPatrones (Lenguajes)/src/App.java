import java.util.Scanner;

public class App {



    public static void main(String[] args){
        IdiomaFactory iFactory = new IdiomaFactory();
        Idioma idioma = iFactory.crear(MenuIdioma.pedirIdioma());
        System.out.println(idioma.saludar());
    }
}
