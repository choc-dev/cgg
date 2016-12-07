package kr.choc.cgg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.choc.cgg.model.AnalysisParam;
import kr.choc.cgg.model.AnalysisParamRepository;

@Controller
public class AnalysisController {

	@Autowired
	AnalysisParamRepository apRepository;

	@GetMapping("/analysis")
	public String analysis(AnalysisParam param, Model model) {
		
		System.out.println(param.getFault());
		apRepository.save(param);
		model.addAttribute("param", param);
		
		return "/view/result";
	}
}
