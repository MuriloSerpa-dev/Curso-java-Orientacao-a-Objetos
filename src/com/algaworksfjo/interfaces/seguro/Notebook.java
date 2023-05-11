package com.algaworksfjo.interfaces.seguro;

public class Notebook implements Seguravel{
    private double valorDeMercado;
    private int anoDeFabricacao;

    public Notebook(double valorDeMercado, int anoDeFabricacao) {
        this.valorDeMercado = valorDeMercado;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    @Override
    public double calcularApolice() {
        double valorApolice = this.valorDeMercado * 0.8;
        if (this.anoDeFabricacao< 2018){
            valorApolice = valorApolice * 0.3;
        }
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Notebook com valor de mercado:" + this.valorDeMercado + " fabricado em: " + this.anoDeFabricacao;
    }
}
