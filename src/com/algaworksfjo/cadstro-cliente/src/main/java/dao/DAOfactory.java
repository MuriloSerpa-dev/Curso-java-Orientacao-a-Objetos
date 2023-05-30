package dao;

import dao.jdbc.JdbcDAOfactory;

public abstract class DAOfactory   {
    public static DAOfactory getDAOfactory() throws ClassNotFoundException {
        return new JdbcDAOfactory();
    }
    public abstract ClienteDAO getClienteDAO();
}
