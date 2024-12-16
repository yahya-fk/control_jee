package com.example.control.mappers;

import com.example.control.dao.entity.Car;
import com.example.control.dtos.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarMapper {
    ModelMapper modelMap = new ModelMapper();
    public Car CarDTOToCar(CarDTO carDTO){
        return modelMap.map(carDTO, Car.class);
    }
    public CarDTO CarToCarDTO(Car car){
        return modelMap.map(car, CarDTO.class);
    }
    public List<CarDTO> CarListToCarDTOList(List<Car> carList){
        List<CarDTO> carDTOList = new ArrayList<>();
        for(Car car: carList){
            carDTOList.add(CarToCarDTO(car));
        }
        return carDTOList;
    }
}
