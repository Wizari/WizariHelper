package com.gmail.danze.trash.application;

public class TestClass {

    private int age; //Атрибут, поле, field

    public TestClass(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() { //Метод
        return "TestClass{" +
                "age=" + age +
                '}';
    }
}
