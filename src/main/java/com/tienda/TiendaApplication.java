package com.tienda;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@OpenAPIDefinition(
		info = @Info(
				title = "Store api project",
				version = "1.0.0",
				description = "This project is only for learning!",
				termsOfService = "https://github.com/danigaru",
				contact = @Contact(
						name = "Danilo García",
						email = "https://github.com/danigaru"
				),
				license = @License(
						name = "Licence",
						url = "https://github.com/danigaru"
				)
		)
)

public class TiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
	}

}

