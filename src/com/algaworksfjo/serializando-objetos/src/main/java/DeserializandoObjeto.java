import model.Pessoa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.sql.SQLOutput;
import java.util.Objects;

public class DeserializandoObjeto {
    public static void main(String[] args) {
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("Joao.obj"))){
//Para ler o arquivo criado, usamos o input da classe Stream, e passo de onde esta vindo e passo o nome do arquivo

            Pessoa p = (Pessoa) in.readObject();
// Para ler o arquivo criamos uma variavel para recuperar o arquivo, fazemos o cast para Pessoa para ler do arquivo
// O objeto Pessoa, e ele lança uma nova excessao ClassNOtFoundException para caso não encontre a classe que buscamos

            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Profissao: " + p.getProfissao());

        }catch (IOException e){
            System.err.println("Objeto NÃO foi lido com sucesso "+ e.getMessage());
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            System.err.println("Erro convertendo para  a Classe pessoa");
            e.printStackTrace();
        }
    }
}
