package dei;

public class Professor extends Pessoa implements Rendimento{

    private String categoria;
    private static float salarioBase = 1500f;
    private static float majoracaoAdjuntos = 0.2f;
    private static float majoracaoCoordenadores = 0.5f;

    private static final String ASSISTENTE = "ASSISTENTE";
    private static final String COORDENADOR = "COORDENADOR";
    private static final String ADJUNTO = "ADJUNTO";
    private static final String CATEGORIA_POR_OMISSAO = "SEM CATEGORIA";

    public Professor(String nome, int nic, String categoria){
        super(nome, nic);
        this.categoria = categoria;
    }

    public Professor(){
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
    }

    public String getCategoria() {
        return categoria;
    }

    public static String getADJUNTO() {
        return ADJUNTO;
    }

    public static String getASSISTENTE() {
        return ASSISTENTE;
    }

    public static String getCOORDENADOR() {
        return COORDENADOR;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static void setMajoracaoCoordenadores(float majoracaoCoordenadores) {
        Professor.majoracaoCoordenadores = majoracaoCoordenadores;
    }

    public static void setMajoracaoAdjuntos(float majoracaoAdjuntos) {
        Professor.majoracaoAdjuntos = majoracaoAdjuntos;
    }

    public static void setSalarioBase(float salarioBase) {
        Professor.salarioBase = salarioBase;
    }


    public float calcVencimento(){
        if(getCategoria().equals(Professor.getADJUNTO())){
            return salarioBase + salarioBase*majoracaoAdjuntos;
        }else if (getCategoria().equals(Professor.getCOORDENADOR())){
            return salarioBase + salarioBase * majoracaoCoordenadores;
        }else{
            return salarioBase;
        }

    }
}
