package modelo;

public class ServPack {
    private TiposServ tipo = TiposServ.BASICO;
    public static final String HabSimple = "Simple";
    public static final String HabDoble = "Doble";
    public static final String HabSuite = "Suite";

    private boolean desayuno = false;
    private boolean almuerzo = false;
    private boolean cena = false;
    private String habitacion = ServPack.HabSimple;
    private boolean camaAdd = false;
    private boolean parqueAtracciones = false;
    private boolean kiteSurf = false;
    private boolean actInfantil = false;
    private boolean cinePlaya = false;

    public void setTipo(TiposServ tipo){
        this.tipo = tipo;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    public void setAlmuerzo(boolean almuerzo) {
        this.almuerzo = almuerzo;
    }

    public void setCena(boolean cena) {
        this.cena = cena;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public void setCamaAdd(boolean camaAdd) {
        this.camaAdd = camaAdd;
    }

    public void setParqueAtracciones(boolean parqueAtracciones) {
        this.parqueAtracciones = parqueAtracciones;
    }

    public void setKiteSurf(boolean kiteSurf) {
        this.kiteSurf = kiteSurf;
    }

    public void setActInfantil(boolean actInfantil) {
        this.actInfantil = actInfantil;
    }

    public void setCinePlaya(boolean cinePlaya) {
        this.cinePlaya = cinePlaya;
    }

    @Override
    public String toString() {
        return "ServPack{" +
                "tipo=" + tipo +
                ", desayuno=" + desayuno +
                ", almuerzo=" + almuerzo +
                ", cena=" + cena +
                ", habitacion='" + habitacion + '\'' +
                ", camaAdd=" + camaAdd +
                ", parqueAtracciones=" + parqueAtracciones +
                ", kiteSurf=" + kiteSurf +
                ", actInfantil=" + actInfantil +
                ", cinePlaya=" + cinePlaya +
                '}';
    }
}
