package sk.uniba.fmph.dcs;

import java.util.Optional;

public class HandTest {
    Hand hand;
    DeckInterface deck;

    public HandTest() {
        hand = new Hand();
        deck = new MockDeck();
        deck.put(new FakeCard(GameCardType.GAME_CARD_TYPE_MARKET));
        deck.put(new FakeCard(GameCardType.GAME_CARD_TYPE_ESTATE));
        deck.put(new FakeCard(GameCardType.GAME_CARD_TYPE_LABORATORY));
        deck.put(new FakeCard(GameCardType.GAME_CARD_TYPE_SMITHY));
        deck.put(new FakeCard(GameCardType.GAME_CARD_TYPE_COPPER));
        hand.setDeck(deck);
    }

    public void test() {
        assert hand.play(3)== Optional.<CardInterface> empty();

        hand.draw(1);
        assert hand.top()!=Optional.<CardInterface> empty();

        assert hand.top().get().cardType() == GameCardType.GAME_CARD_TYPE_MARKET;

        hand.draw(1);
        assert hand.getCards().get(1).cardType() == GameCardType.GAME_CARD_TYPE_ESTATE;
        assert hand.getCards().get(0).cardType() == GameCardType.GAME_CARD_TYPE_MARKET;

        hand.draw(2);
        assert hand.getCards().size()==4;

        hand.draw(100);
        assert hand.getCards().size()==5;

        assert hand.getCards().get(3).cardType() == GameCardType.GAME_CARD_TYPE_SMITHY;
    }

    public static void main(String[] args) {
        HandTest handTest = new HandTest();
        handTest.test();
    }
}


