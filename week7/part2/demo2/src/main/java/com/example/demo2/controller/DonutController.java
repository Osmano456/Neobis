package com.example.demo2.controller;

import com.example.demo2.models.Donut;
import com.example.demo2.repository.DonutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/rest/Donut")
public class DonutController {

    @Autowired
    DonutRepository donutRepository;

    @GetMapping(value ="/all" )
    public List<Donut> getAll() {
        return donutRepository.findAll();
    }

    @GetMapping(value ="/{id}" )
    public Optional<Donut> getid(@PathVariable int id) {
        return donutRepository.findById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteid(@PathVariable int id){
        System.out.println("Deleting Donut with id " + id );
        donutRepository.deleteById(id);
        System.out.println("Deleted");
    }

    @PostMapping(value = "/add")
    public Optional<Donut> add(@RequestBody final Donut donut){
        donutRepository.save(donut);
        return donutRepository.findById(donut.getId());
    }

    @PutMapping(value = "/{id}")
    public Donut putid(@PathVariable int id,@RequestBody final Donut donut){
        donut.setId(id);
        donutRepository.save(donut);
        return donut;
    }
}
