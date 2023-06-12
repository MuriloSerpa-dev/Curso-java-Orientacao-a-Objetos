import model.Pessoa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializandoObjeto {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(35);
        p.setNome("João Silva");
        p.setProfissao("Motorista");

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Joao.obj"))){
            // Criamos o objecoutput do stream,e direciona para um arquivo de saida pelo fileoutput
            //que vai direcionar o objeto para um arquivo de saida e poe o nome que sera o objeto
            out.writeObject(p);
            // comando para salvar o objeto
            System.out.println("Objeto salvo com sucesso");

        }catch (IOException e){
            System.err.println("Erro ao salvar o objeto "+ e.getMessage());
            e.printStackTrace();
        }

    }
}
