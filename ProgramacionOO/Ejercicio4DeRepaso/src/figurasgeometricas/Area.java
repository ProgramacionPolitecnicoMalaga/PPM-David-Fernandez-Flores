package figurasgeometricas;

import java.text.DecimalFormat;

public class Area {
    private double area;
    private DecimalFormat d = new DecimalFormat("###.##");


    public Area(double area){
        this.area = area;
    }

    @Override
    public String toString() {
        return  "Area: " + d.format(area) + "\n\n";
    }
}
