package teste;


import Impressora.ImpressoraHP;
import compra.Compra;
import impressao.Impressora;

public class Teste {
    public static void main(String[] args) {
        //Impressora i = new ImpressoraHP();


        Impressora i = (compra)-> {
            System.out.println("Simulando a impressao > "+ compra);
        };
        Compra compra = new Compra(" Sabone " , 2.50);
        i.imprimir(compra);
    }
}
