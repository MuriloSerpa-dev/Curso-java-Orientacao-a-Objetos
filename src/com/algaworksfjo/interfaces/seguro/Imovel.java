package com.algaworksfjo.interfaces.seguro;

public class Imovel implements Seguravel{

    private double valorDeMercado;
    private int areaConstruida;

    public Imovel(double valorDeMercado, int areaConstruida){
        this.valorDeMercado = valorDeMercado;
        this.areaConstruida = areaConstruida;
    }
    @Override
    public double calcularApolice() {
        double valorDaApolice = this.valorDeMercado * 0.003;
        valorDaApolice = valorDaApolice + (areaConstruida * 0.5);
        return valorDaApolice;
    }

    @Override
    public String obterDescricao() {
        return "Imovel com area construida " + this.areaConstruida +
                " m2 e valor de mercado " + this.valorDeMercado;
    }
}
