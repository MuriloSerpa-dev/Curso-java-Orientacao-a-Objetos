package com.algaworksfjo.interfaces.seguro;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(17000d , 2010);
        Imovel meuImovel = new Imovel(150000d, 220 );
        Barco meuBarco = new Barco(350000 , 2022, false
        );
        Notebook meuNotebbok = new Notebook(4500, 2021);

        CorretoraDeSeguros corretora = new CorretoraDeSeguros();

        corretora.fazerPropostaDeSeguro(meuCarro);
        corretora.fazerPropostaDeSeguro(meuImovel);
        corretora.fazerPropostaDeSeguro(meuBarco);
        corretora.fazerPropostaDeSeguro(meuNotebbok);

    }
}
