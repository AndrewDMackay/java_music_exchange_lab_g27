
package items;

import instruments.InstrumentType;

public class GuitarStrings extends Item {

    private int numberOfGuitarStrings;
    private double stringGauge;

    public GuitarStrings( String name, String type, double buyingPrice, double sellingPrice, int numberOfGuitarStrings, double stringGauge ){
        super(name, type, buyingPrice, sellingPrice);
        this.numberOfGuitarStrings = numberOfGuitarStrings;
        this.stringGauge = stringGauge;
    }

    public int getNumberOfGuitarStrings() {
        return this.numberOfGuitarStrings;
    }

    public void setNumberOfGuitarStrings(int numberOfGuitarStrings) {
        this.numberOfGuitarStrings = numberOfGuitarStrings;
    }

    public double getStringGauge() {
        return this.stringGauge;
    }

    public void setStringGauge(double stringGauge) {
        this.stringGauge = stringGauge;
    }

    @Override
    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
