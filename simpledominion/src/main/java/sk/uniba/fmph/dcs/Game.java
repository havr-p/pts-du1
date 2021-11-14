package sk.uniba.fmph.dcs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Game implements SimpleDominionInterface {
private GameState currentGameState;


    @Override
    public Optional<GameState> playCard(int handIdx) {

        if (handIdx > currentGameState.handCards.size() - 1) {
            return Optional.empty();
        } else {
            List<Card> newHandCards = new LinkedList<Card>(currentGameState.handCards);
            newHandCards.remove(handIdx);

            GameState g = new GameState(newHandCards,
                    currentGameState.buyCards,
                    currentGameState.deckSize, currentGameState.discardPileSize, currentGameState.discardPileTop,
                    currentGameState.points, currentGameState.turn);
            return Optional.of(g);
        }
    }

    @Override
    public Optional<GameState> endPlayCardPhase() {
        return Optional.empty();
    }

    @Override
    public Optional<GameState> buyCard(int buyCardIdx) {
        return Optional.empty();
    }

    @Override
    public Optional<GameState> endTurn() {
        return Optional.empty();
    }
}
