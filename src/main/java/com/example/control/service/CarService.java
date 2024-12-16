package com.example.control.service;

import com.example.control.dtos.CarDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarService {
    public List<CarDTO> saveAll(List<CarDTO> carDTOList);
    public CarDTO save(CarDTO carDTO);
    public List<CarDTO> findByMatricul(String matricul);
}
