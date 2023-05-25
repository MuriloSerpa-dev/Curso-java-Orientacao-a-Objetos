package com.algaworksfjo.ordemacaoobj;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(22,"João");
        Pessoa p2 = new Pessoa(23,"Adriana");
        Pessoa p3 = new Pessoa(21,"Bruno");


        List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
        IdadeComparator idadeComparator = new IdadeComparator();

        Collections.sort(pessoas, idadeComparator);/* Nesse metodo posso colocar outra opcao que pode ser o comparator,
        ao inves de usar a comparacao natural que fizemos na classe pessoa, ele faz a comparacao que fizermos na
         classe comparator */

        // adicionado no java 8 nao preciso passar o Collections posso passar a lista diretamente e passar o comparator.
        pessoas.sort(idadeComparator);


        //For apartir do java , para cada elemento chame o metodo que no caso e o print
        pessoas.forEach(System.out::println);

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa);

        }
    }
}
