package com.learnJava.DSA;

import java.util.Arrays;
import java.util.Random;

public class ShuffleADeckOfCards {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
//        StringBuilder stringBuilder = new StringBuilder(0);
        String[] deck = new String[52];
        int cardIndex = 0;

        // Create the deck of cards
        for (int suite = 0; suite <= 3; suite++) {
            for (int rank = 1; rank <= 13; rank++) {
                String card = rank + " of ";
                switch (suite) {
                    case 0:
                        card += "Hearts";
                        break;
                    case 1:
                        card += "Diamonds";
                        break;
                    case 2:
                        card += "Clubs";
                        break;
                    case 3:
                        card += "Spades";
                        break;
                }
                    deck[cardIndex++] = card;
            }
        }

        System.out.println("Original deck: " + Arrays.toString(deck));
        shuffle(deck);
    }

    public static void shuffle(String[] deck) {
        // Shuffle the deck using the Fisher-Yates algorithm
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);  // Generate a random index from 0 to i+1
            //swapping
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        System.out.println("Shuffled deck: " + Arrays.toString(deck));
    }

}
