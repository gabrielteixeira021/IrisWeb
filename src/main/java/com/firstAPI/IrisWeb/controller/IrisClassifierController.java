package com.firstAPI.IrisWeb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstAPI.IrisWeb.dto.IrisRequest;
import com.firstAPI.IrisWeb.service.IrisClassifierService;


@RestController
@RequestMapping("/api/v1/iris")
public class IrisClassifierController {
	
	private final IrisClassifierService irisClassifierService;
	
	// constructor
	public IrisClassifierController(IrisClassifierService irisClassifierService) {
		this.irisClassifierService = irisClassifierService;
	}
	
	// end-points
	@PostMapping("/predict")
	public String getPrediction(@RequestBody IrisRequest request) {
		
		String prediction = irisClassifierService.predictSpecies(request.getSepalLength(), request.getSepalWidth(), request.getPetalLength(), request.getPetalWidth());
		return prediction;
	}
	
}
