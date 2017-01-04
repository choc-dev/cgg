package kr.choc.cgg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroController {

	@GetMapping("/intro.html")
	public String index(){
		return "intro";
	}
}
