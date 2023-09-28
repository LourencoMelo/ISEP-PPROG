import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //a
        Data data = new Data(2021,4,20);
        //b
        Tempo tempo1 = new Tempo(11,27,40);
        Tempo tempo2 = new Tempo(12, 0, 0);
        //c
        Empregado empregado = new Empregado("José","Maia",data,tempo1,tempo2);
        //d) e e)
        System.out.println(empregado);
        //g)
        Empregado empregado1 = new Empregado("Soares", "Jose", data,tempo1, tempo2);
        data.setData(2020,4,20);
        tempo1.setTempo(11,20,10);
        tempo2.setTempo(13, 4,20);

        ArrayList<Empregado> arrayListEmpregado = new ArrayList<Empregado>();
        arrayListEmpregado.add(empregado);
        arrayListEmpregado.add(empregado1);

        //i e j
        for(Empregado e : arrayListEmpregado){
            System.out.println(e);
        }

        //k
        for(Empregado e : arrayListEmpregado){
            System.out.println(e);
            System.out.println(e.calcularTempoContrato());
            System.out.println(e.calcularHorasTrabalhoSemanal());
        }


    }
}
