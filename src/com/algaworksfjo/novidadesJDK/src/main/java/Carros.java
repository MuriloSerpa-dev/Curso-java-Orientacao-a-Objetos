public class Carros {
    private String contrutora;
    private  String modelo;
    private  int anoFabricacao;

    Long id;

    public Carros(Long id, String contrutora, String modelo, int anoFabricacao) {
        this.contrutora = contrutora;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.id = id;
    }

    public String getContrutora() {
        return contrutora;
    }

    public void setContrutora(String contrutora) {
        this.contrutora = contrutora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}

