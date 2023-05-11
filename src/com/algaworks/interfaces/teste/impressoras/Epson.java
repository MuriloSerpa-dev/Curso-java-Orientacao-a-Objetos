package com.algaworks.interfaces.teste.impressoras;

import com.algaworks.interfaces.teste.impressao.Impressora;
import com.algaworks.interfaces.teste.impressao.Imprimivel;

public class Epson implements Impressora {
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("-----------------------------");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("----------------------------");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println("----------------------------");
        System.out.println("------------EPSON----------------");
    }
}
