package sk.uniba.fmph.dcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    List<CardInterface> deckCards;
    public Deck(List<CardInterface> cards) {
        this.deckCards = cards;
    }
    public ArrayList<CardInterface> draw(int count) {
        if (deckCards.size() < count) {

        }
        ArrayList<CardInterface> pickedCards = new ArrayList<>();
        for (int i = deckCards.size()  - 1; i >= deckCards.size() - count; i--) {
            pickedCards.add(deckCards.get(i));
        }
        return pickedCards;
    }
}
