package dao;

import modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarFaturas(){
        List<Fatura> faturas = new ArrayList<>();

        faturas.add(new Fatura("Joao@.com", 350.00));
        faturas.add(new Fatura("maria@.com", 150.00));
        faturas.add(new Fatura("jose@.com", 1750.00));

        return faturas;
    }


}
