package dao;

import modelo.Cliente;

import java.util.List;

public interface ClienteDAO {
    public void salvar(Cliente cliente);

    Cliente buscarPeloCodigo(long codigo);

    List<Cliente> buscarTodos();
}
