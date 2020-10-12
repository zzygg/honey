package com.zzy.honey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzy.honey.dao")
public class HoneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoneyApplication.class, args);
	}

}
