package modelo;

public class Fatura {
    private String email;
    private double valor;

    public Fatura(String email, double valor) {
        this.email = email;
        this.valor = valor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return " e-mail : " + email + " valor R$ : " + valor;
    }
    public boolean estaEmRisco () {
        return valor >= 250? true : false;
    }
}
