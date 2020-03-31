public class Trabajador {

    private int id;
    private String name;
    private String empresa;

    public Trabajador(int id,String name,String empresa){
        this.id = id;
        this.name = name;
        this.empresa = empresa;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "name='" + name + '\'' +
                ", empresa='" + empresa + '\'' +
                '}'+"\n";
    }
}
