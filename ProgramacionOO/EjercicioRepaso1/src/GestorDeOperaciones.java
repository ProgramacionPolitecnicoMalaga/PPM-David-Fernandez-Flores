public class GestorDeOperaciones {
    public double hipotenusa;

    public double OperacionHipotenusaAPartirDeDosCatetos(double catetoPrimero, double catetoSegundo){
        hipotenusa = Math.sqrt((Math.pow(catetoPrimero,2)) + (Math.pow(catetoSegundo,2)));
        return hipotenusa;
    }
    public double OperacionCatetoAPartirDeHipotenusaYCateto(double catetoPrimero, double hipotenusa){
        double catetoTemp = Math.sqrt((Math.pow(hipotenusa,2))-(Math.pow(catetoPrimero,2)));
        return catetoTemp;
    }
    public double AreaAPartirDeCatetoEHipotenusa(double catetoPrimero, double hipotenusa, double area){
        double catetoSecundario =  Math.sqrt((Math.pow(hipotenusa,2))-(Math.pow(catetoPrimero,2)));
        area = (catetoPrimero*catetoSecundario)/2;
        return  area;
    }
    public double AreaAPartirDeDosCatetos(double catetoPrimero, double catetoSegundo){
        return (catetoPrimero*catetoSegundo)/2;
    }
}
