import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Quadro> quadroList = new ArrayList<>();

        Quadro q1 = new Quadro("Cor", "Pablito",2002);
        Quadro q2 = new Quadro("Sopa", "Joana",2001);
        Quadro q3 = new Quadro("Jolas", "Pedro Alves", 1999);

        quadroList.add(q1);
        quadroList.add(q2);
        quadroList.add(q3);

        Exposicao exposicao = new Exposicao("RAMALDE", 2011, quadroList);

        System.out.println(exposicao.toString());

    }
}
