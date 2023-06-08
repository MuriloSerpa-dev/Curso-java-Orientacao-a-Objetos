import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivoItensPedido {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("itens_pedido.txt")))) {
            scanner.useDelimiter(";");
            // UseDelimiter ele muda o delimitador ao inves de ser um espaco ele vai se tornar no ex: um " ; "
            // ele vai saber quebrar cada token onde estiver um ;

            Locale localeBrasil = new Locale("pt", "BR");
            // USo o locale para informar que vamos usar a escrita brasileira, e como sdabemos usamos a virgula para
            // dinheiro, reais,

            scanner.useLocale(localeBrasil);
            //informamos para o scanner a localidade

            NumberFormat formatador = NumberFormat.getCurrencyInstance(localeBrasil);
            // Para formatar o numero, usamos o formatador de moeda

            while(scanner.hasNext()) {
                //O método hasNext() é usado para verificar se há algum elemento restante na lista.
                String produto = scanner.next();
                // O primeiro token devolve o nome do produto
                int quantidade = scanner.nextInt();
                // Segundo token contem a quantidade de produtos
                double valor = scanner.nextDouble();
                // terceiro token contem o valor do produto
                scanner.nextLine();
                // Usa o nextLine nesse caso para ler até o final da linha até a quebra de linha

                System.out.printf("Produto: %s. Quantidade: %d. Por: %s \n", produto, quantidade, formatador.format(valor));
            }
        }catch (IOException e){
            System.err.println("Erro abrindo arquivo. ERRO " + e.getMessage());
        }
    }
}
