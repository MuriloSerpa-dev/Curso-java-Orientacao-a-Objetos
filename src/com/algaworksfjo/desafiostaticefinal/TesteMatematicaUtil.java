package com.algaworksfjo.desafiostaticefinal;

import java.sql.SQLOutput;

public class TesteMatematicaUtil {
    public static void main(String[] args) {
       int calcularFibonacci = MatermaticaUtil.calcularFibonacci(8);
        System.out.println("Numero de fibonacci na posição 8 é:" + calcularFibonacci);

        double calcularAreaCirculo = MatermaticaUtil.calcularAreaCirculo(104.8);
        System.out.println("Area do circulo é:" + calcularAreaCirculo);
    }
}
