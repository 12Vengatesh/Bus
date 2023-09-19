package com.Bus.Bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusController {
    @Autowired
    private BusData repo;

    @GetMapping("/get")
    public List<Buses> getData(){   return repo.findAll();  }

    @PostMapping("/post")
    public Buses postData(@RequestBody Buses bus){ return repo.save(bus); }

    @DeleteMapping("/delete/{id}")
    public void deleteData(@PathVariable int id){ repo.deleteById(id);}

    @PutMapping("/put/{id}")
    public Buses putData(@PathVariable int id, @RequestBody Buses bus){
     Buses obj= repo.findById(id).orElseThrow(()->new NullPointerException());
     if(bus.getBusType()!=null)
         obj.setBusType(bus.getBusType());
     if(bus.getBusRoute()!=null)
         obj.setBusRoute(bus.getBusRoute());
     return repo.save(obj);
    }
    @GetMapping("/get/{id}")
    public List<Buses> getBy(@PathVariable int id){
        return repo.got(id);
    }

    @GetMapping("/get1/{id}")
    public List<Buses> got1(@PathVariable int id){
        return repo.got1(id);
    }
}