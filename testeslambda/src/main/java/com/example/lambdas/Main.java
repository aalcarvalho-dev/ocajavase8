package com.example.lambdas;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.print();

        Cachorro cachorro = new Cachorro();
        emiteSom(
            () -> {
                System.out.println("Auauafafa!");
            }
        );
    }


    private static void emiteSom(Printable emissor){
        emissor.print();
    }
}