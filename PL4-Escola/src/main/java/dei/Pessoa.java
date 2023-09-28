package dei;

public class Pessoa {
    private String nome;
    private int nic;

    private static final String NOME_POR_OMISSAO = "Sem nome";
    private static final int NIC_POR_OMISSAO = 000000;

    public Pessoa(String nome, int nic){
        this.nome = nome;
        this.nic = nic;
    }

    public Pessoa (){
        this.nome = NOME_POR_OMISSAO;
        this.nic = NIC_POR_OMISSAO;
    }

    public String getNome() {
        return nome;
    }

    public int getNic() {
        return nic;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNic(int nic) {
        this.nic = nic;
    }


}
