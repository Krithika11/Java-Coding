package com.learnJava.CollectionsPractice;


public class Cricketer implements Comparable<Cricketer> {

    int runs;
    String name;

    public Cricketer(String name, int runs) {
        super();
        this.name = name;
        this.runs = runs;
    }

    @Override
    public String toString() {
        return name + " " + runs;
    }

    @Override
    public int compareTo(Cricketer that) {
        if(this.runs > that.runs) {
            return 1;
        }
        if(this.runs < that.runs) {
            return -1;
        }
        return 0;
    }
}
