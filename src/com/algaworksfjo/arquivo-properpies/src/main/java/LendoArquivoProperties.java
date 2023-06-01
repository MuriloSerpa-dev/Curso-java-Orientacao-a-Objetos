import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {
    public static void main(String[] args) throws Exception {

        Properties prop = new Properties();
        // Classe properties
        // com essa propriedade eu posso carregar um arquivo de properties
        prop.load(new FileInputStream("./config/config.properties"));
        //Aqui ele esta lendo todo esse arquivo properties e carregando

        // Conectar no banco de dados
        // Aqui ele recebe as chaves do properties
        String url = prop.getProperty("banco.dados.url");
        String usuario = prop.getProperty("banco.dados.usuario");
        String senha = prop.getProperty("banco.dados.senha");

        System.out.printf("Conectando no banco de dados url: %s e usuario: %s\n", url, usuario);

        try {
            // Como se viesse um erro de uma cofiguracao do banco de dados
            int x = 5 / 0;
        } catch (Exception e) {
            // Caso aconteca algum erro, voçê precisa enviar um e-mail para o administrador
            String email = prop.getProperty("email.admin");
            System.err.printf("Enviando email para: %s informando o erro: %s", email, e.getMessage());
        }
    }
}
