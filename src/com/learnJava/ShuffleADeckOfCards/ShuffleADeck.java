package com.learnJava.ShuffleADeckOfCards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ShuffleADeck implements Games{

   @Override
    public void shuffleDeck(String[] cards) {

        Random rand = new Random();
        int n = cards.length-1;
        for(int i=n; i>0; i--) {
            int result = rand.nextInt(i+1); // generate random int value between 0 and i+1
            //swap elements

            String temp = cards[i];
            cards[i] = cards[result];
            cards[result] = temp;
        }
        System.out.println("Shuffled new Deck" + Arrays.toString(cards));

    }
    @Override
    public String sample() {
       return "";
    }

}
