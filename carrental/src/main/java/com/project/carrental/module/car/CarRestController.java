package com.project.carrental.module.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CarRestController {
    @Autowired
    private CarRepository carRepository;

//    @GetMapping("/api/init")
//    public List<CarEntity> init() {
//
//        carRepository.saveAndFlush(new CarEntity()
//                .setBrand("Available")
//                .setModel("Available")
//                .setColour("Available")
//                        .setProdDate(1234)
//                .setStatus("Available")
//                .setAmount(1)
////                .setBodyType("Available")
//
//
//                .setMileage(40)
//
//                );
//
//
//        return carRepository.findAll();
//    }


    @GetMapping("/api/car")
    public List<CarEntity> getBooks() {
        return carRepository.findAll();
    }

    @GetMapping("/api/car/{id}")
    public CarEntity getBook(@PathVariable Long id) {
        return carRepository.findOneById(id);
    }
}
