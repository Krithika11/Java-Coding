package com.learnJava.ShuffleADeckOfCards;

public class main {

    //Fisher Yates method for shuffling a deck of cards
    public static void main(String[] args) {
        ShuffleADeck shuffle = new ShuffleADeck();
        String[] deck = new String[52];
        int cartIndex = 0;

        for(int suite =0; suite <=3; suite++) {
            for(int rank =1; rank<=13; rank++) {
                String card = rank + " of";
                switch(suite) {
                    case 0:
                        card += " Hearts";
                        break;
                    case 1:
                        card += " Spade";
                        break;
                    case 2:
                        card += " Clubs";
                        break;
                    case 3:
                        card += " Diamond";
                        break;
                }
                deck[cartIndex++] = card;
            }
        }
        shuffle.shuffleDeck(deck);

    }

}

