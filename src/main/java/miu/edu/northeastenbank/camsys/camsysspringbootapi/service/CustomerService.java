package miu.edu.northeastenbank.camsys.camsysspringbootapi.service;

import miu.edu.northeastenbank.camsys.camsysspringbootapi.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomer();
}
