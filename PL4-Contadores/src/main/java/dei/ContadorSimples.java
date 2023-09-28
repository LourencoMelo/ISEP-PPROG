package dei;

public class ContadorSimples extends ContadorEletrecidade {

    private static float precoKWH1 = 0.13f;
    private static float precoKWH2 = 0.16f;

    private float potenciaCliente;
    private static final float POTENCIA_POR_OMISSAO = 0;

    private int totalSimples = 0;

    public ContadorSimples(String cliente, float consumo, float potenciaCliente){
        super(cliente, consumo);
        this.potenciaCliente = potenciaCliente;
        totalSimples ++;
    }

    public ContadorSimples(){
        super();
        totalSimples ++;
    }

    public float getPotenciaCliente() {
        return potenciaCliente;
    }

    public void setPotenciaCliente(float potenciaCliente) {
        this.potenciaCliente = potenciaCliente;
    }

    public int getTotalSimples() {
        return totalSimples;
    }

    public String toString(){
        return String.format(super.toString() + "Simples \n");
    }

    public float calcularFaturaMensal() {
        if(potenciaCliente < getPotenciaContratada()){
            return precoKWH1 * getConsumo();
        }else if (potenciaCliente > getPotenciaContratada()){
            return precoKWH2 * getConsumo();
        }else{
            return 0;
        }
    }
}

