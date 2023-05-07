package com.algaworksfjo.heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        Tecnico tecnico = new Tecnico();
        Pessoa pessoa = new Pessoa();

        tecnico.nome = "Fenomeno";
        tecnico.idade = 50;
        jogador.nome = "Ronaldo";
        jogador.idade = 28;


        jogador.seApresentar();
        tecnico.Jogando(jogador);
        jogador.dizerAindaAtua();
    }
}
