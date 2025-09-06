package com.firstAPI.IrisWeb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.firstAPI.IrisWeb.dto.IrisRequest;
import com.firstAPI.IrisWeb.dto.IrisResponse;

@Service
public class IrisClassifierService {
	
	private final RestTemplate restTemplate;
	
	private static final String API_URL = "http://127.0.0.1:8000/predict"; 
	
	public IrisClassifierService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	/**
	 * Sends the flower data to the Python API and returns the prediction 
	 * 
	 * @param sepalLength The sepal's length
	 * @param sepalWidth The sepal's width
	 * @param petalLength The petal's length
	 * @param petalWidth The petal's width
	 * @return The Iris Species prediction
	 * **/
	
	public String predictSpecies(double sepalLength, double sepalWidth, double petalLength, double petalWidth) {
		// creates an IrisRequest object with the received data
		IrisRequest request = new IrisRequest(sepalLength, sepalWidth, petalLength, petalWidth);
		
		// Make a POST call to the API, sending the request object
		IrisResponse response = restTemplate.postForObject(API_URL, request, IrisResponse.class);
		
		// return the prediction which is inside the response
		return response != null ? response.getPrediction() : "Prediction unavailable";
	}
}