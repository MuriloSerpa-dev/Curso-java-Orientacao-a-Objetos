public class TestesClassesWrapper {
    public static void main(String[] args) {
        // byte, short, int, long, float, double e char
        // Byte, Short, Integer, Long, Float, Double, Character

        int x = 5;
        Integer i = new Integer(5);

        byte y = i.byteValue();

        String valor = "15.5";
        Float f = new Float(valor);
        Integer p = 5;

        byte m = p.byteValue();

        System.out.println(m);

        Float v = Float.parseFloat(valor);// Parse XXX
        System.out.println(v + f);

        String resultado = "25";
        Float mudarTipo = Float.parseFloat(resultado);
        System.out.println(mudarTipo);

        int idade = Integer.parseInt(resultado);
        System.out.println(idade);

        try {
            double custo = Double.parseDouble("Vinte e três");
            System.out.println("Custo total gasto " + custo);
        } catch ( NumberFormatException e) {
            System.err.println("Numero invalido para conversão");
        }
}
}