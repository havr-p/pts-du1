package sk.uniba.fmph.dcs;

import java.util.List;

public interface DeckInterface {
    public List<CardInterface> draw(int count);
    public void put(CardInterface card);
    public int getSize();
}
