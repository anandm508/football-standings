package com.example.sapient.football.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.sapient.football.model.Country;
import com.example.sapient.football.model.League;
import com.example.sapient.football.model.Standing;
import com.example.sapient.football.model.Team;
import com.example.sapient.football.service.FootBallService;

@RestController
public class FootBallController {

	@Autowired
	private FootBallService footBallService;

	@GetMapping(value = "/countries", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Country> getCountries() {
		return footBallService.getCountries();
	}

	@GetMapping(value = "/leagues/{countryId}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<League> getLeagues(@PathVariable int countryId) {
		return footBallService.getLeagues(countryId);
	}
	
	@GetMapping(value = "/teams/{leagueId}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Team> getTeams(@PathVariable int leagueId) {
		return footBallService.getTeams(leagueId);
	}

	@GetMapping(value = "/standings/leagueId/{leagueId}/teamId/{teamId}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Standing> getStandings(@PathVariable int leagueId, @PathVariable int teamId) {
		 final List<Standing> standings = footBallService.getStandings(leagueId).stream().filter((standing) -> teamId == standing.getTeamId())
				.collect(Collectors.toList());
		 return standings;
	}

}
