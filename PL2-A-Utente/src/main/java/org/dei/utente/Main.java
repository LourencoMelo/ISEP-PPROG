package org.dei.utente;

public class Main {
    public static void main(String[] args) {
        Utente u1 = new Utente(19,180, 19, "Lourenço", "Masculino");
        Utente u2 = new Utente(19, "Joao");

        Utente[] utentes = new Utente[2];

        utentes[0] = u1;
        utentes[1] = u2;

        //c i)
        for(int i = 0; i < utentes.length; i++){
            System.out.println(utentes[i]);
        }
        //c ii)
        for(int i = 0; i < utentes.length; i++){
            System.out.printf("Nome %s ; Valor IMC: %f ; Grau obesidade: %s \n", utentes[i].getNome(), utentes[i].calcularIMC(), utentes[i].determinarGrauObesidade());
        }
        //c iii)
        for(int i = 0; i < utentes.length; i++){
            if(utentes[i].determinarGrauObesidade() != "Saudável"){
                System.out.printf("Nome %s ; Grau obesidade %s \n", utentes[i].getNome(), utentes[i].determinarGrauObesidade());
            }
        }

        //d)
        Utente.setMinIMC(20);
        Utente.setMaxIMC(27);
        for(int i = 0; i < utentes.length; i++){
            System.out.printf("Nome %s ; Valor IMC: %f ; Grau obesidade: %s \n", utentes[i].getNome(), utentes[i].calcularIMC(), utentes[i].determinarGrauObesidade());
        }

        //e)
        u1.setIdade(u2.getIdade());

        //f)
        u1.determinarMaisNovo(u2);
    }
}
