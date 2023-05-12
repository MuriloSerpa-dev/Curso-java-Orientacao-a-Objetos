package com.algaworksfjo.classemath;
import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class TesteClasseMath {

    public static void main(String[] args) {
        // Comprimento de uma circunferencia 2x r x PI(3,1415)
        int raio = 4;

        double comprimento = 2 * raio * PI ;

        System.out.println("comprimento:" + comprimento);

        // Maximo e minimo

        double[] precosProdutosA = {30.20, 25.49};
        System.out.println("Maior preco:" + max(precosProdutosA[0], precosProdutosA[1]));
        System.out.println("Menor preco:" + min(precosProdutosA[0], precosProdutosA[1]));

        // Potencia
        System.out.println(" 2^3: " + Math.pow(2,3));

        // Raiz quadrada

        System.out.println("Raiz de nove: " + Math.sqrt(9));

        // Arrendondamento ceil, floor e round
            double n = 5.48;

        System.out.println("Menor inteiro:" + Math.floor(n));// arredonda para o menor inteiro
        System.out.println("Maior inteiro:" + Math.ceil(n));// arredonda para o maior inteiro
        System.out.println("Arrendondando: " + Math.round(n)); // arrendonda para o mais proximo


        // Trigonometria
        System.out.println("Seno: " + Math.sin(40));

        // Numeros randicos

        int numeroAleatorio = 0 ;
        numeroAleatorio = (int) (Math.random() *15);
        System.out.println(numeroAleatorio);

    }
}
