public class Principal2 {
    public static void main(String[] args) {        
        
        Carro meuCarro = new Carro();
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.anoDeFabricacao = 2023;
        meuCarro.cor = " Prata";

        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "Jão da Silva";
        meuCarro.dono.cpf = "011.223.365-50";
        meuCarro.dono.idade = 28;
        meuCarro.dono.cidade = "São Paulo";
        meuCarro.dono.bairro = "Capao redondo";
        meuCarro.dono.Logradouro = " rua 5 ";
    }
    
}
