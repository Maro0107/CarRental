package com.project.carrental.module.service;

import com.project.carrental.module.dto.CarDto;
import com.project.carrental.module.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/api/car/{id}")
    public CarDto getCar(@PathVariable Long id) {
        return CarMapper.map(carService.getOneById(id));
    }

//@GetMapping(value = "/api/car/{colour}")
//public CarDto getCar(@PathVariable String colour) {
//    return CarMapper.map(carService.getAll());
//}


    @GetMapping("/api/car")
    public List<CarDto> getCars(
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) String model,
            @RequestParam(required = false) String bodyType,
            @RequestParam(required = false) String colour,
            @RequestParam(required = false) Long prodDate,
            @RequestParam(required = false) Long mileage,
            @RequestParam(required = false) Long amount,
            @RequestParam(required = false) String status
    ) {
        return CarMapper.map(
                carService.getAll(brand, model, bodyType, colour, prodDate, mileage, amount, status)
        );
    }

}

