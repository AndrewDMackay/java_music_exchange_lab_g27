
package instruments;

public abstract class Instrument {

    InstrumentType instrumentType;
    private String name;
    private String type;
    private String colour;
    private int buyingPrice;
    private int sellingPrice;

    public Instrument(InstrumentType instrumentType, String name, String type, String colour, int buyingPrice, int sellingPrice) {
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

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
