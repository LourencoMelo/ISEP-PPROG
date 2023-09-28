package vencimentos;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrabalhadorPecaTest {
    //4a)
    @Test
    public void calcularVencimento() {
        //Arrange
        TrabalhadorPeca tp = new TrabalhadorPeca("Joaquina",2,3);
        double expectedValue = 91;

        //Act
        double result = tp.calcularVencimento();

        //Assert
        assertEquals(expectedValue, result,0);
    }
}