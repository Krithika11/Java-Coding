package com.learnJava.InterfaceExamples;

public class mainCall {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(5);
        bicycle.applyBrakes(2);

        System.out.println("Bicycle present state : " );
        bicycle.printStates();
    }
}
