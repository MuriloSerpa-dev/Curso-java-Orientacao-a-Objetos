package exemplo;

import dao.FaturaDAO;
import modelo.Fatura;
import util.EnviadorDeEmail;

import java.util.List;

public class ExemploLambda {
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();

      /*  for (Fatura f : faturasVencidas) {
            enviadorDeEmail.enviar(f.getEmailDevedor(), f.resumo());
        }*/

        // Um tipo de de for usando lambda esse forEach é um metodo Default que vai aceitar uma
        // expressao de lambda, oque ele faz é que a cada varivel que no caso usei "f" esta fazendo
        // a interaçao e apos coloca oque se deve fazer, receber

        faturasVencidas.forEach(f -> enviadorDeEmail.enviar(f.getEmailDevedor(), f.resumo()));

        // maneira de usar mais uma validaçao dentro do forEach
        faturasVencidas.forEach(f -> {
            enviadorDeEmail.enviar(f.getEmailDevedor(), f.resumo());
            f.setEmailEnviado(true);
        });


    }
}
