import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDeck {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void checkNumDealt(){
        assertEquals(0, deck.dealtSize());
    }

