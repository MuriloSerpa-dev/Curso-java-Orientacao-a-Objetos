package com.algaworksfjo.sobrecarga;

public class TesteCadastro {
    public static void main(String[] args) {
    CadastroPessoa cadastro = new CadastroPessoa();
    Pessoa pessoa = new Pessoa("Murilo", 28);

    cadastro.cadastrar(pessoa);
    cadastro.cadastrar("Fernando", 35);
    cadastro.cadastrar("Maicon");





    }
}
