package com.example.RetoActuatorMicrometers.Service;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
	
Logger logger = LoggerFactory.getLogger(Service.class);
	
	RestTemplate restTemplate = new RestTemplate();
	String urlOrigen = "http://localhost:8080/";
	String endPoint = "status/";
	
	

	public void changeStatusToOpen() {
		String fooResourceUrl = urlOrigen+endPoint;
		ResponseEntity<String> response = restTemplate.postForEntity(URI.create(fooResourceUrl), "open", String.class);
		logger.info("Status set to Open" );

	}
	
	public void changeStatusToHalfOpen() {
		String fooResourceUrl = urlOrigen+endPoint;
		ResponseEntity<String> response = restTemplate.postForEntity(URI.create(fooResourceUrl), "half-open", String.class);
		logger.info("Status set to Half-Open");

	}
	
	public void changeStatusToClose() {
		String fooResourceUrl = urlOrigen+endPoint;
		ResponseEntity<String> response = restTemplate.postForEntity(URI.create(fooResourceUrl), "close", String.class);
		logger.info("Status set to Close");

	}
	
	

}
