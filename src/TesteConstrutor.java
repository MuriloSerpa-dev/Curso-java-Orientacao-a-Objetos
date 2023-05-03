public class TesteConstrutor {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Murilo", 28);

    System.out.println(" Nome: " + pessoa.nome + " sua idade é: " + pessoa.idade + " anos!");

    Pessoa pessoa2 = new Pessoa("Maria");
    
    System.out.println(" Nome: " + pessoa2.nome + " sua idade é: " + pessoa2.idade + " anos! ");

    Pessoa pessoa3 = new Pessoa("Maicon", 28);

    System.out.println(" Nome: " + pessoa3.nome + " sua idade é: " + pessoa3.idade + " anos! ");

}
}
