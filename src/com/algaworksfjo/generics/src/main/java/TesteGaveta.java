import java.util.ArrayList;
import java.util.List;

public class TesteGaveta {
    public static void main(String[] args) {
        Gaveta<String> gaveta = new Gaveta<>();
        //Aqui eu escolho o tipo que sera minha classe generica

        gaveta.colocar("Livro java");
        System.out.println(gaveta.retirarPrimeiro());


        Gaveta<Integer> gavetaNumeros = new Gaveta<>();
        gavetaNumeros.colocar(10);
        System.out.println(gavetaNumeros.retirarPrimeiro());

    }
}
