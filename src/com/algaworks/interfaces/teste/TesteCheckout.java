package com.algaworks.interfaces.teste;

import com.algaworks.interfaces.teste.caixa.Checkout;
import com.algaworks.interfaces.teste.caixa.Compra;
import com.algaworks.interfaces.teste.impressao.Impressora;
import com.algaworks.interfaces.teste.impressoras.HP;
import com.algaworks.interfaces.teste.pagamento.Cartao;
import com.algaworks.interfaces.teste.pagamento.Operadora;
import com.algaworks.interfaces.teste.operadoras.Ton;

public class TesteCheckout {
    public static void main(String[] args) {
        Operadora operadora = new Ton();
        Impressora impressora = new HP();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("Murilo Serpa");
        cartao.setNumeroCartao("000456565600");

        Compra compra = new Compra();
        compra.setNomeCliente("Murilo Serpa");
        compra.setProduto("Sabonete");
        compra.setValorTotal(2.50);

        Checkout checkout = new Checkout(operadora , impressora);
        checkout.fecharCompra(compra, cartao);

    }
}
