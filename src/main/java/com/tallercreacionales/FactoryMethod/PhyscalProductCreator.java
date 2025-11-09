package com.tallercreacionales.FactoryMethod;

public class PhyscalProductCreator extends ProductCreator {

    private int nextId = 1;

    @Override
    public Product createProduct() {
        PhysicalProduct p = new PhysicalProduct();
        p.setId(nextId++);
        p.setName("New Digital Product");
        p.setPrice(0.0);
        p.setWeight(0.0);
        p.setDimensions("unknown");
        return p;
    }

}
