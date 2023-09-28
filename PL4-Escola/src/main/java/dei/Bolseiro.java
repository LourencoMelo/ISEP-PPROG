package dei;

public class Bolseiro extends Aluno implements Rendimento{
    private float valorBolsa;

    public Bolseiro(String nome, int nic, int numeroMecanografico, float valorBolsa){
        super(nome, nic, numeroMecanografico);
        this.valorBolsa = valorBolsa;
    }


    public float calcVencimento() {
        return valorBolsa;
    }
}
