package com.sttnf.ais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sttnf.ais.config.DaoSpringConfig;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@SpringBootApplication
@Import({DaoSpringConfig.class})
@ComponentScan({"com.sttnf*"})
@EnableSwagger2
public class App {
	public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
        
        @Configuration
        public class SpringFoxConfig {                                    
            @Bean
            public Docket api() { 
                return new Docket(DocumentationType.SWAGGER_2)  
                  .select()                                  
                  .apis(RequestHandlerSelectors.any())              
                  .paths(PathSelectors.any())                          
                  .build();                                           
            }
        }
}
