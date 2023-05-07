package com.algaworksfjo.heranca;

public class Pessoa {
    protected String nome;
    protected int idade;

     public void seApresentar(){
         System.out.println("Ola eu sou "+ nome + " tenho idade " + idade);
     }
    public void Jogando(Jogador jogador){
        System.out.println(nome + " Foi o treinador do " + jogador.nome);
    }
}
