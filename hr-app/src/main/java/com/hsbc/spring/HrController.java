package com.hsbc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HrController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(path = "/hr/details")
	public ResponseEntity<String> getDetails(@RequestParam("id") int id, @RequestHeader("Accept") String header) {

		HttpHeaders headers = new HttpHeaders();
		if (header.equals("application/json")) {
			headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		} else if (header.equals("application/xml")) {
			headers.set("Accept", MediaType.APPLICATION_XML_VALUE);
		} else {
			return ResponseEntity.status(406).build();
		}

		HttpEntity requestData = new HttpEntity<>(headers);

		ResponseEntity<String> response = restTemplate.exchange("http://emp-service/emp/find/" + id, HttpMethod.GET,
				requestData, String.class);
		return response;
	}
}
