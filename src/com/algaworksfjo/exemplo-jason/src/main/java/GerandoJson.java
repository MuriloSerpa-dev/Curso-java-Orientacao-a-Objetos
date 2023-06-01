import com.google.gson.Gson;
import com.google.gson.JsonArray;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Telefone;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerandoJson {
    public static void main(String[] args) {


        Endereco endereco = new Endereco("Rua das aguas, 10", "Ribeirão preto", "SP");

        Telefone residencial = new Telefone("RESIDENCIAL", "85996880667");
        Telefone comercial = new Telefone("COMERCIAL", "11 22338855");

        List<Telefone> telefones = new ArrayList<>();
        telefones.add(new Telefone("RESIDENCIAL" , "85997290209"));
        telefones.add(residencial);
        telefones.add(comercial);

        Cliente joao = new Cliente("João Silva", 28, endereco, telefones);

        Cliente maria = new Cliente("Maria Silva", 35 , endereco, telefones);

        Gson gson = new Gson();
        // Criando objeto Json

          String json = gson.toJson(joao);
        //Passa o objeto cliente para Json e o Json para String
       //System.out.println(json);

        List<String> jsons = new ArrayList<>();
        jsons.add(gson.toJson(joao));
        jsons.add(gson.toJson(maria));

        for (String jsonn: jsons) {
            System.out.println(jsonn);
        }
        System.out.println();
        System.out.println("------------------");

         List<Cliente> clientes = new ArrayList<>();
         clientes.add(joao);
         clientes.add(maria);

        System.out.println("----------------------------");
        System.out.println();

        Cliente c2 = gson.fromJson(json, Cliente.class);
        System.out.println(c2.getNome());
        System.out.println(c2.getTelefones().get(0).getNumero());
        System.out.println(c2.getEndereco().getEstado() + " cidade " + c2.getEndereco().getCidade());
        // Lendo objetos Json

        System.out.println();
        System.out.println("^^^^^^^^^^");

        criarJsons(clientes,gson);
    }



    private static void criarJsons(List<Cliente> clientes, Gson gson) {
        List<String> jsons = new ArrayList<>();
        jsons.add(gson.toJson(clientes));

        for (Cliente cliente: clientes) {
            System.out.println(cliente.getNome());
            System.out.println(cliente.getTelefones().get(0).getNumero());
        }
    }
}
