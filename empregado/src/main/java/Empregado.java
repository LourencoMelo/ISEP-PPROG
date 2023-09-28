public class Empregado {

    public String primeiroNome;
    public String ultimoNome;

    public Data dataContrato;

    public Tempo horaEntrada;
    public Tempo horaSaida;

    public static final int DIAS_TRABALHO_SEMANAIS = 5;

    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = dataContrato;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Data getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Tempo getHoraSaida() {
        return horaSaida;
    }


    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", dataContrato=" + dataContrato +
                ", horaEntrada=" + horaEntrada +
                ", horaSaida=" + horaSaida +
                '}';
    }


    public int calcularTempoContrato() {
        Data dataAntiga = new Data(this.dataContrato);
        Data dataNova = Data.dataAtual();
        return dataAntiga.diferenca(dataNova);
    }

    public int calcularHorasTrabalhoSemanal() {
        return (this.horaEntrada.diferencaEmSegundos(this.horaSaida) * DIAS_TRABALHO_SEMANAIS) / 3600;
    }
}
