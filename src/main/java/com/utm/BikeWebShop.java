package com.utm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bike")
public class BikeWebShop {

    @Autowired
    public BikeRepository bikeRepository;

    @GetMapping("/all")
    public List<Bike> findAll(){
        return bikeRepository.findAll();
    }

    @PostMapping("addbike")
    public void save(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable long id, @RequestBody Bike bike) {
        bikeRepository.update(id, bike);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        bikeRepository.delete(id);
    }
}
