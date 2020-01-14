public class Salario {

    private double salario;

    public Salario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(){
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " "+salario;
    }
}
