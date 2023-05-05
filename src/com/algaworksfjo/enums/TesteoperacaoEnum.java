package com.algaworksfjo.enums;

import java.sql.SQLOutput;

public class TesteoperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritimetica operacao1 = OperacaoAritimetica.ADICAO;

        int resultado1 = operacao1.operacao(5,10);

        System.out.println(" o Resultado da adição é: " + resultado1);

        for(OperacaoAritimetica oa : OperacaoAritimetica.values()){
            System.out.println(oa + " - " + oa.operacao(30,10));
        }

    }
}
