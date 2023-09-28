package dei;

public abstract class Contador{
    private String identificador;
    private String cliente;
    private float consumo;

    private static final String IDENTIFICADOR_POR_OMISSAO = "Sem identificador";
    private static final String CLIENTE_POR_OMISSAO = "Sem cliente";
    private static final float CONSUMO_POR_OMISSAO = 0f;

    public Contador(String identificador, String cliente, float consumo){
        this.identificador = identificador;
        this.cliente = cliente;
        this.consumo = consumo;
    }

    public Contador(String identificador){
        this.identificador = identificador;
    }

    public Contador(){
        this.identificador = IDENTIFICADOR_POR_OMISSAO;
        this.cliente = CLIENTE_POR_OMISSAO;
        this.consumo = CONSUMO_POR_OMISSAO;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCliente() {
        return cliente;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String toString(){
        return String.format("Idenfticador: %s \n Cliente: %s \n Consumo: %f \n", identificador, cliente, consumo);
    }

    public abstract float calcularFaturaMensal();
}
