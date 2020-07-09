package com.vega.myspringit;

import java.util.Iterator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.vega.myspringit.domain.Comment;
import com.vega.myspringit.domain.Link;
import com.vega.myspringit.repository.CommentRepository;
import com.vega.myspringit.repository.LinkRepository;

@SpringBootApplication
@EnableJpaAuditing
public class MyspringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringitApplication.class, args);
		System.out.println("Hello to me");
		
	}
	
	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link1 = new Link("Getting Started with Spring Boot 2", "https://google.com");
			linkRepository.save(link1);
			
			Comment comment1 = new Comment("this link is gevaldik", link1);
			commentRepository.save(comment1);
			link1.addComment(comment1);
			
		};
	}
	
}
