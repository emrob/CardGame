import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHand {

    Hand hand;
    Card card;

    @Before
    public void before(){
        hand = new Hand();
        card = new Card(SuitType.SPADES, ValueType.SEVEN);
    }


    @Test
    public void checkNumInHand(){
        assertEquals(0, hand.numOfCards());
    }
}
