package com.learnJava.Threading;

public class ThreadingPractice extends Thread {
    long sum = 0;

    public void run() {
        synchronized (this) {
            for(int i=0; i<1000; i++) {
                sum += i;
                notify();
            }
            System.out.println(sum);
        }
    }
}

class ThreadToNotify {
    public static void main(String[] args) {

        ThreadingPractice threading = new ThreadingPractice();
        threading.start();

        synchronized (threading) {
            try {
                threading.wait();
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threading.sum);
    }
}
