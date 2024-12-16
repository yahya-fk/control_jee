package com.example.control.service;

import com.example.control.dao.repository.CarRepository;
import com.example.control.dtos.CarDTO;
import com.example.control.mappers.CarMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class CarManager implements CarService {
    @Autowired
    CarRepository carRepository;
    CarMapper carMapper = new CarMapper();
    @Override
    public List<CarDTO> saveAll(List<CarDTO> carDTOList) {
        List<CarDTO> carDTOList1 = new ArrayList<>();
        for(CarDTO carDTO: carDTOList){
            carDTOList1.add(carMapper.CarToCarDTO(carRepository.save(carMapper.CarDTOToCar(carDTO))));
        }

        return carDTOList;
    }

    @Override
    public CarDTO save(CarDTO carDTO) {
        return carMapper.CarToCarDTO(carRepository.save(carMapper.CarDTOToCar(carDTO)));
    }

    @Override
    public List<CarDTO> findByMatricul(String matricul) {
        return carMapper.CarListToCarDTOList(carRepository.findByMatricul(matricul));
    }
}
