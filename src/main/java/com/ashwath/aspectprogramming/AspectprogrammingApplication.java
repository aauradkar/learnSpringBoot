package com.ashwath.aspectprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectprogrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectprogrammingApplication.class, args);
	}

}
