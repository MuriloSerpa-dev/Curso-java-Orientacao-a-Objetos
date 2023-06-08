import java.io.*;

public class EnviandoEmails {
    public static void main(String[] args) throws FileNotFoundException {

        try (BufferedReader reader = new BufferedReader(new FileReader("emails2.txt"))) {
            // Buffer Reader é um Buffer de leitura um input de leitura

            String email = null;

            while ((email = reader.readLine()) != null) {
                System.out.println("enviando email para" + email);
                email = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Não conseguiu ler o arquivo. ERRO: " + e.getMessage());
        }

    }
}