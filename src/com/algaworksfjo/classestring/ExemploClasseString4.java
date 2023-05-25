package com.algaworksfjo.classestring;

public class ExemploClasseString4 {
    public static void main(String[] args) {
       /* metodos SUBSTRING
        public String substring(int beginIndex) > recebe o indicie inicial
        public String substring(int beginIndex, int endIndex) > recebe inicial e final exceto a final

        */

        String s = "Desenvolvimento Java";
        System.out.println(s.substring(16));// Nesse cao pega da posicao 16 para frete e faz sua impressao

        String s2 = "Cursos online de desenvolvimento de software";
        System.out.println(s2.substring(7,12));


    }
}
