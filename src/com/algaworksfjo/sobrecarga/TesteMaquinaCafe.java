package com.algaworksfjo.sobrecarga;

public class TesteMaquinaCafe {
    public static void main(String[] args) {
        MauqinaDeCafe mc = new MauqinaDeCafe();
        mc.acucarDisponivel = 30;

        mc.fazerCafe(10);
        mc.fazerCafe(15);
        mc.fazerCafe();
    }
}
