
import instruments.Guitar;
import instruments.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    InstrumentType instrumentType;
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(instrumentType.STRINGS, "Gibson", "electric", "black", 50.0, 100.0, 6 );
    }

    @Test
    public void canSetInstrumentType(){
        guitar.setInstrumentType(InstrumentType.PERCUSSION);
        assertEquals(instrumentType.PERCUSSION, guitar.getInstrumentType());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(instrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void canGetOrchestraSectionFromInstrumentType(){
        assertEquals("strings", guitar.getOrchestraSectionFromInstrumentType());
    }

    @Test
    public void canSetName(){
        guitar.setName("Fender");
        assertEquals("Fender", guitar.getName());
    }

    @Test
    public void canGetName(){
        assertEquals("Gibson", guitar.getName());
    }

    @Test
    public void canSetType(){
        guitar.setType("acoustic");
        assertEquals("acoustic", guitar.getType());
    }

    @Test
    public void canGetType(){
        assertEquals("electric", guitar.getType());
    }

    @Test
    public void canSetColour(){
        guitar.setColour("white");
        assertEquals("white", guitar.getColour());
    }

    @Test
    public void canGetColour(){
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void canSetBuyingPrice(){
        guitar.setBuyingPrice(100.0);
        assertEquals(100.0, guitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(50.0, guitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void canSetSellingPrice(){
        guitar.setSellingPrice(200.0);
        assertEquals(200.0, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(100.0, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void canSetNumberOfGuitarStrings(){
        guitar.setNumberOfGuitarStrings(8);
        assertEquals(8, guitar.getNumberOfGuitarStrings(), 0.0);
    }

    @Test
    public void canGetNumberOfGuitarStrings(){
        assertEquals(6, guitar.getNumberOfGuitarStrings());
    }

    @Test
    public void guitarCanBePlayed(){
        assertEquals("Guitar sounds..", guitar.play(guitar));
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(50.00, guitar.calculateMarkUp(), 0.0);
    }
}
