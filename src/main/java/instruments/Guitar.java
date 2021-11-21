package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    InstrumentType instrumentType;
    private String name;
    private String type;
    private String colour;
    private int buyingPrice;
    private int sellingPrice;
    private int numberOfGuitarStrings;


    public Guitar( InstrumentType instrumentType, String name, String type, String colour, int buyingPrice, int sellingPrice, int numberOfGuitarStrings ){
        super(instrumentType, name, type, colour, buyingPrice, sellingPrice);
        this.numberOfGuitarStrings = numberOfGuitarStrings;
    }

    public int getNumberOfGuitarStrings() {
        return numberOfGuitarStrings;
    }

    public void setNumberOfGuitarStrings(int numberOfGuitarStrings) {
        this.numberOfGuitarStrings = numberOfGuitarStrings;
    }

    @Override
    public String play(Instrument instrument) {
        return "Guitar sounds..";
    }
}
