package com.tallercreacionales.FactoryMethod;

public class PhysicalProduct implements Product {

    protected int id;
    protected String name;
    protected double price;
    protected double weight;
    protected String dimensions;

    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
