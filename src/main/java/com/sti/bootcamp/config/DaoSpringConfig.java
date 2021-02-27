package com.sti.bootcamp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sti.bootcamp.dao.MahasiswaDao;
import com.sti.bootcamp.dao.MatakuliahDao;
import com.sti.bootcamp.dao.impl.MahasiswaDaoImpl;
import com.sti.bootcamp.dao.impl.MatakuliahDaoImpl;

@Configuration
public class DaoSpringConfig {
    
        @Bean
	public MahasiswaDao mahasiswaDao() {
	    return new MahasiswaDaoImpl();
	}
        
        @Bean
	public MatakuliahDao matakuliahDao() {
		return new MatakuliahDaoImpl();
	}
        
//	@Bean
//	public TransactionDao transactionDao() {
//		return new TransactioDaoImpl();
//	}
	@Bean
    public WebMvcConfigurerAdapter corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
            	registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("*")
                .allowedHeaders("*");
            }
        };
    }
}
