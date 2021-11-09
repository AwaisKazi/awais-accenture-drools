package com.accenture.droolsdemo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.accenture.droolsdemo")
public class SketcherstaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SketcherstaskApplication.class, args);
	}

}
