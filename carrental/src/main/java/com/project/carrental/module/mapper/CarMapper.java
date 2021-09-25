package com.project.carrental.module.mapper;

import com.project.carrental.module.dto.CarDto;
import com.project.carrental.module.entity.CarEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CarMapper {
    public static CarDto map(CarEntity entity) {
        return new CarDto()
                .setId(entity.getId())
                .setBrand(entity.getBrand())
                .setModel(entity.getModel())
                .setBodyType(entity.getBodyType())
                .setColour(entity.getColour())
                .setProdDate(entity.getProdDate())
                .setMileage(entity.getMileage())
                .setAmount(entity.getAmount())
                .setStatus(entity.getStatus());
    }

    public static List<CarDto> map(List<CarEntity> entities) {
        return entities
                .stream()
                .map(CarMapper::map)
                .collect(Collectors.toList());
    }
}
