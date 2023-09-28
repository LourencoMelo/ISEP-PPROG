package dei;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        final int COMPRIMENTO_ARRAY = 10; //necessario omitir public static !!!!


        ContadorGas GAS_1 = new ContadorGas("Joao", 70);
        ContadorGas GAS_2 = new ContadorGas("Filipe", 90);

        ContadorSimples ELE_1 = new ContadorSimples("Pedro", 100,5.6f);
        ContadorSimples ELE_2 = new ContadorSimples("Pedro", 120, 8f);

        ContadorBiHorario ELE_3 = new ContadorBiHorario("Pedro", 110, 4,8);
        ContadorBiHorario ELE_4 = new ContadorBiHorario("Yolanda", 60, 3,2);

        Contador[] contadores = new Contador[COMPRIMENTO_ARRAY];

        contadores[0] = GAS_1;
        contadores[1] = GAS_2;
        contadores[2] = ELE_1;
        contadores[3] = ELE_2;
        contadores[4] = ELE_3;
        contadores[5] = ELE_4;

        //b
        System.out.println("###            B         ###");
        for (int i = 0; i < COMPRIMENTO_ARRAY; i ++){
            if(contadores[i] != null){
                System.out.println(contadores[i]);
            }
        }

        //c
        System.out.println("###            C         ###");
        //duvida se n dava para fazer com um get
        int count =0;
        for(int i = 0; i < COMPRIMENTO_ARRAY; i ++){
             if(null != contadores[i] && contadores[i] instanceof ContadorEletrecidade){
                  count ++;
             }
        }
        System.out.println(count);

        //d
        System.out.println("###            D         ###");
        for(int j = 0; j < COMPRIMENTO_ARRAY; j++){
            if((contadores[j] != null) && (contadores[j] instanceof ContadorBiHorario)){
                System.out.println(contadores[j]);
            }
        }
        //e
        System.out.println("###            E         ###");
        for(int j = 0; j < COMPRIMENTO_ARRAY; j++){
            if(contadores[j] != null){
                System.out.println(contadores[j].getIdentificador()+ "   " + contadores[j].getConsumo());
            }
        }

        //f
        System.out.println("###            F         ###");
        float maiorConsumo = 0;
        for(int j = 0; j <COMPRIMENTO_ARRAY; j++){
            if((contadores[j] != null) && (contadores[j].getConsumo() >maiorConsumo) && (contadores[j] instanceof  ContadorGas)){
                maiorConsumo = contadores[j].getConsumo();
            }
        }
        System.out.println(maiorConsumo);

        //g
        Arrays.sort(contadores);
        int k = 0;
        while(k < COMPRIMENTO_ARRAY){
            if(k == 0){
                System.out.println(contadores[k].getCliente());
            }
            if(contadores[k].getCliente() == contadores[k+1].getCliente() && k != 0){
                k++;
            }else{
                System.out.println(contadores[k]);
                k ++;
            }
        }
    }
}
