package com.brainacad.oop.testenum2_12_4;

/**
 * Created by R2-D2 on 13.03.2016.
 */
public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "The Card: " + rank + "_" + suit;
    }
}
