package com.dancas.appsmaster;

import com.dancas.appsmaster.model.AppEntity;
import com.dancas.appsmaster.model.Application;
import com.dancas.appsmaster.repository.ApplicationRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

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


}
