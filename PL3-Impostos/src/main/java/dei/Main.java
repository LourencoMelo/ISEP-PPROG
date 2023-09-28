package dei;

public class Main {
    public static void main(String[] args) {
        Reformado r1 = new Reformado("Josefino", "Lisboa", 40000f, 2000f);
        Reformado r2 = new Reformado("Igor", "Porto", 30000f, 1000f);

        TrabalhadorOutrem tbo1 = new TrabalhadorOutrem("Gustavo", "Almada", 1000f, 240f, "EDP");
        TrabalhadorOutrem tbo2 = new TrabalhadorOutrem("Joao", "Barreiro", 10000f, 5000f, "Continente");

        TrabalhadorProprio tbp1 = new TrabalhadorProprio("Francisco", "Leça", 4030f, 3040f,"Marceneiro");
        TrabalhadorProprio tbp2 = new TrabalhadorProprio("Nathan", "Gaia", 4000f, 3000f, "Mecanico");

        Desempregado dp1 = new Desempregado("Hugo", "Viso", 10000f, 2000f, 4);
        Desempregado dp2 = new Desempregado("Maria", "Ramalde", 800f, 10f, 2);

        Contribuintes[] contribuintes = new Contribuintes[10];

        contribuintes[0] = r1;
        contribuintes[1] = r2;
        contribuintes[2] = tbo1;
        contribuintes[3] = tbo2;
        contribuintes[4] = tbp1;
        contribuintes[5] = tbp2;
        contribuintes[6] = dp1;
        contribuintes[7] = dp2;

        for(int i = 0 ; i < contribuintes.length; i++){
            if(contribuintes[i] != null){
                System.out.println(contribuintes[i]);
            }
        }

        for(int i = 0 ; i < contribuintes.length; i++){
            if((contribuintes[i] != null) && contribuintes[i] instanceof Desempregado){
                System.out.println(contribuintes[i]);
            }
        }

        Desempregado.setTaxaOR(0.04f);

        for(int i = 0 ; i < contribuintes.length; i++){
            if((contribuintes[i] != null) && contribuintes[i] instanceof Desempregado){
                System.out.println(contribuintes[i]);
            }
        }
    }
}
