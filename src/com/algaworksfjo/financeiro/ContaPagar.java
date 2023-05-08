package com.algaworksfjo.financeiro;

public class ContaPagar extends Conta {
    private Fornecedor fornecedor;



    ContaPagar(){}
    ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento){
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }
    public void pagar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Voce não pode pagar uma conta paga "+ this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("Voce nao pode pagar uma conta cancelada " + this.getDescricao());
        } else{
            System.out.println("Conta paga com sucesso" + this.getDescricao());

            this.situacaoConta = SituacaoConta.PAGA;
        }
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}

