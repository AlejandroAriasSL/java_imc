package dev.alejandro;

public class Persona {


    private double kg;
    private double meters;

    public Persona(double kg, double meters){
        this.kg = kg;
        this.meters = meters;
    }

    public double getKg(){
        return this.kg;
    }
    
    public double getMeters(){
        return this.meters;
    }

    public double imcCalc(double kg, double meters){
        double imc = Math.round(kg / Math.pow(meters, 2) * 100) / 100.0;

        if(imc < 16) System.out.println("Severe Thinness");

        return imc; 
    }
}
