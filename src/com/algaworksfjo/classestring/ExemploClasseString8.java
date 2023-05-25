package com.algaworksfjo.classestring;

public class ExemploClasseString8 {
    public static void main(String[] args) {
        String s = "Java";

        int indice = s.indexOf('a'); //Devolve a posicao do primeiro character escolhido que ele encontrou
        System.out.println(indice);

        indice = s.lastIndexOf("a");// Devolve a ultima posicao do character escolhido
        System.out.println(indice);
    }
}
