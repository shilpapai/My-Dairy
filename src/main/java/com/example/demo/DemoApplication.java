package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.example")
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		new DemoApplication().configure(new SpringApplicationBuilder(DemoApplication.class)).run(args);
	}
}
