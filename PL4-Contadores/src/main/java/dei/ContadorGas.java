package dei;

public class ContadorGas extends Contador {

    private float custoUnitario = 0.8f;
    private static final String PREFIXO_POR_OMISSAO_GAS = "GAS-";

    private static int totalGas = 0;


    public ContadorGas(String cliente, float consumo){
        super(PREFIXO_POR_OMISSAO_GAS + (++totalGas), cliente, consumo);
    }

    public ContadorGas(String identificador){
        super(PREFIXO_POR_OMISSAO_GAS + (++totalGas));
    }

    public float getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(float custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    public String toString(){
        return String.format("Contador de gás \n" + super.toString());
    }

    public float calcularFaturaMensal() {
        return getConsumo() * custoUnitario;
    }
}
