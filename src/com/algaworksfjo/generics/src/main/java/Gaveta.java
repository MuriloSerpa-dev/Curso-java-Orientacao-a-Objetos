import java.util.ArrayList;
import java.util.List;

public class Gaveta<E> {
    // O E quer dizer que é um tipo variavel que pode ser recebido.
    public List<E> colecao = new ArrayList<>();

    public void  colocar(E e) {
        // Nesse caso o metodo recebe o tipo generico
       if (e != null){
           colecao.add(e);
       } else {
           throw new IllegalArgumentException("Digite um parametro valido");
       }
    }
        public E retirarPrimeiro () {
            return colecao.get(0);
        }
    public List<E> getColecao() {
        return colecao;
    }

    public void setColecao(List<E> colecao) {
        this.colecao = colecao;
    }
}
