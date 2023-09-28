package dei;

public class Aluno extends Pessoa{
    private int numeroMecanografico;
    private static final int NUMERO_MEC_POR_OMISSAO = 000000;

    public Aluno(String nome, int nic, int numeroMecanografico){
        super(nome, nic);
        this.numeroMecanografico = numeroMecanografico;
    }

    public Aluno(){
        super();
        this.numeroMecanografico = NUMERO_MEC_POR_OMISSAO;
    }

    public int getNumeroMecanografico() {
        return numeroMecanografico;
    }

    public void setNumeroMecanografico(int numeroMecanografico) {
        this.numeroMecanografico = numeroMecanografico;
    }
}
