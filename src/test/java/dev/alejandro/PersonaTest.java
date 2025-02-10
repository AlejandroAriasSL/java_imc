package dev.alejandro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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
}
