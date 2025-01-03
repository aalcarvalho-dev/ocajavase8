package com.example.generics;

public class Impressora<T> {

    T coisasParaImprimir;

    public Impressora(T coisasParaImprimir){
        this.coisasParaImprimir = coisasParaImprimir;
    }

    public void imprime() {
        System.out.println(coisasParaImprimir);
    }

}
