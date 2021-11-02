package sk.uniba.fmph.dcs;

import java.util.List;

public class Play {
    List<CardInterface> playCards;
    public Play(List<CardInterface> playCards) {
        this.playCards = playCards;
    }
    public void putTo(CardInterface card) {
        playCards.add(card);
    }
    public void throwAll() {

    }
}
