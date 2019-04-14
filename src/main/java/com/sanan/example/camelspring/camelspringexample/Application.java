package com.sanan.example.camelspring.camelspringexample;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/camelContext.xml")
public class Application {
	
	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = new SpringApplication(Application.class).run(args);
        System.out.println("Hit Enter to terminate");
        System.in.read();
        context.close();
	}
}
