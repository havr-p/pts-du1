package sk.uniba.fmph.dcs;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.tuple.Pair;

public class GameState {
    public List<Card> handCards;
    public List<Pair<Integer, Card>> buyCards;
    public int deckSize;
    public int discardPileSize;
    public Optional<Card> discardPileTop;
    public int points;
    public int turn;

    public GameState(List<Card> handCards, List<Pair<Integer, Card>> buyCards,
                     int deckSize, int discardPileSize,
                     Optional<Card> discardPileTop,
                     int points, int turn) {
        this.handCards = handCards;
        this.buyCards = buyCards;
        this.deckSize = deckSize;
        this.discardPileSize = discardPileSize;
        this.discardPileTop = discardPileTop;
        this.points = points;
        this.turn = turn;
    }
}
