package io.ilyes.group.infra.mongodbmanger;

import io.ilyes.group.model.Order;
import io.ilyes.group.model.port.OrderRepository;

import java.util.Optional;
import java.util.UUID;


public class MongoDbOrderRepository implements OrderRepository {


    @Override
    public Optional<Order> findById(UUID ID) {
        return Optional.empty();
    }

    @Override
    public void save(Order order) {

    }
}
