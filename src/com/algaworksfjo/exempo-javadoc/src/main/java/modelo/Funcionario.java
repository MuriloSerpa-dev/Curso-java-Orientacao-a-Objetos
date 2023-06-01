package modelo;
// JAVADOC representa a documetnacao do projeto, para especificarmos oque cada objeto, classe, metodo faz
// para facilitar o entendimento


/**
 * Representa um funcionario da empresa ....
 *
 * @author muriloJr
 */
public class Funcionario {
    private String nome;

    private double salario;

    /**
     * Não utilize mais, pois o salario é obrigatorio para outros metodos
     *
     * @param nome the nome
     * @deprecated
     */
    public Funcionario(String nome) {
        this.nome = nome;
    }

    /**
     * Instantiates a new Funcionario.
     *
     * @param nome    the nome
     * @param salario the salario
     */
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets salario.
     *
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Sets salario.
     *
     * @param salario the salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Calcula o adiantamento em dinheiro que devera ser pago ao funcionario.
     *
     * <p>O valor da diaria e calculado dividindo <b>salario base por 30(dias do mês)</b></p>
     * <p>
     * Caso seja na capital o funcionario tera 20% a mais no valor do seu adiantamento
     *
     * @param dias    Quantidade de dias da viagem
     * @param capital Indica se é ou nao uma capital Brasileira
     * @return O valor em reais do adiantamento funcionario
     * @throws IllegalArgumentException Caso {@code dias} for menor ou igual a zero
     * @see Viagem
     * @since 1.1.0
     */
    public double adiantamentoDeViagem(int dias, boolean capital) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Dias deve ser maior que 0");
        }
        double valorDiaria = this.salario / 30;

        double adiantamentoDeViagem = valorDiaria * dias;

        if (capital) {
            adiantamentoDeViagem *= 1.20;
        }
        return adiantamentoDeViagem;
    }
}