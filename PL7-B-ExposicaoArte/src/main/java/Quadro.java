import java.util.Objects;

public class Quadro implements Comparable<Quadro> {
    public String designacao;
    public String nomeAutor;
    public int anoCriacao;

    public Quadro(String designacao, String nomeAutor, int anoCriacao) {
        this.designacao = designacao;
        this.nomeAutor = nomeAutor;
        this.anoCriacao = anoCriacao;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadro quadro = (Quadro) o;
        return anoCriacao == quadro.anoCriacao &&
                Objects.equals(designacao, quadro.designacao) &&
                Objects.equals(nomeAutor, quadro.nomeAutor);
    }

    @Override
    public int compareTo(Quadro o){
        Quadro quadroNovoObjeto = (Quadro) o;
        int result;
        result = this.nomeAutor.compareTo(quadroNovoObjeto.getNomeAutor());
        return result;
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "designacao='" + designacao + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", anoCriacao=" + anoCriacao +
                '}';
    }
}
