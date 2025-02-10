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
        if(imc >= 16.0 && imc <= 17.0) System.out.println("Moderated thinness");
        if(imc >= 17 && imc <= 18.5) System.out.println("Mild thinness");
        if(imc >= 18.5 && imc <= 25 ) System.out.println("Normal weight");
        if(imc >= 25 && imc <= 30) System.out.println("Overweight");
        return imc; 
    }
}
