package com.gateway.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	// De forma Programatica usando um RouteLocator
	// Foi substituido a mesma rota no application.yml permitindo uma alteração da rota sem necessidade de deployar toda a aplicação

//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(predicate ->
//						predicate.path("/get")
//						.filters( f -> f.addRequestHeader("Gabriel", "Felix"))
//						.uri("http://httpbin.org:80"))
//				.build();
//	}
}
