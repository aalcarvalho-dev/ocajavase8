package com.example.lambdas;

public class Main {
    public static void main(String[] args) {
        //Gato gato = new Gato();
        //gato.print(2);

        Printable lambdaPrintable = num -> "Auauafafa! "+num;
        emiteSom(lambdaPrintable);
    }


    private static void emiteSom(Printable emissor){
        System.out.println(emissor.print(2));
    }

}