package com.hashtips.springBootStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //says this is an spring boot application
public class SpringBootStartApplication { // every java project needs a start point // this is the start point of spring boot application

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartApplication.class, args);
	}
}
