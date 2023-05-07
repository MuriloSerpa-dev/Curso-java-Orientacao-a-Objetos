package com.algaworksfjo.heranca;

public class Jogador extends Pessoa{

    protected boolean aindaJoga = false;

    public void dizerAindaAtua(){
        System.out.println("Ainda atua? " + aindaJoga);
    }
}
