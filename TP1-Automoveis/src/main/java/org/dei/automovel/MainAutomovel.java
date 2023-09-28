package org.dei.automovel;

public class MainAutomovel {
    public static void main(String[] arg) {
        //a)
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);

        //b)
        System.out.println("Automovel a1: " + a1.toString());

        //c)
        System.out.println("Matricula a1:" + a1.getMatricula());

        //d)
        System.out.println("Qnt automoveis: " + Automovel.getTotalAutomoveis());

        //e)
        Automovel a2 = new Automovel("22-22-BB", "Audi");

        //f)
        System.out.println("Automovel a2:" + a2.toString());

        //g)
        a2.setCilindrada(1800);

        //h)
        System.out.println("Automovel a2 modificado" + a2.toString());

        //i)
        System.out.println("Qnt automoveis:" + Automovel.getTotalAutomoveis());

        //j)
        System.out.println("Diferença de cilindradas" + Math.abs(a1.calcularDiferencaCilindrada(a2)));

        //k)
        if (a1.isCilindradaMaior(a2)) {
            System.out.println("Automovel com maior cilindra:" + a1.getMatricula());
        } else if (a2.isCilindradaMaior(a1)) {
            System.out.println("Automovel com maior cilindra:" + a2.getMatricula());
        }

        //l)
        if (a1.isCilindradaMaior(2000)) {
            System.out.println("O automovel com a matricula" + a1.getMatricula() + "tem cilindrada superior a 2000");
        } else{
        System.out.println("O automovel tem menos de 2000 de cilindrada");
        }


    }

}
