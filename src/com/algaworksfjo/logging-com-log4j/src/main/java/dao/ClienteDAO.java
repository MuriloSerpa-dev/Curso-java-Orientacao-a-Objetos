package dao;

import modelo.Cliente;
import org.apache.log4j.Logger;

public class ClienteDAO {
    private static Logger logger = Logger.getLogger(ClienteDAO.class);

    public void salvar(Cliente cliente) {
        if (cliente == null) {
            logger.warn("Cliente esta null");
            // Regra pra dizer ao usuario informar nome
        }
        if(logger.isDebugEnabled()){
            logger.debug("Salvando o cliente: " + cliente);
        }
            logger.debug("Cliente salvo com sucesso " + cliente);

    }

}
