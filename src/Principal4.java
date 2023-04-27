public class Principal4 {
    public static void main(String[] args) {
        Proprietario dono1 = new Proprietario();
        dono1.nome = "João da Siva";
        
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Palio";
        meuCarro.dono = dono1;

        Carro seuCarro = new Carro();
        seuCarro.modelo = " Civic";
        seuCarro.dono = dono1;

        seuCarro.dono.nome = "Murilo";

        System.out.println(seuCarro.dono.nome);
        System.out.println(meuCarro.dono.nome);
    

    }
}
