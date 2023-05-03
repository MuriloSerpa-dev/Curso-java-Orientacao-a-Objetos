public class TesteJavaBean {
    public static void main(String[] args) {
        PessoaBean pessoa = new PessoaBean();

        pessoa.setNome("Bernardo");
        pessoa.setIdade(5);

        System.out.println(pessoa.getNome() + " tem idade " + pessoa.getIdade());

    }
}
