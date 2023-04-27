public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.anoDeFabricacao = 2023;
        meuCarro.cor = " Prata";

        seuCarro.fabricante = "Chevrolet";
        seuCarro.modelo = "Onix";
        seuCarro.anoDeFabricacao = 2022;
        seuCarro.cor = "Vermelho";


        System.out.println("Meu carro");
        System.out.println(" =================================================   ");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoDeFabricacao);
        System.out.println("Fabricante: " + meuCarro.fabricante);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Seu carro");
        System.out.println("======================================================");
        System.out.println("Modelo " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoDeFabricacao);
        System.out.println("Fabricante: " + seuCarro.fabricante);


    }
}
