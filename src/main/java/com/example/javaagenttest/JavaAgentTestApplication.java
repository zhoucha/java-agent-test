package com.example.javaagenttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 周超
 */
@SpringBootApplication
public class JavaAgentTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAgentTestApplication.class, args);
		new Hello().test();
	}

}
