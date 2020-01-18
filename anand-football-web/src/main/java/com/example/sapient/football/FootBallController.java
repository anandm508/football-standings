package com.example.sapient.football;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FootBallController {

	@GetMapping("/")
	public String main(Model model) {
		return "standings"; // view
	}

}
