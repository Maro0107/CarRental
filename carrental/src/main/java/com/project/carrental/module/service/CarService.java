package com.project.carrental.module.service;

import com.project.carrental.module.entity.CarEntity;
import com.project.carrental.module.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public CarEntity getOneById(Long id) {
        return carRepository.findOneById(id);
    }


    public List<CarEntity> getAll(String brand, String model, String bodyType, String colour, Long prodDate, Long mileage, Long amount, String status) {

        if (brand != null) {
            return carRepository.findAllByBrand(brand);
        }
        if (model != null) {
            return carRepository.findAllByModel(model);
        }
        if (bodyType != null) {
            return carRepository.findAllByBodyType(bodyType);
        }
        if (colour != null) {
            return carRepository.findAllByColour(colour);
        }
        if (prodDate != null) {
            return carRepository.findAllByProdDate(prodDate);
        }
        if (mileage != null) {
            return carRepository.findAllByMileage(mileage);
        }
        if (amount != null) {
            return carRepository.findAllByAmount(amount);
        }
        if (status != null) {
            return carRepository.findAllByStatus(status);
        }

        return carRepository.findAll();
    }
}
