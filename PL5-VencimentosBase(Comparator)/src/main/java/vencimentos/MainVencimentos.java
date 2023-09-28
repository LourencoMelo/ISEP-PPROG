package vencimentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 
                                                          500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabs);

        System.out.println("###  Comparator   ####");
        //7a)
        System.out.println("###  Crescente   ####\n");
//        Comparator<Trabalhador> crescente = new Comparator<Trabalhador>() {
//            @Override
//            public int compare(Trabalhador o1, Trabalhador o2) {
//                double vencimento1 = o1.calcularVencimento();
//                double vencimento2 = o2.calcularVencimento();
//
//                if(vencimento1 < vencimento2){
//                    return -1;
//                }else if ( vencimento1 > vencimento2){
//                    return 1;
//                }else{
//                    return 0;
//                }
//            }
//        };
        Criterio1 crescente = new Criterio1();

        Collections.sort(trabs, crescente);
        listar(trabs);

        System.out.println("### Decrescente ### \n");
        //7b)
        Comparator<Trabalhador> decrescente = new Comparator<Trabalhador>() {
            @Override
            public int compare(Trabalhador o1, Trabalhador o2) {
                double vencimento1 = o1.calcularVencimento();
                double vencimento2 = o2.calcularVencimento();

                if(vencimento1 > vencimento2){
                    return -1;
                }else if ( vencimento1 < vencimento2){
                    return 1;
                }else{
                    return 0;
                }
            }
        };

        Collections.sort(trabs, decrescente);
        listar(trabs);

        System.out.println("### Ordenar por ordem alfabetica ###");
        //7c)
        Comparator<Trabalhador> alfabetico = new Comparator<Trabalhador>() {
            @Override
            public int compare(Trabalhador o1, Trabalhador o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        };
        Collections.sort(trabs, alfabetico);
        listar(trabs);



    }



    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(), 
                                    trab.calcularVencimento());
            }
        }
    }

}
