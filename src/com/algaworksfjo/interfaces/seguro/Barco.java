package com.algaworksfjo.interfaces.seguro;

public class Barco implements Seguravel{

    private double valorDeMercado;
    private int anoDeFabricacao;
    private boolean emBomEstado;

    public Barco(double valorDeMercado, int anoDeFabricacao, boolean emBomEstado) {
        this.valorDeMercado = valorDeMercado;
        this.anoDeFabricacao = anoDeFabricacao;
        this.emBomEstado = emBomEstado;
    }

    @Override
    public double calcularApolice() {
        double valorApolice = this.valorDeMercado * 0.5;
        if (this.anoDeFabricacao < 2005) {
            valorApolice = valorApolice * 0.7;
        }
        if (emBomEstado) {
            valorApolice = valorApolice * 0.2;
        } else {
            valorApolice = valorApolice * 0.5;
        }
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Barco de ano " + this.anoDeFabricacao + " com valor de mercado: " + this.valorDeMercado;
    }
}
