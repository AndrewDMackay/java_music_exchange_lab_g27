
import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("11s", "Gibson", 5.0, 10.0, 6, 0.11 );
    }

    @Test
    public void canSetName(){
        guitarStrings.setName("9s");
        assertEquals("9s", guitarStrings.getName());
    }

    @Test
    public void canGetName(){
        assertEquals("11s", guitarStrings.getName());
    }

    @Test
    public void canSetType(){
        guitarStrings.setType("Fender");
        assertEquals("Fender", guitarStrings.getType());
    }

    @Test
    public void canGetType(){
        assertEquals("Gibson", guitarStrings.getType());
    }

    @Test
    public void canSetBuyingPrice(){
        guitarStrings.setBuyingPrice(20.0);
        assertEquals(20.0, guitarStrings.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(5.0, guitarStrings.getBuyingPrice(), 0.0);
    }

    @Test
    public void canSetSellingPrice(){
        guitarStrings.setSellingPrice(40.0);
        assertEquals(40.0, guitarStrings.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(10.0, guitarStrings.getSellingPrice(), 0.0);
    }

    @Test
    public void canSetNumberOfGuitarStrings(){
        guitarStrings.setNumberOfGuitarStrings(8);
        assertEquals(8, guitarStrings.getNumberOfGuitarStrings());
    }

    @Test
    public void canGetNumberOfGuitarStrings(){
        assertEquals(6, guitarStrings.getNumberOfGuitarStrings());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(5.0, guitarStrings.calculateMarkUp(), 0.0);
    }
}
