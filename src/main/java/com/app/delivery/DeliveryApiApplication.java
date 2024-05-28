package com.app.delivery;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "DELIVERY-API",
				description = "this delivery api for the ",
				contact = @Contact(
						name = "Sunil Mane",
						url = "http://localhost:9095/swagger-ui/index.html",
						email = "manesunil069@gmail.com"
				)
				,
				license = @License(
						name = "Apache 2.0",
						url = "https:localhost:9095/swagger-ui/index.html"
				)
		)
)
public class DeliveryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApiApplication.class, args);
	}

}
