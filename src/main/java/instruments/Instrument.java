
package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    InstrumentType instrumentType;
    private String name;
    private String type;
    private String colour;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(InstrumentType instrumentType, String name, String type, String colour, double buyingPrice, double sellingPrice) {
        this.instrumentType = instrumentType;
        this.name = name;
        this.type = type;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getOrchestraSectionFromInstrumentType() {
        return this.instrumentType.getOrchestraSection();
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String play(IPlay instrument) {
        return null;
    }

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
