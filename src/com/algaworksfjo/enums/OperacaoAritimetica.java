package com.algaworksfjo.enums;

public enum OperacaoAritimetica {
    ADICAO {
        public int operacao(int x, int y) {
            return x + y;
        }
    },
    SUBTRACAO {
        public int operacao(int x, int y) {
            return x - y;
        }
    },
    DIVISAO {
        public int operacao(int x, int y){
            return x / y;
        }
    };


    public abstract int operacao (int x, int y);

}
