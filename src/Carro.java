public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;

    Proprietario dono;

    void alterarModelo(String modelo){
        if(modelo != null){
            this.modelo = modelo;
        } else if (modelo == null) {
            System.err.println("Nenhum modelo atribuido");
        } 
    }

    void ligar(){
        System.out.println("Ligando o carro: " + modelo);
    }

}