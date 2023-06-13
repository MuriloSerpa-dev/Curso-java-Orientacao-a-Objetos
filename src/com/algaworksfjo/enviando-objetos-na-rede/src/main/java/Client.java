import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.0.119", 3333);

        OutputStream saida = socket.getOutputStream();
        // Para escrever outputstream, pegamos a saida do socket
        ObjectOutput objectOutput = new ObjectOutputStream(saida);
        // Para escrever o obeto criamos o objectoutput, que apartir dele podemos usar o writeObject
        Pedido pedido = new Pedido();
        pedido.setCodigo(1L);
        pedido.setDescricao("Descricao");
        pedido.setQuantidade(5);

        objectOutput.writeObject(pedido);
        // Usamos para escrever o object, e enviar com os dados

        InputStream entrada = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(entrada);
        System.out.println("Recebeu do servidor " + dataInputStream.readUTF());

        socket.close();



    }
}
