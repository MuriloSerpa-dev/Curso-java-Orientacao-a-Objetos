package com.algaworksfjo.sobrecarga;

public class MauqinaDeCafe {
    int acucarDisponivel;
    public void fazerCafe(){
        fazerCafe(10);
    }
    public void fazerCafe(int quantidadeAcucar){
        if(acucarDisponivel < quantidadeAcucar){
            System.out.println("Não a acucar suficiente para fazer cafe");
        } else{
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de acucar.");
        }
    }


}
