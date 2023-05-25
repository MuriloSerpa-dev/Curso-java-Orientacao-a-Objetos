package com.algaworksfjo.classestring;

public class ExemploClasseString6 {
    public static void main(String[] args) {
        String s = "Cursos_online_de_desenvolvimento_de_software";

        String [] array = s.split("_"); //Ele separa a String pela escolha em Split

        for (int i = 0; i < array.length ; i++) {
            System.out.println(" [ " + i + " ]" + array[i]);


        }
    }
}
