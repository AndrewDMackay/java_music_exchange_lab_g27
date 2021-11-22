
package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stockList;

    public Shop() {
        this.stockList = new ArrayList<ISell>();
    }

    public int getStockListSize() {
        return stockList.size();
    }

    public void addStock(ISell stock){
        this.stockList.add(stock);
    }

    public void removeStock(ISell stock){
        this.stockList.remove(stock);
    }
}
