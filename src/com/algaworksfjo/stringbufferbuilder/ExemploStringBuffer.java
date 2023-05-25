package com.algaworksfjo.stringbufferbuilder;

public class ExemploStringBuffer {
    /*Diferente de String StringBuffer e Builder ela sao classes multaveis, podem concatenar adicionar, sem ter que
     criar outras variaveis
    */
    public static void main(String[] args) {

        //StringBuffer sb = new StringBuffer(); > // thread-safe - use no contexto de concorrencia
        StringBuilder sb = new StringBuilder();  //  > não thread-safe - mais rapido, não tem verificação se tem mais gente usando

        sb.append("Bem vindo ao curso de java. ");
        sb.append("Fique a vontade para tirar suas duvidas, ");
        sb.append("Estamos aqui pra ajudar ");

        System.out.println(sb.toString());

        sb.insert(26, " da algaworks");

        System.out.println(sb);
    }
}
