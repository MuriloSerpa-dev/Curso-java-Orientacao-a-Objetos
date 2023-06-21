package teste;

import dao.FaturaDAO;
import modelo.Fatura;

import java.util.List;
import java.util.stream.Stream;

public class Teste {
    public static void main(String[] args) {
        List<Fatura> faturas = new FaturaDAO().buscarFaturas();

       /* for(Fatura f : faturas){
            if(f.getValor() > 250){
                System.out.println("Alerta: fatura acima de R$ 250.00 ->" + f);
            }
        } */

        faturas.stream()
                .filter(Fatura::estaEmRisco)
                .forEach(System.out::println);

    }
}
