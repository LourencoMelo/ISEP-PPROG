package dei;

public class Escola {
    public static void main(String[] args) {
        //a
        Professor p1 = new Professor("Jorge Duarte", 999000, Professor.getADJUNTO());
        Professor p2 = new Professor("Sandrinha", 888000,Professor.getASSISTENTE());
        Professor p3 = new Professor("Margarida", 222333, Professor.getCOORDENADOR());

        Aluno p4 = new Aluno("Zezoca", 9909090, 111999);
        Aluno p5 = new Aluno("Burqina", 912344, 122444);

        Bolseiro p6 = new Bolseiro("Sonia", 999999, 1212111, 200);
        Bolseiro p7 = new Bolseiro("Daizer", 222233, 111234,140);

        Pessoa[] pessoas = new Pessoa[7];

        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        pessoas[3] = p4;
        pessoas[4] = p5;
        pessoas[5] = p6;
        pessoas[6] = p7;

        //b
        System.out.println("\n ###            B         ### ");
        for(int i = 0; i < pessoas.length; i ++){
            if(pessoas[i] != null && pessoas[i] instanceof Professor) {
                System.out.printf("\n Nome: %s \n  Categoria: %s%n", pessoas[i].getNome(),((Professor) pessoas[i]).getCategoria());
            }
        }

        //c
        System.out.println("\n ###            C         ###");
        for(int i= 0; i < pessoas.length; i++){
            if(pessoas[i] !=null && pessoas[i] instanceof Aluno && !(pessoas[i] instanceof Bolseiro)){
                System.out.printf("\n Nome: %s \n Mecanografico: %d  ", pessoas[i].getNome(), ((Aluno) pessoas[i]).getNumeroMecanografico());
            }
        }
        //d
        System.out.println("\n ###            D         ### ");
        for(int i =0 ; i < pessoas.length;i++){
            if(pessoas[i] != null){
                System.out.printf("\n Nome: %s \n Classe: %s", pessoas[i].getNome(), pessoas[i].getClass());
            }
        }

        //e
        System.out.println("\n ###            E         ### ");
        for(int i= 0 ; i < pessoas.length; i++){
            if(pessoas[i] != null && pessoas[i] instanceof Professor){
                System.out.printf("\n Nome: %s \n Salario: %.2f",pessoas[i].getNome(), ((Professor) pessoas[i]).calcVencimento());
            }
        }
        //F
        System.out.println("\n ###            F         ### ");
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] != null && pessoas[i] instanceof Bolseiro){
                System.out.printf("\n Nome: %s \n Bolsa: %.2f \n", pessoas[i].getNome(), ((Bolseiro) pessoas[i]).calcVencimento());
            }
        }

        //G
        System.out.println("\n ###            G         ### ");
        float encargos = 0;
        for(int i = 0; i < pessoas.length; i ++){
            if(pessoas[i] != null && pessoas[i] instanceof Rendimento){
                encargos += ((Rendimento) pessoas[i]).calcVencimento();
            }
        }
        System.out.printf("Encargos totais: %.2f", encargos);

    }
}
