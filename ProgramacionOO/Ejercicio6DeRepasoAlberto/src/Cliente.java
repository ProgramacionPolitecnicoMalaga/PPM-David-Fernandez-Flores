public class Cliente {

    private String nombre;
    private String apellidos;
    private String NIV;
    private String cuentaBancaria;

    public Cliente(String nombre,String apellidos,String NIV,String cuentaBancaria){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIV = NIV;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIV() {
        return NIV;
    }

    public void setNIV(String NIV) {
        this.NIV = NIV;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return " \nCliente{ \n" +
                "  nombre: " + nombre + "\n" +
                "  apellidos: " + apellidos + "\n" +
                "  NIV: " + NIV + "\n" +
                "  cuentaBancaria: " + cuentaBancaria + "\n" +
                '}';
    }
}
