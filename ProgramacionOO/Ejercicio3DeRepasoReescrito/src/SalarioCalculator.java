public class SalarioCalculator {

    public Comisionados salarioComisionados(Comisionados comisionado){
        double beneficioSalarial = comisionado.getVentas() * 50;
        double salarioFinal = (Empleados.SALARIO_BASE + beneficioSalarial);
        comisionado.setSalarioFinal(salarioFinal);
        Salario salario = new Salario(salarioFinal);
        return comisionado;
    }
    public PorHoras salarioPorHoras(PorHoras porHoras){
        double salarioFinal = Empleados.SUELDO_POR_HORA * porHoras.getHorasTrabajadas();
        porHoras.setSalarioFinal(salarioFinal);
        Salario salario = new Salario(salarioFinal);
        return porHoras;
    }
    public Asalariado salarioAsalariado(Asalariado asalariado){
        asalariado.setSalarioFinal(Empleados.SALARIO_BASE);
        Salario salario = new Salario(Empleados.SALARIO_BASE);
        return asalariado;
    }
}
