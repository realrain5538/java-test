package org.example;

public class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("멍");
    }

    public static void main(String[] args){
        Animal myDog = new Dog();
        myDog.sound();
    }
}
