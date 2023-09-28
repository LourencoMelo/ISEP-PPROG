package vencimentos;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrabalhadorHoraTest {
//4a)
    @Test
    public void calcularVencimento() {
        //Arrange
        TrabalhadorHora th = new TrabalhadorHora("Joao",10,5);
        double expectedValue = 50;

        //Act
        double result = th.calcularVencimento();

        //Assert
        assertEquals(expectedValue, result,0);
    }
}