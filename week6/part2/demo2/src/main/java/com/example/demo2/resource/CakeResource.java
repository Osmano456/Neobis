package com.example.demo2.resource;


import com.example.demo2.models.Cake;
import com.example.demo2.repository.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/rest/cake")
public class CakeResource {

    @Autowired
    CakeRepository cakeRepository;

    @GetMapping(value ="/all" )
    public List<Cake> getAll() {
        return cakeRepository.findAll();
    }

    @GetMapping(value ="/{id}" )
    public Optional<Cake> getid(@PathVariable int id) {
        return cakeRepository.findById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteid(@PathVariable int id){
        System.out.println("Deleting Cake id " + id );
        cakeRepository.deleteById(id);
        System.out.println("Deleted");
    }

    @PostMapping(value = "/add")
    public List<Cake> add(@RequestBody final Cake cake){
        cakeRepository.save(cake);
        return cakeRepository.findAll();
    }

    @PutMapping(value = "/{id}")
    public Cake putid(@PathVariable int id,@RequestBody final Cake cake){
        cake.setId(id);
//        cakeRepository.deleteById(id);
        cakeRepository.save(cake);
        return cake;
    }

}
