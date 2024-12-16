package com.example.control.dao.repository;

import com.example.control.dao.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByMatricul(String matricul);
}
