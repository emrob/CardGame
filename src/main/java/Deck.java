import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();

    }


    public int dealtSize() {
        return this.cards.size();
    }

    public void createDeck() {
        for (SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()) {
                cards.add(new Card(suit, value));

            }


        }

    }


}

