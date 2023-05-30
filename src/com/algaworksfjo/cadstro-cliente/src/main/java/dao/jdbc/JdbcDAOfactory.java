package dao.jdbc;

import dao.ClienteDAO;
import dao.DAOfactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDAOfactory extends DAOfactory {
    private Connection connection;

    public JdbcDAOfactory() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente",
                    "root", "325656");
        } catch (Exception e) {
            throw new RuntimeException("Erro recuperando conexão com o banco ", e);
        }
    }

    @Override
    public ClienteDAO getClienteDAO() {
        return new JdbcClienteDAO(connection);
    }
}