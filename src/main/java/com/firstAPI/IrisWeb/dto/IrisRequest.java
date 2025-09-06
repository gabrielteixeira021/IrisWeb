package com.firstAPI.IrisWeb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IrisRequest {
	
	// Data attributes with JsonProperty from Jackson
	@JsonProperty("sepal_length")
	private double sepalLength;
	
	@JsonProperty("sepal_width")
	private double sepalWidth;
	
	@JsonProperty("petal_length")
	private double petalLength;
	
	@JsonProperty("petal_width")
	private double petalWidth;
	
	// Constructor
	public IrisRequest() {} // default constructor
	
	public IrisRequest(double sepalLength, double sepalWidth, double petalLength, double petalWidth) {
		this.sepalLength = sepalLength;
		this.sepalWidth = sepalWidth;
		this.petalLength = petalLength;
		this.petalWidth = petalWidth;
	}
	
	// Getters 'n Setters
	public double getPetalLength() {
		return petalLength;
	}
	public double getSepalLength() {
		return sepalLength;
	}
	public double getPetalWidth() {
		return petalWidth;
	}
	public double getSepalWidth() {
		return sepalWidth;
	}
	
	public void setSepalLength(double sepalLength) {
		this.sepalLength = sepalLength;
	}
	public void setPetalLength(double petalLength) {
		this.petalLength = petalLength;
	}
	public void setSepalWidth(double sepalWidth) {
		this.sepalWidth = sepalWidth;
	}
	public void setPetalWidth(double petalWidth) {
		this.petalWidth = petalWidth;
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
