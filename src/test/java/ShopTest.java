
import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        shop = new Shop();
        guitarStrings = new GuitarStrings("11s", "Gibson", 5.0, 10.0, 6, 0.11 );
    }

    @Test
    public void stockListBeginsEmpty() {
        assertEquals(0, shop.getStockListSize());
    }

    @Test
    public void canAddStockToStockList() {
        shop.addStock(guitarStrings);
        assertEquals(1, shop.getStockListSize());
    }

    @Test
    public void canRemoveStockFromStockList() {
        shop.removeStock(guitarStrings);
        assertEquals(0, shop.getStockListSize());
    }
}
