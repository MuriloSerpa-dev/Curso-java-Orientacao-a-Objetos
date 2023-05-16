package com.algaworksfjo.financeiro;

public abstract class Conta {
    private String descricao;
    private double valor;
    private String dataVencimento;
    protected SituacaoConta situacaoConta;


    Conta( ){
        this.situacaoConta = SituacaoConta.PENDENTE;
    }


    public void cancelar ( ) throws OperacaoContaException{
        if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            throw new OperacaoContaException("Não pode cancelar uma conta ja cancelada");
        } else if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            throw new OperacaoContaException("Não pode cancelar uma conta paga");
        }else{
            System.out.println("Conta cancelada com sucesso " + this.getDescricao() );
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }
    public abstract void exibirDetalhes();

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataDeVencimento) {
        this.dataVencimento = dataDeVencimento;
    }





}

