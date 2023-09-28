package dei;

import java.util.Objects;

public abstract class Contribuintes {
    //variaveis de classe
    private String nome;
    //Constante
    private static final String NOME_POR_OMISSAO = "Sem Nome";

    private String morada;
    private static final String MORADA_POR_OMISSAO = "Sem Morada";

    private float valorRT;
    private static final float VALOR_RT_POR_OMISSAO = 0;

    private float valorOR;
    private static final float VALOR_OR_POR_OMISSAO = 0;
    //variavel normal
    private static int totalContribuentes = 0;

    public Contribuintes(String nome, String morada, float valorRT, float valorOR){
        this.nome = nome;
        this.morada = morada;
        this.valorRT = valorRT;
        this.valorOR = valorOR;
        totalContribuentes ++;
    }

    public Contribuintes(){
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
        valorRT = VALOR_RT_POR_OMISSAO;
        valorOR = VALOR_OR_POR_OMISSAO;
        totalContribuentes ++;
    }

    public String getNome(){
        return nome;
    }

    public String getMorada(){
        return morada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Contribuintes that = (Contribuintes) o;

        if(this.nome.equals(that.nome) && this.morada.equals(that.morada)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public float getValorRT(){
        return valorRT;
    }

    public float getValorOR(){
        return valorOR;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setValorRT(float valorRT) {
        this.valorRT = valorRT;
    }

    public void setValorOR(float valorOR) {
        this.valorOR = valorOR;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s  Morada: %s  ValorRT: %s   ValorOR: %s ",nome,morada,valorRT,valorOR);
    }

    public abstract float calcularImpostos();


}
