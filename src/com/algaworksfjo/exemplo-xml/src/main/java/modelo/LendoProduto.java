package modelo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LendoProduto {

    public static void main(String[] args) throws FileNotFoundException {
        XStream xStream = new XStream(new DomDriver());
        xStream.addPermission(AnyTypePermission.ANY);
        //Permissao para conversao do xml em qualquer tipo de objeto
        xStream.alias("produto", Produto.class);
        xStream.aliasAttribute(Produto.class, "codigo", "codigo");

        Produto p = (Produto) xStream.fromXML(new FileInputStream("./produto2.xml"));
        // Fazer o casting para produto
        //Apartir de um xml eu busco o arquivo pelo seu nome e o transforme em um objeto produto

        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());
        System.out.println(p.getValor());
    }
}
