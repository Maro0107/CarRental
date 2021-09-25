package com.project.carrental.module.repository;

import com.project.carrental.module.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends  JpaRepository<CarEntity, Long>, JpaSpecificationExecutor<CarEntity> {

    CarEntity findOneById(Long id);

    List<CarEntity> findAllByBrand(String brand);

    List<CarEntity> findAllByModel(String model);

    List<CarEntity> findAllByBodyType(String bodyType);

    List<CarEntity> findAllByColour(String colour);

    List<CarEntity> findAllByProdDate(Long prodDate);

    List<CarEntity> findAllByMileage(Long mileage);

    List<CarEntity> findAllByAmount(Long amount);

    List<CarEntity> findAllByStatus(String status);
}
