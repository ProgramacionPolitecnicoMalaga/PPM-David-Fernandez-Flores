

public class ComercialVentas {

    private int[] Vicente;
    private int[] Isabel;
    private int[] nuevoEmpleado;

    public ComercialVentas(){
        this.Vicente = new int[] {4, 7, 5, 4, 5};
        this.Isabel = new int[] {7, 7, 10, 6, 4};
        this.nuevoEmpleado = new int[] {};
    }
    public int[] getNuevoEmpleado() {
        return nuevoEmpleado;
    }
    public void setNuevoEmpleado(int[] nuevoEmpleado) {
        this.nuevoEmpleado = nuevoEmpleado;
    }
    public int[] getVicente() {
        return Vicente;
    }
    public void setVicente(int[] vicente) {
        Vicente = vicente;
    }
    public int[] getIsabel() {
        return Isabel;
    }
    public void setIsabel(int[] isabel) {
        Isabel = isabel;
    }
}
