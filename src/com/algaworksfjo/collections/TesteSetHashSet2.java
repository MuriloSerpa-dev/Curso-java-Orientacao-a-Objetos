package com.algaworksfjo.collections;

import java.util.Set;

public class TesteSetHashSet2 {
    public static void main(String[] args) {

        Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

        Aluno alunoSorteado = new Aluno("Maria");

        if (alunos.contains(alunoSorteado)){
            System.out.println("Parabens " + alunoSorteado.getNome()+ " você foi sorteado!");
        } else {
            System.out.println("Sem cadastro");
        }

    }
}