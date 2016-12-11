package kr.choc.cgg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.choc.cgg.model.AnalysisResult;
import kr.choc.cgg.model.rep.AnalysisResultRepository;
import kr.choc.cgg.model.rep.MockTestRepository;

@Controller
public class AnalysisController {

	@Autowired
	AnalysisResultRepository arRepository;
	
	@Autowired
	MockTestRepository mockTestRepository;

	@GetMapping("/analysis")
	public String analysis(AnalysisResult result, Model model) {
		
		result.setAverage(50L);
		result.setRate(80);
		result.setScore(90);
		result.setScoreGrade(3);
		
		arRepository.save(result);
		model.addAttribute("result", result);
		
		return "/view/result";
	}
}
