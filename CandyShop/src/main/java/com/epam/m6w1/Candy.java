package com.epam.m6w1;

public class Candy extends com.epam.m6w1.Gifts {
    private enum Taste {HONEY,MENTHOL,CLASSIC};
    private Taste taste = Taste.CLASSIC;


    public Candy() {
        super("Classic candy",190);
    }

    public Candy(String name, int price, int quantity, Taste taste) {
        super(name,price,quantity);
        this.taste = taste;
    }

    @Override
    public String getSpecialParameter() {
        return String.valueOf(taste);
    }
}
