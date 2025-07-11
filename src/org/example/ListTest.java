package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void listTest(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        System.out.println(list);
    }

    public static void main(String[] args){
        listTest();

//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("World");
//        System.out.println(list);
//
//
//        List<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        System.out.println(intList);
//
//        List<Double> doubleList = new ArrayList<>();
//        doubleList.add(3.14);
//        doubleList.add(2.71);
//        System.out.println(doubleList);
//
//        List<Animal> animalList = new ArrayList<>();
//        animalList.add(new Cat());
//        animalList.add(new Dog());
//        for (Animal animal : animalList) {
//            animal.sound();
//        }
    }
}
