package com.learnJava;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static class CardShuffler {

        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer("Hello");
            StringBuilder stringBuilder = new StringBuilder(0);
            String[] deck = new String[52];
            int cardIndex = 0;

            // Create the deck of cards
            for (int suit = 0; suit <= 3; suit++) {
                for (int rank = 1; rank <= 13; rank++) {
                    String card = rank + " of ";
                    switch (suit) {
                        case 0: card += "Hearts"; break;
                        case 1: card += "Diamonds"; break;
                        case 2: card += "Clubs"; break;
                        case 3: card += "Spades"; break;
                    }
                    deck[cardIndex++] = card;
                }
            }

            System.out.println("Original deck: " + Arrays.toString(deck));

            // Shuffle the deck using the Fisher-Yates algorithm
            Random random = new Random();
            for (int i = deck.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);  // Generate a random index from 0 to i+1
                String temp = deck[i];
                deck[i] = deck[j];
                deck[j] = temp;
            }

            System.out.println("Shuffled deck: " + Arrays.toString(deck));
        }
    }
}
