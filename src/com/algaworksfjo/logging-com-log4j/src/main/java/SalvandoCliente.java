import dao.ClienteDAO;
import modelo.Cliente;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class SalvandoCliente {
    private static Logger logger = Logger.getLogger(SalvandoCliente.class);
    public static void main(String[] args) {
        PropertyConfigurator.configure("Log4j.properties");
        logger.info("iniciando aplicacao");

        Cliente cliente = new Cliente("Joao");
        new ClienteDAO().salvar(cliente);
        logger.info("Finalizando aplicação ");

        new ClienteDAO().salvar(null);
        
    }
}
