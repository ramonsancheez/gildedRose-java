package edu.poniperro.gildedrose.domain;

public class Conjured extends NormalItem{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public void updateQuality() {
        int quality = getQuality();
        int sellIn = getSellIn();
        if (sellIn < 0) {
            setQuality(quality - 4);
        }else {
            setQuality(quality - 2);
        }
    }

}
