public class TesteArrayComObjetos {
    public static void main(String[] args) {
        Carro[] carros = new Carro[4];

        carros[0] = new Carro();
        carros[0].anoDeFabricacao = 2022;


        System.out.println("Ano de fabricação: " + carros[0].anoDeFabricacao);
    }
}
