package edu.poniperro.gildedrose.domain;

public final class Item {

    private String name;
    private int sellIn;
    private int quality;

    public Item (String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
