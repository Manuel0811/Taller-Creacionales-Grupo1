package com.tallercreacionales.FactoryMethod;

public class PhysicalProduct implements Product {

    protected int id;
    protected String name;
    protected double price;
    protected double weight;
    protected String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(String dimensions, int id, String name, double price, double weight) {
        this.dimensions = dimensions;
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

}
