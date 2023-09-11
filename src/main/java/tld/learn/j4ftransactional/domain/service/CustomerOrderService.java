package tld.learn.j4ftransactional.domain.service;

import tld.learn.j4ftransactional.domain.model.Customer;
import tld.learn.j4ftransactional.domain.model.Item;
import tld.learn.j4ftransactional.domain.model.Order;

import java.util.List;

public class CustomerOrderService implements OrderService {

    @Override
    public Order createOrder(Customer customer, List<Item> items) {
        return null;
    }

}

