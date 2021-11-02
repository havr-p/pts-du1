package sk.uniba.fmph.dcs;

public class GameCard implements CardInterface{
    GameCardType cardType;

    public GameCard(GameCardType type) {
        this.cardType = type;
    }
    @Override
    public void evaluate(TurnStatus ts) {
        ts.actions+=cardType.getPlusActions();
        ts.buys+=cardType.getPlusBuys();
        ts.coins+=cardType.getPlusCoins();
    }

    @Override
    public GameCardType cardType() {
        return cardType;
    }
}
