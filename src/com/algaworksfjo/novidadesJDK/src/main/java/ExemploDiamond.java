import java.util.*;

public class ExemploDiamond {
    public static void main(String[] args) {
        List<String> nomesClientes = new ArrayList<>();
        nomesClientes.add("Joao ");
        nomesClientes.add("Maria ");
        nomesClientes.add("Murilo ");

        Map<String, Set<String>> carrosMontadora = new HashMap<>();

        carrosMontadora.put("Chevrolet", new HashSet<String>());
        carrosMontadora.get("Chevrolet").add("Cruze");

        Set<String> carrosVolks;
        carrosMontadora.put("Volks ", carrosVolks = new HashSet<>());
        //  carrosMontadora.get("Volks").add("Gol");

        Set<Carros> carros = new HashSet<>();
        carros.add(new Carros(1L, "Fiat", "Argo", 2023));
        carros.add(new Carros(2L, "Mazda", "Eclipse", 2020));
        carros.add(new Carros(3L, "Toyota", "Corolla", 2022));
        carros.add(new Carros(4L, "Toyota", "Hilux", 2021));
        carros.add(new Carros(5L, "Honda", "Civic", 2022));
        carros.add(new Carros(5L, "Honda", "Civic", 2022));

        imprimirCarros(carros);

            Carros carro1 = new Carros(1L,"fiat", "ARgo", 2023);
            Carros carro2 = new Carros(2L,"fiat", "Toro", 2023);

        Map<String, Carros> carros1 = new HashMap<>();

        carros1.put("1",carro1);
        carros1.put("2" , carro2);
        imprimirCarros1(carros1);
}

    private static void imprimirCarros1(Map<String,Carros> carros1) {
        for (Carros carro: carros1.values()) {
            System.out.println("Nome:" + carro.getModelo());
        }
    }

    public static void imprimirCarros (Set<Carros> carros){
            for (Carros carro: carros) {
                System.out.println(carro.getId() + " " + carro.getAnoFabricacao() + " " + carro.getContrutora() + " " + carro.getModelo());
            }
        }


}
