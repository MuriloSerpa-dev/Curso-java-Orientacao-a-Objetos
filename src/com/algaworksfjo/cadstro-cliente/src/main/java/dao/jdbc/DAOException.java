package dao.jdbc;

import java.sql.SQLException;

public class DAOException extends RuntimeException {
    public DAOException(String erroSalvandoCliente, Throwable t) {
        super(erroSalvandoCliente, t);
    }
}
