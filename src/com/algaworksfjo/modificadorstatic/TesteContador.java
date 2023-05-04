package com.algaworksfjo.modificadorstatic;

public class TesteContador {
    public static void main(String[] args) {
        Contador.COUNT = 5;
        int valorDoCount = Contador.COUNT;

       System.out.println(valorDoCount);

        Contador c = new Contador();

       c.incrementar();

        System.out.println(Contador.COUNT);

        Contador.COUNT++;
        System.out.println(Contador.COUNT);

        Contador.imprimirContador();
    }

}
