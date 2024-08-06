package com.learnJava.Threading;

public class ThreadExamples extends Thread {
    long sum = 0;

    public void run() {
        synchronized (this){
            for(int i=0; i<1000; i++) {
                sum += i;
                notify();
            }

        }

    }
}
class ThreadWaitNotify {
    public static void main(String[] args) throws InterruptedException {
        ThreadExamples thread = new ThreadExamples();
        thread.start();
        synchronized (thread) {
            try {
                thread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(thread.sum);
    }

}