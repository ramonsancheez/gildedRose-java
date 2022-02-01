package edu.poniperro.gildedrose.domain;

public class BackStage extends  NormalItem{
    public BackStage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    @Override
    public void updateQuality() {
        int quality = getQuality();
        int sellIn = getSellIn();

        if (sellIn >= 10){
            setQuality(quality + 1);
        } else if (sellIn >= 5) {
            setQuality(quality + 2);
        } else if (sellIn >= 0) {
            setQuality(quality + 3);
        } else {
            setQuality(0);
        }
    }
}
