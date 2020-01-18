package com.example.sapient.football.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) 
public class Standing {
	
	@JsonProperty("country_name")
	private String countryName;
	
	@JsonProperty("league_id")
	private int leagueId;
	
	@JsonProperty("league_name")
	private String leagueName;
	
	@JsonProperty("team_id")
	private int teamId;
	
	@JsonProperty("team_name")
	private String teamName;
	
	@JsonProperty("overall_league_position")
	private int overAllLeaguePosition;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getOverAllLeaguePosition() {
		return overAllLeaguePosition;
	}

	public void setOverAllLeaguePosition(int overAllLeaguePosition) {
		this.overAllLeaguePosition = overAllLeaguePosition;
	}
	
	

}
