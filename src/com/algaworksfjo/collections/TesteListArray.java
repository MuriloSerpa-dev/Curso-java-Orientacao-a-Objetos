package com.algaworksfjo.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArray {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Jose");
        Aluno a4 = new Aluno("Pedro");

        List<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);

        imprimirAlunos(alunos);
    }
    public static void imprimirAlunos(List<Aluno> alunos){
        for (Aluno a: alunos) {
            System.out.println("Nome do aluno: " + a.getNome());
        }

    }
}
