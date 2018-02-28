import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCard {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.CLUBS, ValueType.THREE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.CLUBS, card.getSuit());
    }

    @Test
    public void canGetValue(){
        assertEquals(ValueType.THREE, card.getValue());
    }

}
