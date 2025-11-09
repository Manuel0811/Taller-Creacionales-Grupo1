package com.tallercreacionales.FactoryMethod;

public class DigitalProduct implements Product {

    protected int id;
    protected String name;
    protected double price;
    protected double sizeMb;
    protected String format;

    public DigitalProduct() {

    }

    public DigitalProduct(String format, int id, String name, double price, double sizeMb) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSizeMb() {
        return sizeMb;
    }

    public void setSizeMb(double sizeMb) {
        this.sizeMb = sizeMb;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
