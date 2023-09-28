package vencimentos;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrabalhadorTest {
//4b
    @Test
    public void compareTo() {
        //Arrange
        TrabalhadorHora th = new TrabalhadorHora("Joana",10,5);
        TrabalhadorHora th1 = new TrabalhadorHora("Sofia", 5,5);
        int expected=1;

        //act
        int result = th.compareTo(th1);

        //assert
        assertEquals(expected, result);
    }
    @Test
    public void compareTo2() {
        //Arrange
        TrabalhadorHora th = new TrabalhadorHora("Joana",10,5);
        TrabalhadorHora th1 = new TrabalhadorHora("Sofia", 5,5);
        int expected=-1;

        //act
        int result = th1.compareTo(th);

        //assert
        assertEquals(expected, result);
    }
}