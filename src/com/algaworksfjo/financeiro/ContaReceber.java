package com.algaworksfjo.financeiro;

public class ContaReceber extends Conta{
    Cliente cliente;


    ContaReceber(){
    }
    ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento){
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }
    public void receber(){
        if(SituacaoConta.PAGA.equals(getSituacaoConta())){
            System.out.println("Você não pode receber uma conta paga");
        } else if (SituacaoConta.CANCELADA.equals(getSituacaoConta())) {
            System.out.println("Você não pode reeceber uma conta cancelada");
        } else{
        System.out.println("Recebimento da conta" + getDescricao() +" Cliente " + cliente.getNome() + " valor " +
                getValor() + " sua data de vencimento é " + getDataVencimento() );
        }
    }
    public void cancelar(){
        if(getValor()>50000d){
            System.out.println("A conta " + getDescricao() + " não pode ser cancelada acima do valor permitido!! ");
        }else{
            super.cancelar();

        }
    }
    public void exibirDetalhes(){
        System.out.println("Conta a RECEBER-----");
        System.out.println("Cliente nome: " + this.cliente.getNome());
        System.out.println("Descricão" + this.getDescricao());
        System.out.println("Valor R$ " + this.getValor());
        System.out.println("Vencimento: " + this.getDataVencimento());
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
