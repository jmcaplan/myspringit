package com.vega.myspringit;

import java.util.Iterator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vega.myspringit.domain.Link;
import com.vega.myspringit.repository.LinkRepository;

@SpringBootApplication
public class MyspringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringitApplication.class, args);
		System.out.println("Hello to me");
		
	}
	
	/*
	@Bean
	CommandLineRunner runner(LinkRepository linkRepository) {
		return args -> {
			linkRepository.save(new Link());
		};
	}
	*/
}
