package tld.learn.j4ftransactional.domain.service;

import tld.learn.j4ftransactional.domain.model.Customer;
import tld.learn.j4ftransactional.domain.model.FullName;

public interface CustomerService {

    Customer registerCustomer(FullName name, String phone);

}

