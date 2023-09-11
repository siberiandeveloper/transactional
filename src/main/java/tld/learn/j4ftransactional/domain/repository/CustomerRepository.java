package tld.learn.j4ftransactional.domain.repository;

import tld.learn.j4ftransactional.domain.model.Customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {

    void saveCustomer(Customer customer);

    Optional<Customer> findCustomerByUuid(UUID uuid);

}

