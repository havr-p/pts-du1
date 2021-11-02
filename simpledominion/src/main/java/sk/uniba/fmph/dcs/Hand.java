package sk.uniba.fmph.dcs;

import java.util.List;
import java.util.Optional;

public class Hand {
    List<CardInterface> cards;
    public Hand(List<CardInterface> _cards) {
        cards = _cards;
    }

    public boolean isActionCard(int idx) {
        return cards.get(idx).cardType().isAction();
    }

    public Optional<CardInterface> play(int idx) {
        if (cards.size()>idx) {
            return Optional.of(cards.get(idx));
        }
        return Optional.empty();
    }
}
