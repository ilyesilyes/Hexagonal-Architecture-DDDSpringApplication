package io.ilyes.group.model.port;

import io.ilyes.group.model.Order;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Optional<Order> findById(UUID ID);
    void save(Order order);

}
