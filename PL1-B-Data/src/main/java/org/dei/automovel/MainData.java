package org.dei.automovel;

import java.util.Date;

public class MainData {
    public static void main(String[] args){
        //a)
        Data data1 = new Data(2021, 03,9);
        //b)
        System.out.println(data1.toString());
        //c)
        Data data2 = new Data(1974,4,25);
        //d)
        System.out.println(data2.toAnoMesDiaString());
        //e)
        if(data1.isMaior(data2)){
            System.out.println("data 1 > data 2");
        }else{
            System.out.println("data 1 <= data 2");
        }
        //f)
        System.out.println(data1.calcularDiferenca(data2));
        //g)
        System.out.println(data1.calcularDiferenca(2021,12,25));
        //h)
        System.out.println(data2.determinarDiaDaSemana());
        //i)
        System.out.println(data2.isAnoBissexto(1974));
        System.out.println(Data.isAnoBissexto(1974));


    }
}
