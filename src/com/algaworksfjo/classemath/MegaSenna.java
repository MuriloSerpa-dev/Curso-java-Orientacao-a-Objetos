package com.algaworksfjo.classemath;

public class MegaSenna {
    public static final int QUANTIDADE_NUMEROS = 6;
    public static final int NUMERO_MAXIMO = 60;
    private int[] numerosSorteados;

    private int sortearNumero(int limite){
        return (int) Math.round(Math.random()* limite);
    };

    public int[]sortear() {
        this.numerosSorteados = new int[QUANTIDADE_NUMEROS];
        for (int i = 0; i < QUANTIDADE_NUMEROS; i++) {

            int numerosSorteado = sortearNumero(NUMERO_MAXIMO);
            if (!jaFoiSorteado(numerosSorteado) && numerosSorteado != 0) {
                this.numerosSorteados[i] = numerosSorteado;
            } else {
                i--;
            }

        }
        return numerosSorteados;
    }
    public void exibirNumeros(int quantidadeDeJogos) {
    for (int numeroSorteado : this.numerosSorteados) {
        System.out.println(numeroSorteado + " < ");
    }
    System.out.println();
}
private boolean jaFoiSorteado(int numero){
        boolean resultado = false;
        for(int i = 0; i <this.numerosSorteados.length ; i++) {
        if(this.numerosSorteados[i] == numero){
        resultado = true;
        break;
        }
        }
        return resultado;
    }


}

