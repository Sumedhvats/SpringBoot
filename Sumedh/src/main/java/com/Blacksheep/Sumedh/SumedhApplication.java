package com.Blacksheep.Sumedh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumedhApplication {

    public static void main(String[] args) {
       var ctx= SpringApplication.run(SumedhApplication.class, args);
		MyFirstService firstService=ctx.getBean(MyFirstService.class);
		System.out.println(firstService.tellAStory());
    }

}
