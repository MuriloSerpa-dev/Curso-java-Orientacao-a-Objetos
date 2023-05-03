public class ContaPagar {
    private String descricao;
    private double valor;
    private String dataDeVencimento;

    private Fornecedor fornecedor;
    ContaPagar(){}

    ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataDeVencimento){
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }

    public void pagar(){
        System.out.println(this.getDescricao() + " valor " + this.getValor() + " Vencimento " 
        + this.getDataDeVencimento() + " Fornecedor " + this.getFornecedor().getNome());
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

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }

}

