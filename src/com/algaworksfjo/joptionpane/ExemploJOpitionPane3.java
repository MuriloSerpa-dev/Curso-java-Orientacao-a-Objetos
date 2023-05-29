package com.algaworksfjo.joptionpane;

import javax.swing.*;

public class ExemploJOpitionPane3 {
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] opcoes = {"SIm", "Não" , "Sim, com email"};

        int opcao = JOptionPane.showOptionDialog(null,"Voce gostaria de terminar o cadastro?"
        ,"Confirmacao", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes, opcoes[2]);
        /*
          Aqui é feito de uma forma para receber do ususario em tres opcoes sim, não, ou fazer de outra forma

        * O showOptionDialog recebe uma serie de parametros, como a quantidade de botoes, As opcoes que como no exeplo
        * acima recebe um array de object com as opces que vao aparecer para o usuario, e apos o array passo a opcao que ja vem selecionada.
        * JOptionPane .showOPtionDialog devolve um inteiro.
        * */

        System.out.println("Opcao selecionada " + opcao);
        //Exemplo para ver a opcao selecionada na caixa de dialogo



    }

}
