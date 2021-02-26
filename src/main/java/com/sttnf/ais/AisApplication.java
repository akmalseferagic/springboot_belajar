package com.sttnf.ais;

import com.sttnf.ais.config.DaoSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@Import({DaoSpringConfig.class})
@ComponentScan({"com.ais.controller"})
public class AisApplication {

	public static void main(String[] args) {
		SpringApplication.run(AisApplication.class, args);
	}

}
