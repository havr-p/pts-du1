package sk.uniba.fmph.dcs;

public class GameCard implements CardInterface{
    GameCardType cardType;
    private TurnStatus turnStatus;

    public GameCard(GameCardType type, TurnStatus ts)
    {
        this.cardType = type;
        this.turnStatus = ts;
    }



    @Override
    public int evaluate() {
        turnStatus.actions+=cardType.getPlusActions();
        turnStatus.buys+=cardType.getPlusBuys();
        turnStatus.coins+=cardType.getPlusCoins();
        return cardType.getPlusCards();
    }

    @Override
    public GameCardType cardType() {
        return cardType;
    }
}
