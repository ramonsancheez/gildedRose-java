package edu.poniperro.gildedrose.domain;

public class AgedBrie extends NormalItem {
    public AgedBrie (String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }
    @Override
    public void updateQuality(){
        int quality = getQuality();
        int sellIn = getSellIn();

        if (sellIn < 0){
            setQuality(quality + 2);
        } else {
            setQuality(quality + 1);
        }
    }
}

