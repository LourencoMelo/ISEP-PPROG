package dei;

public class Reformado extends Contribuintes {

    private float taxaRT = 0.01f;
    private float taxaOR = 0.03f;

    public Reformado(String nome, String morada, float valorRT, float valorOR){
        super(nome, morada, valorRT, valorOR);
    }

    public Reformado(){
        super();
    }

    public float getTaxaRT() {
        return taxaRT;
    }

    public float getTaxaOR() {
        return taxaOR;
    }

    public void setTaxaRT(float taxaRT) {
        this.taxaRT = taxaRT;
    }

    public void setTaxaOR(float taxaOR) {
        this.taxaOR = taxaOR;
    }

    public String toString(){
        return String.format(super.toString() + "\n Impostos: %f", calcularImpostos());
    }

    public float calcularImpostos() {
        return (getValorRT() * taxaRT + getValorOR() * taxaOR);
    }
}
