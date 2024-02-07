package io.ilyes.group.model.service;

import io.ilyes.group.model.Product;

import java.util.UUID;

public interface OrderService {
    public UUID createOrder(Product product);

    public void addProduct(UUID id, Product product);

    void completeOrder(UUID id);

    void deleteProduct(UUID id, UUID productId);
}
