package gestionPersonal;

public class App {
    public static void main(String[] args) {
        Comisionado paquito = new Comisionado("Paquito","Archundia",7,1200);
        Comisionado fran = new Comisionado("Francisco","Jones",4,1100);
        PorHoras estela = new PorHoras("Estela","Gartija",10,40);
        PorHoras aitor = new PorHoras("Aitor","Tilla", 8, 35);
        Asalariado romualda = new Asalariado("Romualda", "Anacleta",1500);
        Asalariado encarna = new Asalariado("Encarna","Vales",1250);


        paquito.getSalarioComisionado();
        fran.getSalarioComisionado();
        estela.getSalarioPorHoras();
        aitor.getSalarioPorHoras();
        romualda.getSalarioAsalariado();
        encarna.getSalarioAsalariado();

        System.out.println(paquito);
        System.out.println(fran);
        System.out.println(estela);
        System.out.println(aitor);
        System.out.println(romualda);
        System.out.println(encarna);
    }
}
