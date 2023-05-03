public class Pessoa {
    String nome;
    int idade;
    Cachorro cachorro;

    Pessoa(String nome){
    this.nome = nome;
    }
    Pessoa(String nome, int idade){
        this(nome);
        this.idade = idade;
    }
}
