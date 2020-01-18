package com.example.sapient.football.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

	@JsonProperty("country_id")
	private int countryId;
	
	@JsonProperty("country_name")
	private String countryName;
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
}
