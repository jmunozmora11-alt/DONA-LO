package co.donalo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories (basePackages = {"co.donalo.jpa"})
@EntityScan(basePackages = {"co.donalo.entity"})
@ComponentScan (basePackages = {"co.donalo.controller" , "co.donalo.repository"
		,"co.donalo.service" })

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
