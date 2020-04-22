package builder;

import modelo.ServPack;
import modelo.TiposServ;

public class Builder implements IBuilder {
    private ServPack serv;

    public Builder(){
        serv = new ServPack();
    }

    public Builder setTipo(TiposServ tipo){
        serv.setTipo(tipo);
        return this;
    }

    public Builder setDesayuno(){
        serv.setDesayuno(true);
        return this;
    }

    public Builder setAlmuerzo(){
        serv.setAlmuerzo(true);
        return this;
    }

    public Builder setCena(){
        serv.setCena(true);
        return this;
    }

    public Builder setHabitacion(String hab){
        serv.setHabitacion(hab);
        return this;
    }

    public Builder setCamaAdicional(){
        serv.setCamaAdd(true);
        return this;
    }

    public Builder setParqueAtracciones(){
        serv.setParqueAtracciones(true);
        return this;
    }

    public Builder setKiteSurf(){
        serv.setKiteSurf(true);
        return this;
    }

    public Builder setActividadInfantil(){
        serv.setActInfantil(true);
        return this;
    }

    public Builder setCinePlaya(){
        serv.setCinePlaya(true);
        return this;
    }

    public ServPack crear() {
        return serv;
    }
}
