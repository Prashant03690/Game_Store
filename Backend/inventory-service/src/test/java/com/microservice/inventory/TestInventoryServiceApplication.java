package com.microservice.inventory;

import org.springframework.boot.SpringApplication;

public class TestInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(InventoryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
