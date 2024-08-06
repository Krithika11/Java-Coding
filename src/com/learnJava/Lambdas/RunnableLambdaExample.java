package com.learnJava.Lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) { //executable class
        //prior to java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        //java 8 lambda

        Runnable runnable1 = () -> {
            System.out.println("Inside Runnable 2");
        };
        Runnable runnable2 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnable1).start();
        new Thread(runnable2).start();

        new Thread(() -> System.out.println("Inside Runnable 4")).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 3.1");
            }
        });
    }
}
