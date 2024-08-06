package com.learnJava.DSA;

import java.util.Arrays;
import java.util.Random;

public class Shuffling {
    public static void main(String[] args) {
        String[] deckOfCards = new String[52];
        int index = 0;

        for (int type = 0; type <= 3; type++) {
            for (int rank = 1; rank <= 13; rank++) {
                String str = rank + " of";

                switch (type) {
                    case 0:
                        str += " Hearts";
                        break;
                    case 1:
                        str += " Spade";
                        break;
                    case 2:
                        str += " Clubs";
                        break;
                    case 3:
                        str += " Diamond";
                        break;
                }
                deckOfCards[index++] = str;
            }
        }
        System.out.println("Deck Of Cards" + Arrays.toString(deckOfCards));
        Shuffle(deckOfCards);
    }

    public static void Shuffle(String[] cards) {
        Random rand = new Random();
        for(int i = cards.length -1 ; i>0; i--) {
            int random = rand.nextInt(i+1);

            //swapping
            String temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }

        System.out.println("Shuffled deck" + Arrays.toString(cards));
    }
}
