package com.algaworksfjo.classemath;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantidade de participantes:");

        int quantidadeDeJogos = entrada.nextInt();

        for (int i = 0; i < quantidadeDeJogos ; i++) {
            MegaSenna mega = new MegaSenna();

            mega.sortear();
            mega.exibirNumeros(quantidadeDeJogos);

        }

    }
}