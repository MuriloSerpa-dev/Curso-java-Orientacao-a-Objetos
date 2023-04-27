public class Principal3 {
    public static void main(String[] args) {
        Carro seuCarro = new Carro();

        seuCarro.anoDeFabricacao = 2020;
        seuCarro.cor = "Preto";

       
         seuCarro.dono.nome = "Esteferson";

        System.out.println(seuCarro.dono.nome);

    }
}
