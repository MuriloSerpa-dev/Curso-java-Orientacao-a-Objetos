package com.algaworksfjo.varargs;

public class CorreioEletronico {
    public void enviarEmails(String... emails) {
        // Com varargs numero variavel de argumentos, ao inves de declarar um array basta colocar 3 pontos, ele significa que tem
        //tamanho variavel
        // ele continua sendo um array mas o tamanho desse array agora é variavel

        // Percorrer todos emails recebidos
        for(String email: emails){
            // envia email
            System.out.println("e-mail enviado para " + email);
        }
    }
}
