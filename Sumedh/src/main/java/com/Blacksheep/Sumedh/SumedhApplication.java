package com.Blacksheep.Sumedh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;

@SpringBootApplication
public class SumedhApplication {
    public static void main(String[] args) {    
       var ctx= SpringApplication.run(SumedhApplication.class, args);
		MyFirstService firstService=ctx.getBean(MyFirstService.class);
		System.out.println(firstService.tellAStory());
        System.out.println(firstService.getNewCustomProperty());
//        System.out.println(firstService.getJavaVersion());
//        System.out.println(firstService.getOSVersion());
//        System.out.println(firstService.getProperty());
    }
}
