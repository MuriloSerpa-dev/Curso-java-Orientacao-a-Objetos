import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Joao"));
        funcionarios.add(new Funcionario("Maria"));
        
        //funcionarios.add("Ricardo");

        for (int i = 0; i <funcionarios.size() ; i++) {
            Funcionario f =  funcionarios.get(i);
            System.out.println(" Nome funcionario " + f.getNome());
        }

        System.out.println("ºººººººººººººººººººººººººººººººº");
        for (Funcionario funcionario: funcionarios
             ) {
            System.out.println("Nome funcionarios:" + funcionario.getNome());
        }
    }

}
