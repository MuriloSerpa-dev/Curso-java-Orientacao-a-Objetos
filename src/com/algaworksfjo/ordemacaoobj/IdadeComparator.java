package com.algaworksfjo.ordemacaoobj;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) { // recebo os dois objetos que quero comparar
        if (p1.getIdade() < p2.getIdade()){ // se idade p1 for menor idade, significa que p1 precisa vir na frente de p2
            return -1;
        } else if (p1.getIdade() > p2.getIdade()) { // Se p1 for maior significa que p2 precisa vir primeiro
            return 1;
        }
        return 0; // se for igual continua nas mesmas posicoes
    }
}
