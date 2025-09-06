package com.firstAPI.IrisWeb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IrisResponse {

	@JsonProperty("prediction")
	private String prediction;
	
	public IrisResponse() {}
	
	public IrisResponse(String prediction) { this.prediction = prediction; }
	
	public String getPrediction() {
		return prediction;
	}
	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}