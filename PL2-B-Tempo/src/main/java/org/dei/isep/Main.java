package org.dei.isep;

public class Main {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(5, 30,12);
        System.out.println(t1.AmOrPm());
        System.out.println(t1.add1Second());
        System.out.println(t1.AmOrPm());
        Tempo t2 = new Tempo(18,5,20);
        System.out.println(t2.AmOrPm());
        System.out.println(t1.isMaior(t2));
        System.out.println(t1.isMaior(23,7,4));
        System.out.println( t1.diferençaSegundos(t2));
    }
}
