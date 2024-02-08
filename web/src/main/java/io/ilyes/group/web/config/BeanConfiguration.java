package io.ilyes.group.web.config;


import io.ilyes.group.infra.mongodbmanger.MongoDbOrderRepository;
import io.ilyes.group.model.port.OrderRepository;
import io.ilyes.group.model.service.DomainOrderService;
import io.ilyes.group.model.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    OrderService getOrderService(OrderRepository orderRepository){
        return new DomainOrderService(orderRepository);
    }

    @Bean
    OrderRepository getOrderRepository() {
        return new MongoDbOrderRepository();
    }
}
