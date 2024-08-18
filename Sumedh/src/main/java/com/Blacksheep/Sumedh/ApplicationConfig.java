package com.Blacksheep.Sumedh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean("MyFirstClass")
	public MyFirstClass myFirstClass(){
		return new MyFirstClass("First Bean");
	}

}
