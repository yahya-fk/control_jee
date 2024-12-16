package com.example.control.web;

import com.example.control.dao.entity.Car;
import com.example.control.dtos.CarDTO;
import com.example.control.mappers.CarMapper;
import com.example.control.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarGraphQLController {
    private CarService carService;

    @MutationMapping
    public CarDTO saveCar(@Argument Car car) {
        CarMapper carMapper = new CarMapper();
        return carService.save(carMapper.CarToCarDTO(car));
    }

    @QueryMapping
    public List<CarDTO> getCarByMatricul(@Argument String matricul) {
        return carService.findByMatricul(matricul);
    }

}
