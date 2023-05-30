import dao.ClienteDAO;
import dao.DAOfactory;
import modelo.Cliente;

import javax.swing.*;

public class SalvaCliente {
    public static void main(String[] args)throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Cliente cliente = new Cliente();

        String nome = JOptionPane.showInputDialog(null, "Nome do cliente",
                "Cadastro cliente", JOptionPane.QUESTION_MESSAGE);
        if (nome != null) {
            cliente.setNome(nome);

            ClienteDAO clienteDAO = DAOfactory.getDAOfactory().getClienteDAO();
            clienteDAO.salvar(cliente);
            System.out.println("Cliente salvo com sucesso");
        }
    }
}
