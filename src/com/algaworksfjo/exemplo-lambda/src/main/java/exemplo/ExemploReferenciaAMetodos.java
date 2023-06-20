package exemplo;

import dao.FaturaDAO;
import modelo.Fatura;

import java.util.List;

public class ExemploReferenciaAMetodos {
    public static void main(String[] args) {


        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        // faturasVencidas.forEach(f -> f.atualizarStatus());
        // Uma outra forma de referenciar o metodo nesse caso ele quer dizer que a cada fatura ele chama
        // o metodo
        faturasVencidas.forEach(Fatura::atualizarStatus);

    }
}