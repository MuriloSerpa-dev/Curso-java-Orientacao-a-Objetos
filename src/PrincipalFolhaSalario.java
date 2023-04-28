public class PrincipalFolhaSalario {
    public static void main(String[] args) {
        FolhaDePagamento pagamento = new FolhaDePagamento();

       Double calculoFolha = pagamento.calcularSalario(160, 12, 32.50, 45.5);

       System.out.println(" Salario calculado "+ calculoFolha);
    }
}
