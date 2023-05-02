public class TesteObjetoThis {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = " Meriva";

        System.out.println("Antes " + carro.modelo);

        carro.alterarModelo("civic");

        System.out.println("Depois " + carro.modelo);
      
    }
}
