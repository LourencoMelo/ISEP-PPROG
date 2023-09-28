package vencimentos;

import org.junit.Test;

import static org.junit.Assert.*;

public class Criterio1Test {

    @Test
    public void compare() {
        Trabalhador t1 = new TrabalhadorHora("aaa",10,10);
        Trabalhador t2 = new TrabalhadorHora("bbb",10,5);
        int expected =111;

        Criterio1 c= new Criterio1();

        int result = c.compare(t1,t2);

        assertEquals(expected,result);
    }
}