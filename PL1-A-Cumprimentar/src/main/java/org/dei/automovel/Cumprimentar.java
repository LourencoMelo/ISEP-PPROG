package org.dei.automovel;

public class Cumprimentar {

    private String nome;
    private int idade;

    private static final String NOME_POR_OMISSAO = "Anonimo";
    private static final int IDADE_POR_OMISSAO = 0;

    public Cumprimentar(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Cumprimentar(){
        this.nome = NOME_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String toString(){
        return String.format(nome+ " tem:" + idade +"anos.");
    }
}
