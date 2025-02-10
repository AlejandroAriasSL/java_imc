package dev.alejandro;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona(100, 1.50);
        System.out.println(persona.imcCalc(persona.getKg(), persona.getMeters()));
    }
}
