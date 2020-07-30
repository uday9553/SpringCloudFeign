package com.uday.feign;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.uday.model.Response;

@org.springframework.cloud.openfeign.FeignClient(url = "https://jsonplaceholder.typicode.com",name = "Person")
public interface PersonFeignClient {
	@GetMapping("/todos")
	public List<Response> getPersons();
}
