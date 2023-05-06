package com.algaworksfjo.financeiro;

public class ContaPagar {
    private String descricao;
    private double valor;
    private String dataVencimento;

    private Fornecedor fornecedor;

    private SituacaoConta situacaoConta;



    ContaPagar( ){
      this.situacaoConta = SituacaoConta.PENDENTE;


    }

    ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
        this();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void pagar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Voce não pode pagar uma conta paga "+ this.descricao);
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("Voce nao pode pagar uma conta cancelada " + this.descricao);
        } else{
            System.out.println("Conta paga com sucesso" + this.descricao);

            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
    public void cancelar( ){
        if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("Não pode cancelar uma conta ja cancelada");
        } else if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode cancelar uma conta paga");
        }else{
            System.out.println("Conta cancelada com sucesso " + this.descricao);
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }

}

