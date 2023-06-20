package dao;

import modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarFaturasVencidas() {
        // Exemplo feito como se fosse uma busca no banco de dados
        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("Joaao@.com", 500.00 ));
        faturas.add(new Fatura("maria@.com", 150.00 ));
        faturas.add(new Fatura("jose@.com", 500.00 ));

        return faturas;
    }
}
