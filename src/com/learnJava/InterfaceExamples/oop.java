package com.learnJava.InterfaceExamples;

class Animal {
    String bark() {
        return " Bow Meow ";
    }
}

    class Dog extends Animal{
       public String bark() {
           return "Bow Bow";
       }
   }

    class Cat extends Animal {
       public String bark() {
           return "Meow Meow";
       }
   }
    public class oop {
        public static void main(String[] args) {
            Animal animal = new Animal();
            Animal cat = new Cat();
            Animal dog = new Dog();
            System.out.println(cat.bark());
            System.out.println(dog.bark());
            System.out.println(animal.bark());

//            LinkedList linkedList = new LinkedList();

        }
    }