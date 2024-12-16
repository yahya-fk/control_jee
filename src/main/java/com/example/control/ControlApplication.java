package com.example.control;

import com.example.control.dtos.CarDTO;
import com.example.control.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(CarService carService){
		return args -> {
				List<CarDTO> cars = List.of(
						new CarDTO("Model1", "red","mat1", 1000),
						new CarDTO("Model2", "bleu","mat2", 5000),
						new CarDTO("Model1", "green","mat3", 750),
						new CarDTO("Model3", "yellow","mat4", 980)

				);
				carService.saveAll(cars);
		};
	}
}
