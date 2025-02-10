package dev.alejandro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonaTest {

    private Persona persona;
    private double kg = 67.5;
    private double meters = 1.75;

    @BeforeEach
    void beforeEach(){
        
        persona = new Persona(kg, meters);
    
    }
    @Test
    @DisplayName("It should return the kg of the person")
    void test_returns_kg_of_person(){
       
        assertThat(persona.getKg(), is(kg));

    }

    @Test
    @DisplayName("It should return the meters of the person")
    void test_returns_meters_of_person(){

        assertThat(persona.getMeters(), is(meters));
    }

    @Test
    @DisplayName("It should return the IMC of the person")
    void test_returns_imc_of_person(){

        assertThat(persona.imcCalc(persona.getKg(), persona.getMeters()), is(22.04));
    }

    @Test
    @DisplayName("It should print out printOut 'severe thinness' if IMC is under 16")
    void test_prints_severe_thinness_if_imc_lower_than_17() throws Exception{

        PrintStream oldOut = System.out;

        double metersThin = 2.12;

        ByteArrayOutputStream result = new ByteArrayOutputStream();

        System.setOut(new PrintStream(result));

        persona.imcCalc(kg, metersThin);

        String output = result.toString();

        assertThat(output, containsString("Severe Thinness"));

        System.setOut(oldOut);
    }
    @Test
    @DisplayName("It should return 'moderated thinness' if IMC is between 16 and 17")
    void test_prints_moderated_thinness_if_imc_between_16_and_17(){

        PrintStream oldOut = System.out;

        double metersThin = 2;

        ByteArrayOutputStream result = new ByteArrayOutputStream();

        System.setOut(new PrintStream(result));

        persona.imcCalc(kg, metersThin);

        String output = result.toString();

        assertThat(output, containsString("Moderated thinness"));

        System.setOut(oldOut);
    }
    @Test
    @DisplayName("It should return 'mild thinness' if IMC is between 17 and 18.5")
    void test_prints_mild_thinness(){

        PrintStream oldOut = System.out;

        double metersThin = 1.92;

        ByteArrayOutputStream result = new ByteArrayOutputStream();

        System.setOut(new PrintStream(result));

        persona.imcCalc(kg, metersThin);

        String output = result.toString();

        assertThat(output, containsString("Mild thinness"));

        System.setOut(oldOut);
    }
    @Test
    @DisplayName("It should return 'mild thinness' if IMC is between 17 and 18.5")
    void test_prints_normal_weight(){

        PrintStream oldOut = System.out;

        double metersThin = 1.80;

        ByteArrayOutputStream result = new ByteArrayOutputStream();

        System.setOut(new PrintStream(result));

        persona.imcCalc(kg, metersThin);

        String output = result.toString();

        assertThat(output, containsString("Normal weight"));

        System.setOut(oldOut);
    }
    @Test
    @DisplayName("It should return 'mild thinness' if IMC is between 17 and 18.5")
    void test_prints_overweight(){

        PrintStream oldOut = System.out;

        double metersThin = 1.60;

        ByteArrayOutputStream result = new ByteArrayOutputStream();

        System.setOut(new PrintStream(result));

        persona.imcCalc(kg, metersThin);

        String output = result.toString();

        assertThat(output, containsString("Overweight"));

        System.setOut(oldOut);
    }
    @Test
    @DisplayName("It should return 'mild thinness' if IMC is between 30 and 35")
    void test_prints_mild_obesity(){

        PrintStream oldOut = System.out;

        double metersThin = 1.48;

        ByteArrayOutputStream result = new ByteArrayOutputStream();

        System.setOut(new PrintStream(result));

        persona.imcCalc(kg, metersThin);

        String output = result.toString();

        assertThat(output, containsString("Mild obesity"));

        System.setOut(oldOut);
    }
}
