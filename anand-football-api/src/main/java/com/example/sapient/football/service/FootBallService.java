package com.example.sapient.football.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.sapient.football.model.Country;
import com.example.sapient.football.model.League;
import com.example.sapient.football.model.Standing;
import com.example.sapient.football.model.Team;

@FeignClient("football-servcie")
public interface FootBallService {
	
	@GetMapping(value="/?action=get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Country> getCountries();

	@GetMapping(value="/?action=get_leagues&country_id= {countryId}&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", produces = MediaType.APPLICATION_JSON_VALUE)
	List<League> getLeagues(@PathVariable int countryId);
	
	@GetMapping(value="/?action=get_teams&league_id= {leagueId}&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Team> getTeams(@PathVariable int leagueId);
	
	@GetMapping(value="/?action=get_standings&league_id={leagueId}&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Standing> getStandings(@PathVariable int leagueId);

}
