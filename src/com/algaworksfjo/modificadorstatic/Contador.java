package com.algaworksfjo.modificadorstatic;

public class Contador {
    public static int COUNT = 0;

    public void incrementar() {
        COUNT++;
    }

    public static void imprimirContador() {
        System.out.println("Valor do contador agora é " + Contador.COUNT);
    }


}
