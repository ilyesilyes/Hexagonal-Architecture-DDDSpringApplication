package io.ilyes.group.web.controller;

import io.ilyes.group.model.Product;

public class AddProductRequest {
    private Product product;

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
