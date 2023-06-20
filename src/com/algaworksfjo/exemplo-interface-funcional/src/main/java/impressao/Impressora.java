package impressao;

import compra.Compra;

@FunctionalInterface
public interface Impressora {
    public void imprimir(Compra c);
}