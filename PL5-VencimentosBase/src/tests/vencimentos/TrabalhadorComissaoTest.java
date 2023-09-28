package vencimentos;

import static org.junit.Assert.*;

public class TrabalhadorComissaoTest {
//4a)
    @org.junit.Test
    public void calcularVencimento() {
        //Arrange
        TrabalhadorComissao tc = new TrabalhadorComissao("Joao", 100, 10 ,10);
        double expectedValue = 101;

        //Act
        double result = tc.calcularVencimento();

        //Assert
        assertEquals(expectedValue, result,0);
    }
}