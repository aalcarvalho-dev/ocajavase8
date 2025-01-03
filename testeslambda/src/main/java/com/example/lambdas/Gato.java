package com.example.lambdas;

public class Gato implements Printable{
    private String name;
    private int idade;

    public Gato(){}

    @Override
    public String print(int num) {
        return "Miau!";
        //return 1;
    }
}
