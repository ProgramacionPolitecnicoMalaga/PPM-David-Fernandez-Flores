import java.util.Scanner;

public class InterfazMenu {
    private static final int BUSQUEDA_POR_ITEMS = 1;
    private static final int PROMEDIOS = 2;
    private static final int MAYOR_PROMEDIO = 3;
    private static final int INSERTAR_EMPLEADO = 4;

    private static final int ISABEL_VENTAS = 5;

    private int opcionEscogida;
    private int itemSeleccionado;
    private Scanner lectorTeclado = new Scanner(System.in);
    private ComercialVentas comerciales = new ComercialVentas();
    private int numeroVentasEmpleado;
    private String nombreEmpleado;
    private int mayorVentaEnUnDiaIsabel=0;
    private int mayorVentaEnUnDiaVicente=0;
    private double promedioVicente=0;
    private double promedioIsabel=0;
    private int[] ventasEmpleado = {};
    private boolean loTieneVicente = false;
    private boolean loTieneIsabel = false;

    public void mostrarInterfazMenu() {
        System.out.println("  1. Empleados que vendieron un cierto numero de items");
        System.out.println("  2. Obtener el promedio de ventas de cada uno");
        System.out.println("  3. Averiguar quien ha obtenido el mayor promedio de ventas en un dia");
        System.out.println("  4. Insertar un nuevo empleado y sus ventas");
        System.out.println("  Escoja una opcion: ");
        opcionEscogida = lectorTeclado.nextInt();
        eleccionDeOpcion();
    }
    private void eleccionDeOpcion() {
        switch (opcionEscogida){
            case BUSQUEDA_POR_ITEMS: BusquedaPorItems(); break;
            case PROMEDIOS: Promedios(); break;
            case MAYOR_PROMEDIO: ComparacionDePromedios(); break;
            case INSERTAR_EMPLEADO: InsertarNuevoEmpleado(); break;
            default: NotSupportedOption();
        }
    }
    private void NotSupportedOption() {
        System.out.println("  Esa opción no es válida. Reescriba una opcion correcta a continuación: ");
        opcionEscogida = lectorTeclado.nextInt();
        eleccionDeOpcion();
    }
    private void InsertarNuevoEmpleado() {
        System.out.println("  ¿Cuantas ventas ha realizado el nuevo empleado?");
        numeroVentasEmpleado = lectorTeclado.nextInt();
        System.out.println("  ¿Como se llama este empleado?");
        nombreEmpleado = lectorTeclado.next();
        for (int f=0;f<numeroVentasEmpleado;f++){
            System.out.println("  ¿Cuantas ventas realizo en el dia "+(f+1)+"?");
            ventasEmpleado[f] = lectorTeclado.nextInt();
        }
        System.out.println("  "+nombreEmpleado +"  Ventas: {"+ventasEmpleado[0]+", "+ventasEmpleado[1]+
                ", "+ventasEmpleado[2]+", "+ventasEmpleado[3]+", "+ventasEmpleado[4]);

    }
    private void ComparacionDePromedios() {
        MayorVentaDeIsabelEnUnDia();
        MayorVentaDeVicenteEnUnDia();
        if (mayorVentaEnUnDiaVicente > mayorVentaEnUnDiaIsabel){
            System.out.println(" Vicente ha realizado la mayor venta en un dia con "+mayorVentaEnUnDiaVicente+" ventas");
        }
        else{
            System.out.println(" Isabel ha logrado la mayor venta en un solo dia "+mayorVentaEnUnDiaIsabel+" ventas");
        }
    }
    public void getPromedioIsabel(){
        for (int j=0;j<comerciales.getIsabel().length;j++){
            promedioIsabel += comerciales.getIsabel()[j];
        }
        promedioIsabel = promedioIsabel/(comerciales.getIsabel().length);
    }
    public void getPromedioVicente(){
        for (int j=0; j<(comerciales.getVicente().length);j++){
            promedioVicente += comerciales.getVicente()[j];
        }
        promedioVicente = promedioVicente/(comerciales.getVicente().length);
    }
    private void Promedios() {
        getPromedioIsabel();
        getPromedioVicente();
        System.out.println("  Promedio de Vicente:  "+promedioVicente+"\n" +
                "  Promedio de Isabel:  "+promedioIsabel);
    }
    private void BusquedaPorItems() {
        System.out.println("  Item a ser buscado: ");
        itemSeleccionado = lectorTeclado.nextInt();
        BuscarEnIsabel();
        BuscarEnVicente();
        if ((loTieneVicente == true)&&(loTieneIsabel == true)){
            System.out.println("  Vicente e Isabel, ambos, realizaron la venta de ese item");
        }
        else{
            if (loTieneIsabel == true){
                System.out.println("  Isabel realizó la venta de este item");
            }
            else{
                if (loTieneVicente == true){
                    System.out.println("  Vicente realizó la venta de este item");
                }
                else{
                    System.out.println("  Ninguno vendió este item");
                }
            }
        }
    }
    public void BuscarEnIsabel(){
        for (int i=0;i<comerciales.getIsabel().length;i++){
            if (comerciales.getIsabel()[i] == itemSeleccionado) {
                loTieneIsabel = true;
            }
        }
    }
    public void BuscarEnVicente(){
        for (int i=0;i<comerciales.getVicente().length;i++){
            if (comerciales.getVicente()[i] == itemSeleccionado){
                loTieneVicente = true;
            }
        }
    }


    public void MayorVentaDeIsabelEnUnDia(){
        for (int k=0;k<(comerciales.getIsabel().length);k++){
            if (comerciales.getIsabel()[k]>mayorVentaEnUnDiaIsabel){
                mayorVentaEnUnDiaIsabel= comerciales.getIsabel()[k];
            }
        }
    }
    public void MayorVentaDeVicenteEnUnDia(){
        for (int k=0;k<(comerciales.getVicente().length);k++){
            if (comerciales.getVicente()[k]>mayorVentaEnUnDiaVicente){
                mayorVentaEnUnDiaVicente= comerciales.getVicente()[k];
            }
        }
    }

}
