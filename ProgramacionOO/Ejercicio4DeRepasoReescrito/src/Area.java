import java.text.DecimalFormat;

public class Area {

    private double area;
    private DecimalFormat d = new DecimalFormat("####.##");

    public Area(double area){
        this.area = area;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return area;
    }
    @Override
    public String toString() {
        return " area: " + d.format(area) + " }\n";
    }
}
