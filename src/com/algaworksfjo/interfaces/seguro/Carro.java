package com.algaworksfjo.interfaces.seguro;

public class Carro implements Seguravel {
    private double valorDeMercado;
    private int anoDeFabricacao;

    public Carro(double valorDeMercado, int anoDeFabricacao) {
        this.valorDeMercado = valorDeMercado;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    @Override
    public double calcularApolice() {
        double valorApolice = this.valorDeMercado * 0.4;
        if (this.anoDeFabricacao < 2000){
            valorApolice = valorApolice * 0.9;
        }
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Carro de ano " + this.anoDeFabricacao + " com valor de mercado de " + this.valorDeMercado;

    }
}
