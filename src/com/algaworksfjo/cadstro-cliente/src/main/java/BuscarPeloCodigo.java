import dao.ClienteDAO;
import dao.DAOfactory;
import modelo.Cliente;

public class BuscarPeloCodigo {
    public static void main(String[] args) throws ClassNotFoundException {
        ClienteDAO clienteDAO = DAOfactory.getDAOfactory().getClienteDAO();

        Cliente cliente = clienteDAO.buscarPeloCodigo(2L);

        if (cliente != null) {
            System.out.println("______Cliente encontrado_____");
            System.out.println("Codigo: " + cliente.getCodigo());
            System.out.println("Nome: "+ cliente.getNome());
            System.out.println();
        } else {
            System.out.println("Nehum cliente encontrado: ");
        }
    }
}
