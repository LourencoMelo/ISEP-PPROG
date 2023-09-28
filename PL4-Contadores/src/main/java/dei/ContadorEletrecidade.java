package dei;

public abstract class ContadorEletrecidade extends Contador {

    protected static int totalEletrecidadeSux;
    protected static final String PREFIXO_POR_OMISSAO_ELE = "ELE-";
    protected float potenciaContratada = 6.9f;
    public int totalEletrecidade;

    public ContadorEletrecidade(String cliente, float consumo){
        super(PREFIXO_POR_OMISSAO_ELE + (++totalEletrecidadeSux), cliente, consumo);
        totalEletrecidade++;
    }

    public abstract float calcularFaturaMensal();

    public ContadorEletrecidade(){
        super(PREFIXO_POR_OMISSAO_ELE + (++totalEletrecidadeSux));
        totalEletrecidade++;
    }

    public String toString(){
        return String.format("Contador Eletrecidade \n" + super.toString()+"\n");
    }

    public float getPotenciaContratada() {
        return potenciaContratada;
    }

    public int getTotalEletrecidade() {
        return totalEletrecidade;
    }
}
