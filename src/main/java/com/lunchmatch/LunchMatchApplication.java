package com.lunchmatch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lunchmatch.mapper")
public class LunchMatchApplication {
	public static void main(String[] args) {
		SpringApplication.run(LunchMatchApplication.class, args);
	}
}