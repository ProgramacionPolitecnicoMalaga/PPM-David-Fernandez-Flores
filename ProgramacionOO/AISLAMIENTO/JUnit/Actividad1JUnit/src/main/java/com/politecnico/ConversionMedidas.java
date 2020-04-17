package com.politecnico;

public class ConversionMedidas {

    private static final double equivalenciaInchesToCm = 2.54;
    private static final double equivalenciaCmToInches = 0.393701;

    public double inchACm(double inches){
        return (inches * equivalenciaInchesToCm);
    }

    public double cmAInches(double cm){
        return (cm * equivalenciaCmToInches);
    }
}
