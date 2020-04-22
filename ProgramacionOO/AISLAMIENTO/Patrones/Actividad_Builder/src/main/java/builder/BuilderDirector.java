package builder;

import modelo.ServPack;
import modelo.TiposServ;

public class BuilderDirector {

    private Builder builderPacks;

    public BuilderDirector(Builder builder){
        this.builderPacks = builder;
    }

    public ServPack servicioBasico(){
        builderPacks.setTipo(TiposServ.BASICO).
                setHabitacion(ServPack.HabSimple).
                setDesayuno();
        return builderPacks.crear();
    }
    public ServPack servicioRomance(){
        builderPacks.setTipo(TiposServ.ROMANCE).
                setHabitacion(ServPack.HabDoble).
                setCena();
        return builderPacks.crear();
    }
    public ServPack servicioFamiliar(){
        builderPacks.setTipo(TiposServ.FAMILIAR).
                setHabitacion(ServPack.HabDoble).
                setCamaAdicional().
                setDesayuno().
                setAlmuerzo().
                setCena().
                setParqueAtracciones().
                setActividadInfantil().
                setCinePlaya();
        return builderPacks.crear();
    }
    public ServPack servicioPadresRelajados(){
        builderPacks.setTipo(TiposServ.PADRES_RELAJADOS).
                setHabitacion(ServPack.HabDoble).
                setCamaAdicional().
                setDesayuno().
                setAlmuerzo().
                setCena().
                setActividadInfantil().
                setKiteSurf().
                setCinePlaya();
        return builderPacks.crear();
    }
    public ServPack servicioDeluxe(){
        builderPacks.setTipo(TiposServ.DELUXE).
                setHabitacion(ServPack.HabSuite).
                setDesayuno().
                setAlmuerzo().
                setCena().
                setKiteSurf().
                setCinePlaya();
        return builderPacks.crear();
    }
    public ServPack servicioDeluxeFamiliar(){
        builderPacks.setTipo(TiposServ.DELUXE_FAMILIAR).
                setHabitacion(ServPack.HabSuite).
                setCamaAdicional().
                setDesayuno().
                setAlmuerzo().
                setCena().
                setParqueAtracciones().
                setKiteSurf().
                setActividadInfantil().
                setCinePlaya();
        return builderPacks.crear();
    }
}
