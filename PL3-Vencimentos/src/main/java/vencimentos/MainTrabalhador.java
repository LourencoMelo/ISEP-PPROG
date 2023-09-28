package vencimentos;

public class MainTrabalhador {
    public static void main(String[] args) {

        TrabalhadorPeca trabalhadorPeca = new TrabalhadorPeca("Jorge Silva", 53,62);
        TrabalhadorComissao trabalhadorComissao = new TrabalhadorComissao("Susana Ferreira", 650, 2731.50f,4.25f);
        TrabalhadorHora trabalhadorHora = new TrabalhadorHora("Carlos Miguel",168,4.5f);

        Object[] arrayObject = new Object[10];

        arrayObject[0] = trabalhadorPeca;
        arrayObject[1] = trabalhadorComissao;
        arrayObject[2] = trabalhadorHora;

        System.out.println("###   TRABALHADORES     ###");
        for(int i = 0; i < arrayObject.length; i++){
            if(arrayObject[i] != null){
                System.out.println(arrayObject[i].toString());
            }
        }

        System.out.println("###    TRABALHADORES À HORA   ###");
        for(int i = 0; i < arrayObject.length; i++){
            if(arrayObject[i] != null){
                if(arrayObject[i] instanceof TrabalhadorHora) {
                    System.out.println(arrayObject[i].toString());
                }
            }
        }

        System.out.println("### TRALHADORES + VENCIMENTOS");
        for(int i = 0; i < arrayObject.length; i++){
            if(arrayObject[i] != null){
                System.out.println(arrayObject[i].toString());
                Trabalhador trabalhador = (Trabalhador) arrayObject[i];
                System.out.printf("Vencimentos: %.2f", trabalhador.calcularVencimento());
            }
        }

        //Ao ser com a classe TRABALHO NA ALINEA 8 VAI SIMPLICAR AS COISAS EM TERMOS DE CAST NO FINAL
    }
}
