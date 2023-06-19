import java.util.Scanner;

public class ExemploTryEMultiCast {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Informe seu nome: ");
            String nome = entrada.nextLine();
            System.out.println(nome);

            System.out.println("Informe sua idade: ");
            String idade = entrada.nextLine();
            System.out.println(idade);

            try {
                SalvarAluno.salvar(nome, idade);
            } catch (NegocioException | NumberFormatException e) {
                System.err.println("Impossivel completar operacao motivo " + e.getMessage());

            }
        }
    }
}