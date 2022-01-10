package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaludoTest {

    private Saludo saludo;

    @Before
    public void setup(){
        this.saludo = new Saludo();
    }

    @Test
    public void saludar(){

        assertEquals("Hola", saludo.saludar() );

    }

    @Test
    public void decirDespedirse(){

        assertEquals("Hasta luego!!!", saludo.despedirse() );
    }
}
