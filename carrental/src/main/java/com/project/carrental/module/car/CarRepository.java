package com.project.carrental.module.car;

import com.project.carrental.module.car.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends  JpaRepository<CarEntity, Long>, JpaSpecificationExecutor<CarEntity> {
    CarEntity findOneById(Long id);
}
