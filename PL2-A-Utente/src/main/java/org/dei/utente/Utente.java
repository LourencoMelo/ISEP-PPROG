package org.dei.utente;

public class Utente {

    private float idade;
    private float altura;
    private float peso;
    private String nome;
    private String genero;

    private static final float IDADE_POR_OMISSAO = 18;
    private static final float ALTURA_POR_OMISSAO = (float) 1.80;
    private static final float PESO_POR_OMISSAO = 65;
    private static final String NOME_POR_OMISSAO = "Anónimo";
    private static final String GENERO_POR_OMISSAO = "Sem genero";

    private static int minIMC = 18;
    private static int maxIMC = 25;
    private static int totalUtentes = 0;

    public Utente(float idade, float altura, float peso, String nome, String genero){
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        this.genero = genero;
        totalUtentes ++;
    }

    public Utente(float idade, String nome){
        this.idade = idade;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        this.nome = nome;
        this.genero = GENERO_POR_OMISSAO;
        totalUtentes ++;
    }

    public Utente(){
        this.idade = IDADE_POR_OMISSAO;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        this.nome = NOME_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        totalUtentes ++;
    }

    public float getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }

    public static float getminIMC(int i){
        return minIMC;
    }

    public static float getmaxIMC(){
        return maxIMC;
    }

    public static int getTotalUtentes(){
        return totalUtentes;
    }

    public void setIdade(float idade){
        this.idade = idade;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static void setMinIMC(int minIMC) {
        Utente.minIMC = minIMC;
    }

    public static void setMaxIMC(int maxIMC) {
        Utente.maxIMC = maxIMC;
    }

    @Override
    public String toString(){
        return String.format("Idade: %f ;Altura: %f; Peso: %f ;Nome: %s ;Genero %s",idade,altura,peso,nome,genero);
    }

    public Utente determinarMaisNovo(Utente utente){
        if (this.idade < utente.idade){
            return this;
        }else{
            return utente;
        }
    }

    public float calcularIMC(){
        return (float) (peso/(Math.pow(altura,2)));
    }

    public String determinarGrauObesidade(){
        float imc = calcularIMC();
        String grau = "";
        if (imc< minIMC && imc >0){
            grau = "Magro";
        }else if (imc >= minIMC && imc <= maxIMC){
            grau = "Saudável";
        }else if (imc >25){
            grau = "Obeso";
        }
        return grau;
    }

    public boolean isSaudavel(){
        float imc = calcularIMC();
        return ((imc>=minIMC) &&(imc<=maxIMC));
    }
}

