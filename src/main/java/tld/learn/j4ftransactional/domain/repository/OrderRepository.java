package tld.learn.j4ftransactional.domain.repository;

import tld.learn.j4ftransactional.domain.model.Order;

import java.util.Optional;

public interface OrderRepository {

    void saveOrder(Order order);

    Optional<Order> finaOrderByNumber(String number);

}

