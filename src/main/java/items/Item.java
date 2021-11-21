
package items;

import behaviours.ISell;

public abstract class Item implements ISell {

    private String name;
    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public Item(String name, String type, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
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

    public double calculateMarkUp() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
