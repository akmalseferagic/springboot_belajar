package com.sti.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sti.bootcamp.config.DaoSpringConfig;

@Configuration
@SpringBootApplication
@Import({DaoSpringConfig.class})
@ComponentScan({"com.bootcamp.controller"})
public class App {
	public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
