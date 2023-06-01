import modelo.Funcionario;

/**
 * The type Teste.
 */
public class Teste {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Murilo", 3000);
        System.out.println(funcionario.adiantamentoDeViagem(5,true));
    }
}
