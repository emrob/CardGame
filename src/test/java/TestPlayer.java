import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Emma");
        card = new Card(SuitType.CLUBS, ValueType.THREE);
    }

    @Test
    public void checkName(){
        assertEquals("Emma", player.getName());
    }
}
