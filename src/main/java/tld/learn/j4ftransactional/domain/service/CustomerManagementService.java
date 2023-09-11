package tld.learn.j4ftransactional.domain.service;

import lombok.RequiredArgsConstructor;
import tld.learn.j4ftransactional.domain.exception.CustomerRegistrationException;
import tld.learn.j4ftransactional.domain.model.Customer;
import tld.learn.j4ftransactional.domain.model.FullName;
import tld.learn.j4ftransactional.domain.repository.CustomerRepository;

@RequiredArgsConstructor
public class CustomerManagementService implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer registerCustomer(FullName name, String phone) {

        if (name.getFirstName() == null || name.getLastName() == null) {
            throw new CustomerRegistrationException(name);
        }

        final var customer = new Customer(name, phone);

        customerRepository.saveCustomer(customer);

        return customer;
    }

}

