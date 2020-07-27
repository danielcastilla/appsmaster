package com.dancas.appsmaster;

import com.dancas.appsmaster.model.Application;
import com.dancas.appsmaster.repository.ApplicationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class AppsmasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppsmasterApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ApplicationRepository applicationRepository) {
		return args -> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
				Application application = new Application(name, name.toLowerCase() + "@domain.com");
				applicationRepository.save(application);
			});
			applicationRepository.findAll().forEach(System.out::println);
		};
	}


}
