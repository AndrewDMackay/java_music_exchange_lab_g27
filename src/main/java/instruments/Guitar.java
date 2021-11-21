package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    InstrumentType instrumentType;
    private String name;
    private String type;
    private String colour;
    private double buyingPrice;
    private double sellingPrice;
    private int numberOfGuitarStrings;


    public Guitar( InstrumentType instrumentType, String name, String type, String colour, double buyingPrice, double sellingPrice, int numberOfGuitarStrings ){
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

    @Override
    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
