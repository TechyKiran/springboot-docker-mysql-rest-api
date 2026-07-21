package com.example.DockerwithMultifiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DockerwithMultifilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerwithMultifilesApplication.class, args);
	}

}
