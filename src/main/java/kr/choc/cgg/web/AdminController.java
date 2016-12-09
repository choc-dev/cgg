package kr.choc.cgg.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.choc.cgg.model.Answer;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("")
	public String adminMain() {
		return "/view/admin";
	}

	@PostMapping("/answer")
	public String answerInput(Answer[] answer) {
		
		System.out.println(answer);
		
		return "/view/admin";
	}
	
}
