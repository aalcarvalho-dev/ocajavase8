package com.example.lambdas;

public class Gato implements Printable{
    private String name;
    private int idade;

    public Gato(){}

    @Override
    public void print() {
        System.out.println("Miau!");
    }
}
