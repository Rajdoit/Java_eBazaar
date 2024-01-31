package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EBazaarSoftApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EBazaarSoftApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
        System.out.println("this is testing");
    }
}
