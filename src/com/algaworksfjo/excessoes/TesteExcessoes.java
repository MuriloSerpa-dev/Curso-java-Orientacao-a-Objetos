package com.algaworksfjo.excessoes;

public class TesteExcessoes {
    public static void main(String[] args) {
        /* int numero = 5 / 0; // Lança java.lang.ArithmeticException
        String s = null;
        String maiuscula = s.toUpperCase(); // Lança java.lang.NullPointerException */

            ContaCorrente cc = new ContaCorrente(100);
            try {
                cc.depositar(-10);
            } catch(IllegalArgumentException e){
                System.out.println("Você executou um operação ilegal: " + e.getMessage());
            }


    }
}
