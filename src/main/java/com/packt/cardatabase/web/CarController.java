package com.packt.cardatabase.web;


import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
  private CarRepository carRepository;

  public CarController(CarRepository carRepository) {
    this.carRepository = carRepository;
  }


  @GetMapping("/cars")
  public Iterable<Car> getCars() {
    return carRepository.findAll();
  }
}
