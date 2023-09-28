package org.dei.tributaveis;

import static org.junit.jupiter.api.Assertions.*;

class MoradiaTest {

    @org.junit.jupiter.api.Test
    void calcularImposto() {
        System.out.println("CALCULAR IMPOSTO");

        //Arrange
        Moradia mtest = new Moradia("Rua do Bocage", 90, Moradia.CINZENTO);
        float expected = 180;

        //ACT
        float result = mtest.calcularImposto();

        //Assert
        assertEquals(expected, result, 0.0);
    }
}