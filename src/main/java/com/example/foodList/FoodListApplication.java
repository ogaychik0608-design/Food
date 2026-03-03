package com.example.foodList;

import com.example.foodList.model.Manufacturer;
import com.example.foodList.repository.ManufacturerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FoodListApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodListApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ManufacturerRepository repository) {
		return args -> {
			if (repository.count() == 0) {
				repository.save(new Manufacturer(null, "Kazakhstan", "KZ"));
				repository.save(new Manufacturer(null, "USA", "US"));
				repository.save(new Manufacturer(null, "Italy", "IT"));
			}
		};
	}
}
