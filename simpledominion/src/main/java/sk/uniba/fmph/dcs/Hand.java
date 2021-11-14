package sk.uniba.fmph.dcs;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Hand {
    private List<CardInterface> cards;
    private DeckInterface deck;
    public Hand(List<CardInterface> _cards) {
        cards = _cards;
    }
    public List<CardInterface> getCards(){
        return cards;
    }

    public boolean isActionCard(int idx) {
        return cards.get(idx).cardType().isAction();
    }


    public Hand() {
        this.cards = new LinkedList<CardInterface>();
    }

    public void setDeck(DeckInterface deck) {
        this.deck=deck;
        draw(5);
    }

    public Optional<CardInterface> top(){
        return Optional.ofNullable(cards.get(0));
    }

    public Optional<CardInterface> play(int idx) {
        if(idx>=cards.size())
            return Optional.ofNullable(null);
        Optional<CardInterface> played;
        played = Optional.ofNullable(this.cards.get(idx));
        draw(played.get().evaluate());
        return played;
    }

    public void draw(int count) {
        this.cards.addAll(deck.draw(count));
    }

}
