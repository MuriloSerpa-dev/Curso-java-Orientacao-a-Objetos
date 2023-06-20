package modelo;

public class Fatura {
    private String emailDevedor;
    private Double valor;
    private boolean emailEnviado;


    public Fatura(String emailDevedor, Double valor) {
        this.emailDevedor = emailDevedor;
        this.valor = valor;
    }

    public String getEmailDevedor() {
        return emailDevedor;
    }

    public void setEmailDevedor(String emailDevedor) {
        this.emailDevedor = emailDevedor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void setEmailEnviado(boolean emailEnviado) {
        this.emailEnviado = emailEnviado;
    }
    public boolean isEmailEnviado() {
        return emailEnviado;
    }

    public String resumo(){
        return "Valor devido: " + this.valor + "\n";
    }

    public void atualizarStatus(){
        System.out.println("Atualizando status da fatura de valor R$ " + this.valor);
    }
}
