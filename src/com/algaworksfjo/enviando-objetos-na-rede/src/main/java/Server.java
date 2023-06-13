import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(3333);
        // Serversocket ele abri a porta escolhida na maquina que estiver executando

        System.out.println("Aguardando conexão");
        Socket socket = server.accept();  // metodo accept é usado para parar e esperar alguem conectar
        System.out.println("Conectado a: " + socket.getRemoteSocketAddress());
        // O socket é é o piper é a conexao entre o servido e o cliente, caminho para usamos output stream inout stream etc..

        InputStream entrada = socket.getInputStream();
        // Objeto do tipo inputStream criado para ler os dados
        ObjectInputStream objectStream = new ObjectInputStream(entrada);
        // como vou receber um objeto Usamos ObjectInputStream para ler
        // passamos o inputstream que é fluxo de entrada como parametro

        Pedido pedido = (Pedido) objectStream.readObject();
        // criamos o objeto pedido que vai receber os dados
        // readObject Ele devolve o objeto que estamos lendo

        System.out.println("Codigo" + pedido.getCodigo());
        System.out.println("Descricao " + pedido.getDescricao());
        System.out.println("Quantidade " + pedido.getQuantidade());

        OutputStream saida = socket.getOutputStream();
        DataOutput dataOutput = new DataOutputStream(saida);
        dataOutput.writeUTF("Recebido com sucesso ");

        server.close();

    }
}
