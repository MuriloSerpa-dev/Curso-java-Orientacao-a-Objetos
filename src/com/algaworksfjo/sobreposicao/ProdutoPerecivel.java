package com.algaworksfjo.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    protected Date dataDeValidade;


    public void identificar(){
        super.identificar();
        System.out.println("Data de validade é:" + dataDeValidade);
    }


}
