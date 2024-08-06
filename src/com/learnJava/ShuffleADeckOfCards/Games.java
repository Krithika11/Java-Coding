package com.learnJava.ShuffleADeckOfCards;

public interface Games {

    void shuffleDeck(String[] deck);

    default String sample() {
        return "";
    }
}

