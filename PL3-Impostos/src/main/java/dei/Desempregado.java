package dei;

public class Desempregado extends Contribuintes{

    private static float taxaOR = 0.02f;
    private static int mesesParagem;
    private static final int MESES_PARAGEM_POR_OMISSAO = 0;

    public Desempregado(String nome, String morada, float valorRT, float valorOR, int mesesParagem){
        super(nome, morada, valorRT, valorOR);
        this.mesesParagem = mesesParagem;
    }

    public Desempregado(){
        super();
        this.mesesParagem = MESES_PARAGEM_POR_OMISSAO;
    }

    public static float getTaxaOR() {
        return taxaOR;
    }

    public static int getMesesParagem() {
        return mesesParagem;
    }

    public static void setTaxaOR(float taxaOR) {
        Desempregado.taxaOR = taxaOR;
    }

    public static void setMesesParagem(int mesesParagem) {
        Desempregado.mesesParagem = mesesParagem;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Impostos: %f", calcularImpostos());
    }

    public float calcularImpostos() {
        return getValorRT() + getTaxaOR() * taxaOR;
    }
}
