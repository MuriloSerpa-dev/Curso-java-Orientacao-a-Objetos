package com.algaworksfjo.interfaces.seguro;

public class CorretoraDeSeguros {
    public void fazerPropostaDeSeguro(Seguravel objetoSeguravel){
        System.out.println("--------------------------------");
        System.out.println("Corretora de seguros - PROPOSTA - ");
        System.out.println("--------------------------------");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println(" Valor da apolice:" + objetoSeguravel.calcularApolice());
        System.out.println("---------------------------------------------\n");
    }
}
