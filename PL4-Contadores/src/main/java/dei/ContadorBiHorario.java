package dei;

public class ContadorBiHorario extends ContadorEletrecidade {

    private static float precoVAZIO = 0.066f;
    private static float getPrecoFORA = 0.14f;

    private int horasVazio;
    private int horasFora;

    private static int totalBiHorario = 0;

    public ContadorBiHorario(String cliente, float consumo, int horasVazio, int horasFora){
        super(cliente, consumo);
        this.horasVazio = horasVazio;
        this.horasFora = horasFora;
        totalBiHorario ++;
    }

    public ContadorBiHorario(){
        super();
        horasVazio = 0;
        horasFora = 0;
        totalBiHorario ++;
    }

    public int getHorasVazio() {
        return horasVazio;
    }

    public int getHorasFora() {
        return horasFora;
    }

    public void setHorasVazio(int horasVazio) {
        this.horasVazio = horasVazio;
    }

    public void setHorasFora(int horasFora) {
        this.horasFora = horasFora;
    }



    public String toString(){
        return String.format(super.toString() + "BiHorario \n" + "Hora Vazio: %d \n Hora Fora: %d \n",horasVazio, horasFora);
    }

    public float calcularFaturaMensal() {
        return (horasVazio * precoVAZIO + horasFora * getPrecoFORA);
    }
}
