package dei;

public class TrabalhadorOutrem extends Contribuintes {

    private float taxaRT1 = 0.01f;
    private float taxaRT2 = 0.02f;
    private float taxaOR = 0.02f;

    private float valorORPARAMETRO = 30000;

    private String NomeEmpresa;
    private static final String NOME_EMPRESA_POR_OMISSAO = "Sem nome";

    public TrabalhadorOutrem(String nome, String morada, float valorRT, float valorOR, String NomeEmpresa){
        super(nome, morada, valorRT, valorOR);
        this.NomeEmpresa = NomeEmpresa;
    }

    public float getTaxaRT1() {
        return taxaRT1;
    }

    public float getTaxaRT2() {
        return taxaRT2;
    }

    public float getTaxaOR() {
        return taxaOR;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setTaxaRT1(float taxaRT1) {
        this.taxaRT1 = taxaRT1;
    }

    public void setTaxaRT2(float taxaRT2) {
        this.taxaRT2 = taxaRT2;
    }

    public void setTaxaOR(float taxaOR) {
        this.taxaOR = taxaOR;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        NomeEmpresa = nomeEmpresa;
    }

    public String toString(){
        return String.format(super.toString() + "Imposto: %f", calcularImpostos());
    }

    public float calcularImpostos() {
        if(getValorOR()<valorORPARAMETRO){
            return (getValorRT() * taxaRT1 + getValorOR() * taxaOR);
        }else{
            return (getValorRT()* taxaRT2 + getValorOR() * taxaOR);
        }
    }
}
