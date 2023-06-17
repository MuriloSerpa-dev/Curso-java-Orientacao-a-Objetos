public class SeparadorDeDigitosLiterais {
    public static void main(String[] args) {
        long populacaoDeSaoPaulo = 11_000_000L; // na versao apos JDK 7 pode-se usar _ como separador literal
        // apos compilar não aparece
        long populacaoGrandeSP = 11_000_000 + 9_000_000;

        System.out.printf("População São Paulo: %d \n", populacaoDeSaoPaulo);
        System.out.printf("População Grande São Paulo: %d \n ", populacaoGrandeSP);

        double precoveiculo = 200_000.99_9d;
        System.out.printf("Preço do veiculo: %.3f \n" , precoveiculo);
    }
}
