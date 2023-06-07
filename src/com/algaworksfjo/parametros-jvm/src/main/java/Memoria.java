import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Parametros JVM são feitos nas configuracoes de RUN da aplicação, consfiguramos a memoria que sera usada
// de forma que otimize o uso de dados memoria e etc.
public class Memoria {
    private List<Object> lista = new ArrayList<>();

    public static void main(String[] args) {
        Memoria memoria = new Memoria();

        try (Scanner entrada = new Scanner(System.in)) {
            int opcao = 0;
            do {
                System.out.println("Informe uma opcao: ");
                opcao = entrada.nextInt();

                if (opcao == 1) {
                    for (int i = 0; i < 2_000_000; i++) {
                        memoria.lista.add(new Object());
                    }
                }
            } while (opcao != 0);
        }
    }

}