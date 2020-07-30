package com.dancas.appsmaster;

import com.dancas.appsmaster.model.AppEntity;
import com.dancas.appsmaster.model.Application;
import com.dancas.appsmaster.repository.ApplicationRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class AppsmasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppsmasterApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(ApplicationRepository repository) {
		return (args) -> {
			List<AppEntity> entityList = new ArrayList<AppEntity>();
//			AppEntity appEntity = new AppEntity(11l, "Entity1", "EntityDescription1");
//			entityList.add(appEntity);
			repository.save(new Application(1l, "App1", "app1@domain.com", "descripcion1", new Date(10-02-2020), null));
			//repository.save(new Application(2, "App2", "app2@domain.com", "descripcion2", new Date(10-02-2020), appEntity));
			//repository.save(new Application(3, "App3", "app3@domain.com", "descripcion3", new Date(10-02-2020), appEntity));
			//repository.save(new Application(4, "App4", "app4@domain.com", "descripcion4", new Date(10-02-2020), appEntity));
			//repository.save(new Application(5, "App5", "app5@domain.com", "descripcion5", new Date(10-02-2020), appEntity));

			repository.findAll().forEach(System.out::println);


		};
	}

}
