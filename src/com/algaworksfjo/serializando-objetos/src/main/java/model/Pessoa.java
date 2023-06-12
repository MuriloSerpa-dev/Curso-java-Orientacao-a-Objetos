package model;

import java.io.Serializable;

public class Pessoa implements Serializable {
    // Para salvar um objeto em arquivo é necessario implementar a interface Serializable
    // pra um objeto poder ser salvo em um arquivo ou transmitido por uma rede é obrigatorio ser
    // implementado por serializable, todos os atributos tambem tem que implementar serializable

    private String nome;

    private int idade;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


}
