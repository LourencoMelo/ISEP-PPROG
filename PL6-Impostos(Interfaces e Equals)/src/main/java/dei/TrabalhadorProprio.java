package dei;

public class TrabalhadorProprio extends Contribuintes {

    private static float taxaRT = 0.03f;
    private static float taxaOR1 = 0.02f;
    private static float taxaOR2 = 0.05f;

    private static String profissao;
    private static final String PROFISSAO_POR_OMISSAO = "Sem profissao";

    private static float valorParametro = 50000;

    public TrabalhadorProprio(String nome, String morada, float valorRT, float valorOR, String profissao){
        super(nome, morada, valorRT, valorOR);
        this.profissao = profissao;
    }

    public TrabalhadorProprio(){
        super();
        this.profissao = PROFISSAO_POR_OMISSAO;
    }

    @Override
    public float getValorRT() {
        return super.getValorRT();
    }

    public static float getTaxaOR1() {
        return taxaOR1;
    }

    public static float getTaxaOR2() {
        return taxaOR2;
    }

    public static String getProfissao() {
        return profissao;
    }

    public static float getValorParametro() {
        return valorParametro;
    }

    public static void setTaxaRT(float taxaRT) {
        TrabalhadorProprio.taxaRT = taxaRT;
    }

    public static void setTaxaOR1(float taxaOR1) {
        TrabalhadorProprio.taxaOR1 = taxaOR1;
    }

    public static void setTaxaOR2(float taxaOR2) {
        TrabalhadorProprio.taxaOR2 = taxaOR2;
    }

    public static void setProfissao(String profissao) {
        TrabalhadorProprio.profissao = profissao;
    }

    public static void setValorParametro(float valorParametro) {
        TrabalhadorProprio.valorParametro = valorParametro;
    }

    public String toString(){
        return String.format(super.toString() + "Imposto: %f", calcularImpostos());
    }

    public float calcularImpostos() {
         if(getValorOR() < valorParametro){
            return getValorRT() * taxaRT + getValorOR() * taxaOR1;
         }else{
            return getValorOR() * taxaRT + getValorOR() * taxaOR2;
         }
    }
}
