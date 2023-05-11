package com.algaworks.interfaces.teste.operadoras;

import com.algaworks.interfaces.teste.pagamento.Autorizavel;
import com.algaworks.interfaces.teste.pagamento.Cartao;
import com.algaworks.interfaces.teste.pagamento.Operadora;

public class Cielo implements Operadora {
    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123")
                && autorizavel.getValorTotal() <100;
    }
}
