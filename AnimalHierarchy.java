/*
 Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses.
Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
 */

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    void makeSound() {
        System.out.println("Animals make sound");
    }

    void display() {
        System.out.println("Name of animal : " + name);
        System.out.println("Age of animal : " + age);
    }

}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");

    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Animal obj1 = new Dog("Tommy", 4);
        Animal obj2 = new Cat("Kitty", 2);
        Animal obj3 = new Bird("ChiiChii", 1);

        Animal a[] = { obj1, obj2, obj3 };
        for (int i = 0; i < a.length; i++) {
            a[i].display();
            a[i].makeSound();
            System.out.println();
        }

    }
}
