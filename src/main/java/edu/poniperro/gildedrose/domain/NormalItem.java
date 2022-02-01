package edu.poniperro.gildedrose.domain;

public class NormalItem implements Updateable {
    private Item item;

    public NormalItem(String name, int sellIn, int quality) {
        item = new Item(name, sellIn, quality);
    }
    public void updateQuality() {
        int quality = getQuality();
        int sellIn = getSellIn();
        if (sellIn < 0) {
            setQuality(quality - 2);
        }else {
            setQuality(quality - 1);
        }
    }

    public void update() {
        setSellIn();
        updateQuality();
    }

    String getName() {
        return item.name;
    }

    int getSellIn() {
        return item.sellIn;
    }

    void setSellIn() {
        item.sellIn = getSellIn() - 1;
    }

    int getQuality() {
        return item.quality;
    }

    void setQuality(int value) {
        if (value > 50) {
            item.quality = 50;
        }else if(value < 0){
            item.quality = 0;
        }else{
            item.quality = value;
        }
    }
}
