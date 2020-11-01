package com.example.project;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBoot5Application {

	public static void main(String[] args) {
		System.out.println("Application Started: ");
    SpringApplication.run(SpringBoot5Application.class, args);
    System.out.println("Application Ended. ");
  }
  
}
