package com.manning.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Enable component-scanning and auto configuration
@SpringBootApplication
public class ReadinglistApplication {

	public static void main(String[] args) {
        // Bootstrap application
		SpringApplication.run(ReadinglistApplication.class, args);
	}

}
