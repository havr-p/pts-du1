package sk.uniba.fmph.dcs;

import java.util.Optional;

public class Game implements SimpleDominionInterface {
private GameState currentGameState;


    @Override
    public Optional<GameState> playCard(int handIdx) {

          if (handIdx > currentGameState.handCards.size() - 1) {
                return Optional.empty();
            } else {
                GameState g = new GameState();

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
