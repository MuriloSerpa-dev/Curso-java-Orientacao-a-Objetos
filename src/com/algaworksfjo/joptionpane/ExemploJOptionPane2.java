package com.algaworksfjo.joptionpane;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.URI;
import java.net.URL;

public class ExemploJOptionPane2 {
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null,"Seu cadastro foi realizado com sucesso!");

        JOptionPane.showMessageDialog(null,"Atenção email não cadastrado.",
                "Atenção" ,JOptionPane.WARNING_MESSAGE );
        // Mudando o titulo, e o tipo da mensagem que determina o icone estilo da mensagem.

        JOptionPane.showMessageDialog(null, "Por favor informar o CPF", "ERROR",
                JOptionPane.ERROR_MESSAGE);
        // Mensagem com tipo de erro.

        JOptionPane.showMessageDialog(null,"Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);
        // Mensagem sem icone apenas oque for determinado.

        URL url = ExemploJOptionPane2.class.getResource("algaworks.png");
        // Redimensionando a imagem
        Image imagem = ImageIO.read(url);
        int alturaImge = 44;
        int larguraImage = 41;
        int algoritmoRedimensionamento = 4; // deixa a imagem mais suave apos redimensionar

        Image imagemRedimensionada = imagem.getScaledInstance(alturaImge,larguraImage,algoritmoRedimensionamento);
        Icon icone = new ImageIcon(imagemRedimensionada);

        /*
         Para usar seu proprio icone, é preciso pegar URL dele, consigo pegar a url pois esta na mesma pasta
        crio um ICON para receber a url
         */

        JOptionPane.showMessageDialog(null, "Obrigado por usar a AlgaWorks", "Algaworks",
                JOptionPane.INFORMATION_MESSAGE, icone);
        // Forma de usar seu icone, é passando as informacoes e colocando na ultima opcao o ICONE
    }
}
