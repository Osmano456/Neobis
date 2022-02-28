package com.example.demo2.controller;


import com.example.demo2.models.Orders;
import com.example.demo2.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/rest/Orders")
public class OrdersController {

    @Autowired
    OrdersRepository ordersRepository;

    @GetMapping(value ="/all" )
    public List<Orders> getAll() {
        return ordersRepository.findAll();
    }

    @GetMapping(value ="/{id}" )
    public Optional<Orders> getid(@PathVariable int id) {
        return ordersRepository.findById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteid(@PathVariable int id){
        System.out.println("Deleting Order with id " + id );
        ordersRepository.deleteById(id);
        System.out.println("Deleted");
    }

    @PostMapping(value = "/add")
    public Optional<Orders> add(@RequestBody final Orders order){
        ordersRepository.save(order);
        return ordersRepository.findById(order.getId());
    }

    @PutMapping(value = "/{id}")
    public Orders putid(@PathVariable int id,@RequestBody final Orders order){
        order.setId(id);
        ordersRepository.save(order);
        return order;
    }
}
