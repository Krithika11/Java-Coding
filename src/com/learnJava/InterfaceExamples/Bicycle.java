package com.learnJava.InterfaceExamples;

public class Bicycle implements Vehicle{
    int gear;
    int speed;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int newSpeed) {
        speed = speed + newSpeed;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void printStates(){
        System.out.println("speed: " + speed + " " + "gear:" + gear);
    }
}
