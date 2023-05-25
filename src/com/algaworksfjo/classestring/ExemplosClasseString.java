package com.algaworksfjo.classestring;

import java.util.Locale;

public class ExemplosClasseString {
    public static void main(String[] args) {
        String nome = "Pedro";
        System.out.println(nome.toUpperCase());
        System.out.println(nome);

        nome = nome.toUpperCase();
        System.out.println(nome);

        System.out.println("-------------------");

        String s1 = "Pedro";
        String s2 = "Pedro";
        System.out.println(" s1 == s2?"+(s1 == s2));

        String s3 = new String("Pedro");
        System.out.println("s3 == s1 ?" + (s3 == s1));
        /* Conteudo da String é o mesmo porem o operador == não esta comparando o conteudo da String, no primeiro caso é porque
        * eles estavam apontando para o mesmo lugar apos criar um novo objeto não vai estar apontadno para o mesmo lugar*/


        System.out.println("s1.eequal(s2)? " + (s1.equals(s2)));
        System.out.println("s3.eequal(s1)? " + (s3.equals(s1))); // forma correta de fazer comparaçao com String é feita com Equals

        String s4 = "PeDrO";

        System.out.println("s1.equals(s4)? " + (s1.equals(s4)));
        System.out.println("s1.equalsIgnoreCase(s4)? " +(s1.equalsIgnoreCase(s4))); // Significa que faz comparacao sem comparar maisculas ou minusculas

    }
}
