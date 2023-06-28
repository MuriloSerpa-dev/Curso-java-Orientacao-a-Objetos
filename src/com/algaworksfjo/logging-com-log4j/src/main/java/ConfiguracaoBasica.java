import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {

        private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();

        logger.info("Comecando a aplicação. ");
        // Teriamos o codigo dfa aplicação rodando
        // ou salvando algo no banco de dados
        // ou teria uma excessao e capturaria e consguiria gerar as informações
        logger.info("Finalizando a aplicação. ");

    }
}

