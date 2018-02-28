import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();

    }


    public int dealtSize() {
        return this.cards.size();
    }

    public void createDeck(Card card, SuitType suit, ValueType value) {
        for (SuitType suit : SuitType.getSuit()) {
            for (SuitType suit : SuitType.getSuit()) {
                for (ValueType values : ValueType.getvalue()) {
                    cards.add(new Card(suit, value));

                }


            }

        }


    }

}