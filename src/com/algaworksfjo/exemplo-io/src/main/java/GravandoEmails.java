import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {
    public static void main(String[] args) {


        String[] emails = {"joao@joao.com", "maria@3maria.com", "ricardo@3ricado.com"};

        // Simulando a entrada de dados, recebendo dados do array emnails
       // try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))){
        // Usamos o Buffer para receber os dados e descarregar no arquivo,  nele criamos o objeto e passo o nome
        // do arquivo, se quizermos fazer o append é na segunda opcao ele recebe um boleean que passei true

        try(PrintStream writer = new PrintStream("emails2.txt")){
            /*
            * Dessa forma */
            for (String email : emails) {
                // percorrendo a lista de emails para passar o arquivo para o objeto
               // writer.write(email);
               // writer.newLine();
                writer.println(email);
            }
        } catch (IOException e) {
            System.err.println("Não conseguiu gravar o arquivo. " + e.getMessage());
        }
    }
}

