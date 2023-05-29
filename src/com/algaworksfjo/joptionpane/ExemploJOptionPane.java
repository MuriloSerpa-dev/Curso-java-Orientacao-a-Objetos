package com.algaworksfjo.joptionpane;

import javax.swing.*;

public class ExemploJOptionPane {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException,
            InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        // LookAndFeel muda o tema "estilo visual" da aplicação

        JOptionPane.showMessageDialog(null,"Seu cadastro foi realizado com sucesso!");
        // o SHow message dialog cria a caixa de dialogo que recebe parametros como titulo, mensagem, tipo de
        //mensagem, icone.
    }
}
