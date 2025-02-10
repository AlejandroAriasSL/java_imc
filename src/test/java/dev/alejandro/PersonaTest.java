package dev.alejandro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PersonaTest {

    @Test
    @DisplayName("It should return the kg of the person")
    void test_returns_kg_of_person(){

        double kg = 67.7;
        double meters = 1.75;

        Persona persona = new Persona(kg, meters)
        
        assertThat(persona.getKg(), is(kg));

    }
}
