package com.tallercreacionales.FactoryMethod;

public class DigitalProduct implements Product {

    protected int id;
    protected String name;
    protected double price;
    protected int sizeMb;
    protected String format;

    public DigitalProduct(String format, int id, String name, double price, int sizeMb) {
        this.format = format;
        this.id = id;
        this.name = name;
        this.price = price;
        this.sizeMb = sizeMb;
    }

    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
