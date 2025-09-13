package com.ok.java.oops;

public class method_overiding {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound(); //Dog barks
        animal2.sound(); //Cats meows

    }
}

class Animal{
    void  sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound() {
        System.out.println("Cat meows");
    }
}