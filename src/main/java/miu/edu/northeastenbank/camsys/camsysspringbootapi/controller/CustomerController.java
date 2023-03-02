package miu.edu.northeastenbank.camsys.camsysspringbootapi.controller;

import jakarta.validation.Valid;
import miu.edu.northeastenbank.camsys.camsysspringbootapi.entity.Customer;
import miu.edu.northeastenbank.camsys.camsysspringbootapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/camsys/api/customer/register")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> register(@RequestBody @Valid Customer customer) {
        return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
    }
}
