package com.tallercreacionales.System;
import java.util.*;
import com.tallercreacionales.FactoryMethod.Product;

public class Category {
    protected String name;
    protected String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void addProduct(Product product) {
        // Lógica para agregar un producto a la categoría
    }

    public List<Product> getProducts() {
        // Lógica para obtener los productos de la categoría
        return new ArrayList<>();
    }
}
