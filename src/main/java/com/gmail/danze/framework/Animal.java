package com.gmail.danze.framework;

public class Animal {
    private final int id;
    private int weight;  //Поле класса, аттрибут, field
    //модификатор доступа    тип     имя
    private int age;
    private String name;

    //конструктор (можно вызвать 1 раз при конструировании объекта класса)
    public Animal(int id, int weight,  String  name, int age) {
//        System.out.println("Вызван конструктор");
        this.id = id;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Неправильно задано имя");
        }
        if (name.equals("111")) {
            System.out.println("Ну и имя ты придумал");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Метод класса "toString"
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
