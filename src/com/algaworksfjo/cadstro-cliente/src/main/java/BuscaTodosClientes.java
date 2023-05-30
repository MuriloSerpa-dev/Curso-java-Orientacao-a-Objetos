import dao.ClienteDAO;
import dao.DAOfactory;
import modelo.Cliente;

import java.util.List;

public class BuscaTodosClientes {
    public static void main(String[] args) throws ClassNotFoundException {
        ClienteDAO clienteDAO = DAOfactory.getDAOfactory().getClienteDAO();

        List<Cliente> clientes = clienteDAO.buscarTodos();

        for (Cliente cliente: clientes) {
            System.out.println("------- Cliente --------");
            System.out.println("Codigo:" + cliente.getCodigo());
            System.out.println("Nome:" + cliente.getNome());
            System.out.println();
        }
    }
}
