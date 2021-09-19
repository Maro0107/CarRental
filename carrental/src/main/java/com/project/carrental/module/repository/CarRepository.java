package com.project.carrental.module.repository;

import com.project.carrental.module.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends  JpaRepository<CarEntity, Long>, JpaSpecificationExecutor<CarEntity> {
    CarEntity findOneById(Long id);
}
