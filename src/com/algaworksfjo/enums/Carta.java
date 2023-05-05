package com.algaworksfjo.enums;

public class Carta {
    private int numero;
    private Naipe naipe;

    Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public void imprimir(){
        System.out.println(numero +" de naipe "+ naipe + " e sua cor é "+ naipe.getCor() );
    }
}