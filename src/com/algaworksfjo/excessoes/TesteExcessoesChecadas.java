package com.algaworksfjo.excessoes;

public class TesteExcessoesChecadas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);
        try {
            cc.sacar(60);
        } catch (SaldoInsuficienteException e){
            System.out.println("Saldo insuficiente" + e.getMessage());
        }
        System.out.println("Saldo: " + cc.getSaldo());
        try{
            cc.sacar(50);
        }catch (SaldoInsuficienteException e){
            System.out.println("Saldo insuficiente " + e.getMessage());
        }finally {
            System.out.println("Obrigado por utilizar nosso sistema! "); // Bloco finally é executado semrpe independente de try / cath
        }
        System.out.println("Saldo: " + cc.getSaldo());
    }
}
