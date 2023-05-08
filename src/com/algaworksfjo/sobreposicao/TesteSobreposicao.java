package com.algaworksfjo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {
    public static void main(String[] args) {
       ProdutoPerecivel produtop = new ProdutoPerecivel();

       produtop.descricao = "Caixa de fosforo";
       produtop.dataDeValidade = new Date();

       produtop.identificar();


    }
}
