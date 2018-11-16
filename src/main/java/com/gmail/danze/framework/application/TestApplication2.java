package com.gmail.danze.framework.application;

import com.gmail.danze.framework.Animal;
import com.gmail.danze.framework.DanzeHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Animal - класс (продвинутая переменная) которая может выполнять действия сама над собой.
// name - атрибут. dog.name = "Pes"; заполняем поля класса.

public class TestApplication2 {

    public static void main(String[] args) {


        List<Animal> animalList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            animalList.add(new Animal(i, DanzeHelper.generateRandom(1, 10), "Name" + (i + 1), DanzeHelper.generateRandom(1, 10)));
// ===
//            Animal animal = new Animal(i, DanzeHelper.generateRandom(1, 10), "Name" + (i + 1), DanzeHelper.generateRandom(1, 10));
//            animalList.add(animal);
        }


        List<List<Integer>> shape = new ArrayList<>();

        List<Animal> additionalList = animalList.subList(2, 5);


        System.out.println(animalList);
        System.out.println(additionalList);

//        cat.name = "Barsik";

//        Animal dog = new Animal(4);
//        dog.name = "Pes";
//        dog.age = 35;
//        dog.weight = 99;


        int i = 3;
        i = 34;

//        System.out.println(cat);
//        System.out.println(dog);
///*
//        System.out.println(cat2);
//*/


    }
}
