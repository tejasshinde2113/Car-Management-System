package com.packt.cardatabase;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.domain.OwnerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(
					CardatabaseApplication.class
	);

	private final CarRepository repository;
	private final OwnerRepository ownerRepository;

	public CardatabaseApplication(CarRepository repository, OwnerRepository ownerRepository) {
		this.repository = repository;
		this.ownerRepository = ownerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Application started");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Hello Spring Boot");

		Owner owner1 = new Owner("John" , "Johnson");
		Owner owner2 = new Owner("Mary" , "Robinson");
		ownerRepository.saveAll(Arrays.asList(owner1, owner2));

		repository.save(new Car("Ford", "Mustang", "Red",
						"ADF-1121", 2023, 59000, owner1));
		repository.save(new Car("Nissan", "Leaf", "White",
						"SSJ-3002", 2020, 29000, owner2));
		repository.save(new Car("Toyota", "Prius",
						"Silver", "KKO-0212", 2022, 39000, owner2));
		// Fetch all cars and log to console
		for (Car car : repository.findAll()) {
			logger.info("brand: {}, model: {}",
							car.getBrand(), car.getModel());
		}

	}
}


