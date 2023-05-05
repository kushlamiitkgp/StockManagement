package com.microservices.stockmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class StockmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockmgmtApplication.class, args);
	}

}
