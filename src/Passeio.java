public class Passeio {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(" ");
        pessoa.nome = "Andre";

        pessoa.cachorro = new Cachorro();

        pessoa.cachorro.nome = " Ralf";
        pessoa.cachorro.idade = 5;
        pessoa.cachorro.raca = " Pug";
        pessoa.cachorro.sexo = "M";

        Caminhada caminhar = new Caminhada();

        caminhar.andar(pessoa);

    }
}
