package com.techelevator;

import java.math.BigDecimal;

public class ForSale {
    private int slot;
    private String name;
    private BigDecimal price;
    private String type;
    private int stock;

    public ForSale(int slot, String name, BigDecimal price, String type, int stock) {
        this.slot = slot;
        this.name = name;
        this.price = price;
        this.type = type;
        stock = 5;
    }

    public int getSlot() {
        return slot;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getStock() {
        return stock;
    }
}
