package com.algaworksfjo.ordemacaoobj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(22,"João");
        Pessoa p2 = new Pessoa(23,"Adriana");
        Pessoa p3 = new Pessoa(21,"Bruno");


        List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);

        Collections.sort(pessoas);// Espera uma lista de objetos comparaveis que implementam a interface Comparable,
        // espera uma classe que implementa comparable

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa);

        }
    }
}
