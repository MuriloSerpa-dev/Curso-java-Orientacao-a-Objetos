package com.algaworksfjo.varargs;

public class TesteCorreioEletronico {
    public static void main(String[] args) {
        CorreioEletronico correio = new CorreioEletronico();

       // correio.enviarEmails(new String[]{"joao@.com" , "maria@.com"});
        correio.enviarEmails("joao@joao.com" , "maria@maria");
        // O varargs ele recebe apensar a String e guarada com um array ele tem tamanho porem é variavel, pelo numero
        // de argumentos ,
    }
}
