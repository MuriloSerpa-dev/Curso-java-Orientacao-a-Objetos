package com.algaworksfjo.strings;

import org.w3c.dom.ls.LSOutput;

public class TesteStrings {
    public static void main(String[] args) {


        String s = "Olá ";// Criada a string "Ola"
        s = s + "Pessoal"; // Criada a string "Ola Pessoal"



        StringBuilder sb = new StringBuilder("Ola,");// Existe a StringBuilder
        sb.append("Pessoal"); // Reaproveitando a StringBuilder


        String resultado = sb.toString();
        System.out.println("Com StringBuilder:" + resultado);
    }

}
