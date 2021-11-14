package sk.uniba.fmph.dcs;

import java.util.LinkedList;
import java.util.List;

public class MockDeck implements DeckInterface{
    LinkedList<CardInterface> cards = new LinkedList<>();
    @Override
    public List<CardInterface> draw(int count) {
        LinkedList<CardInterface> draw = new LinkedList<>();
        int i = 0;
        while (!cards.isEmpty() && i < count) {
            draw.add(cards.pop());
            i++;
        }
        return draw;

    }

    @Override
    public void put(CardInterface card) {
        cards.add(card);
    }

    @Override
    public int getSize() {
        return cards.size();
    }
}
