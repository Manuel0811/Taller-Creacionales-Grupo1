package com.tallercreacionales.FactoryMethod;

import com.tallercreacionales.FactoryMethod.DigitalProduct;

public class DigitalProductCreator extends ProductCreator {

    @Override
    public Product createProduct() {
        return new DigitalProduct;
    }

}
