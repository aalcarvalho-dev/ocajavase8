package com.example.generics;

public class Main {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();

        Impressora impressora = new Impressora<Integer>(2);
        impressora.imprime();
        Impressora impressora2 = new Impressora<String>("Amor");
        impressora2.imprime();
        Impressora impressora3 = new Impressora<Double>(2.5);
        impressora3.imprime();

    }
}