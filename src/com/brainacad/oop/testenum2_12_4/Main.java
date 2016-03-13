package com.brainacad.oop.testenum2_12_4;

/**
 * Created by R2-D2 on 13.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Card[] cardDeck = new Card[52];
        int index = 0;
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cardDeck[index] = new Card(suit, rank);
                index++;
            }
        }
        for (Card card : cardDeck) {
            System.out.println(card);
        }
    }
}
