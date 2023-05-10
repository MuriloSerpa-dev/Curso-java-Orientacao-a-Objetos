package com.algaworksfjo.abstrata;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        Produto produtoPerecivel = new ProdutoPerecivel();
        produtoPerecivel.descricao = "LEITE";


        ProdutoPerecivel pP = (ProdutoPerecivel) produtoPerecivel;
        pP.dataValidade = "09/05/2023";

        produtoPerecivel.imprimirDescricao();
    }
}
