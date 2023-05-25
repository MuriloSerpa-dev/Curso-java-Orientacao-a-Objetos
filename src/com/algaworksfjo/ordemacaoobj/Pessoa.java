package com.algaworksfjo.ordemacaoobj;

public class Pessoa implements Comparable<Pessoa>{  // É necessario que seja implementado Comparable a classe
    private int idade;
    private String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() { // Sobre escrevo o metodo toString para imprimir com o formato desejado no retorno
        return this.nome + " tem " + this.idade + "anos";
    }

    @Override
    public int compareTo(Pessoa pessoa) { // Quando implementado o comparable gero o metodo compareTo para fazer a comparacao
        return this.nome.compareTo(pessoa.getNome()); // Como nome é uma String uso compareTo para fazer a comparacao
    }
}
