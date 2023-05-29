package com.algaworksfjo.joptionpane;

import javax.swing.*;

public class ExemploJOptionPane4 {
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        /*
        *   Nesse exemplo criar um dialogo que o usuario pode entrar com dados, ou digital algo
        */
        Object[] possibilidades = { "Masculino","Feminino"};
       String sexo = (String)JOptionPane.showInputDialog(null,"Selecione sexo", "AlgaWorks",JOptionPane.PLAIN_MESSAGE
        ,null,possibilidades,possibilidades[0]);
       /*
        Crio um array de object que passa as opces para serem selecionadas
        JOptionPane.showInputDialogo retorna um Object, e posso criar uma variavel do tipo String e fazer o casting para
        receber o valor selecionado
       */

        System.out.println("Sexo selecionado:"+  sexo);

       String nome = (String)JOptionPane.showInputDialog(null," Digite seu nome ", "AlgaWorks",JOptionPane.PLAIN_MESSAGE
                ,null,null,null);
        /*
        Para criar uma caixa de dialogo vazia basta passar as selecoes NULL que ele vai esperar ser recebido pelo usuario
        um valor digitado
         */
        System.out.println("Seu nome :" + nome);
    }
}
