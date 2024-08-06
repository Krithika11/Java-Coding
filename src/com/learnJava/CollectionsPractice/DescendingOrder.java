package com.learnJava.CollectionsPractice;

import java.util.Comparator;

public class DescendingOrder implements Comparator<Cricketer> {
    @Override
    public int compare(Cricketer c1, Cricketer c2) {
        if(c1.runs > c2.runs) {
            return 1;
        }
        if(c1.runs < c2.runs) {
            return -1;
        }
        return 0;
    }
}
