package com.hsbc.spring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

public class GetClient {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> response = rt.getForEntity("https://jsonplaceholder.typicode.com/posts/90",
				String.class);
		System.out.println(response.getBody());

		// stage 2
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		HttpEntity requestData = new HttpEntity<>(headers);
		
		ResponseEntity<String> response1=rt.exchange("http://localhost:8080/emp/find/104", HttpMethod.GET, requestData, String.class);

		System.out.println(response1.getBody());

	}
}
