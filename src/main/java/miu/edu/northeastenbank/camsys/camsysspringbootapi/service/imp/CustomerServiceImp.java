package miu.edu.northeastenbank.camsys.camsysspringbootapi.service.imp;

import miu.edu.northeastenbank.camsys.camsysspringbootapi.entity.Customer;
import miu.edu.northeastenbank.camsys.camsysspringbootapi.repository.CustomerRepository;
import miu.edu.northeastenbank.camsys.camsysspringbootapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
}
