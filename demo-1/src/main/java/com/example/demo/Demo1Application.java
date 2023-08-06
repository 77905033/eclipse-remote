package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Demo1Application {

	public static void main(String[] args) {
		System.out.println("sssss");
		SpringApplication.run(Demo1Application.class, args);
	}

}
