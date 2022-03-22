package com.example.demo2.controller;



import com.example.demo2.models.Customer;
import com.example.demo2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerRepository CustomerRepository;

    @GetMapping(value ="/all" )
    public List<Customer> getAll() {
        return CustomerRepository.findAll();
    }

    @GetMapping(value ="/{id}" )
    public Optional<Customer> getid(@PathVariable int id) {
        return CustomerRepository.findById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteid(@PathVariable int id){
        System.out.println("Deleting Customer with id " + id );
        CustomerRepository.deleteById(id);
        System.out.println("Deleted");
    }

    @PostMapping(value = "/add")
    public Optional<Customer> add(@RequestBody final Customer customer){
        CustomerRepository.save(customer);
        return CustomerRepository.findById(customer.getId());
    }

    @PutMapping(value = "/{id}")
    public Customer putid(@PathVariable int id,@RequestBody final Customer customer){
        customer.setId(id);
        CustomerRepository.save(customer);
        return customer;
    }
}
