package com.algaworks.interfaces.teste.operadoras;

import com.algaworks.interfaces.teste.pagamento.Autorizavel;
import com.algaworks.interfaces.teste.pagamento.Cartao;
import com.algaworks.interfaces.teste.pagamento.Operadora;

public class Ton implements Operadora {
    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("000")
                && autorizavel.getValorTotal() <200;
    }
}
