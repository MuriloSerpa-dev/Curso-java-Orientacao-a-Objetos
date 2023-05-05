package com.algaworksfjo.enums;

public enum Naipe {

    OURO("Vermelho"),
    PAUS("Preto"),
    ESPADA("Azul"),
    COPAS("Verde");

    Naipe(String cor){
        this.cor = cor;
    }
    private String cor;

    public String getCor() {
        return cor;
    }
}
