package core;

import com.energy0124.energydominion.api.Card;
import com.energy0124.energydominion.api.Deck;
import com.energy0124.energydominion.api.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Energy on 15/07/2015.
 */
public class DominionDeck implements Deck {

    private Player owner;
    private List<Card> cards;

    public DominionDeck() {
        this(new ArrayList<Card>());
    }

    public DominionDeck(List<Card> cards) {
        this.cards = cards;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public List<Card> getCards() {
        return cards;

    }

    @Override
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);

    }

    @Override
    public void addCard(Card card) {
        cards.add(card);

    }

    @Override
    public void removeCard(Card card) {
        cards.remove(card);
    }

    public Card getTopCard() {
        return cards.get(0);
    }

    public Card drawTopCard() {

        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else return null;
    }
}
