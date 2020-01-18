package com.example.sapient.football;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.example.sapient.football.model.Standing;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class StandingsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void testStandings() throws Exception {
		MvcResult mvcResult = mockMvc.perform(
				get("/standings/leagueId/{leagueId}/teamId/{teamId}", 149, 2622).contentType("application/json"))
				.andExpect(status().isOk()).andReturn();

		String contentAsString = mvcResult.getResponse().getContentAsString();

		assertThat(contentAsString).isNotEmpty();
	}

}
