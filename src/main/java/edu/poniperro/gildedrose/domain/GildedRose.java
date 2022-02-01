package edu.poniperro.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private List<Updateable> stock = new ArrayList<>();

    public void addToStock(Updateable newItem){
        stock.add(newItem);
    }
    public void updateStock(){
        for (Updateable item: stock) {
            item.update();
        }
    }
    public void printStock() {
        for (Updateable item: stock){
            System.out.println(item);
        }

    }


}
