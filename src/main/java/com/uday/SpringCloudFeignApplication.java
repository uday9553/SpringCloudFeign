package com.uday;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.feign.PersonFeignClient;
import com.uday.model.Response;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFeignApplication {
	@Autowired
	private PersonFeignClient feignClient;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}
	
	@GetMapping("/getPersons")
	public List<Response> getPersons(){
		return feignClient.getPersons();
	}

}
