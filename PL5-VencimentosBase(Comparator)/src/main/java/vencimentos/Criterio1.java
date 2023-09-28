package vencimentos;

import java.util.Comparator;

public class Criterio1 implements Comparator<Trabalhador> {
    @Override
    public int compare(Trabalhador o1, Trabalhador o2) {
        double vencimento1 = o1.calcularVencimento();
        double vencimento2 = o2.calcularVencimento();

        if(vencimento1 < vencimento2){
            return -1;
        }else if ( vencimento1 > vencimento2){
            return 1;
        }else{
            return 0;
        }
    }
}
