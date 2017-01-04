package kr.choc.cgg.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.choc.cgg.model.AnalysisResult;
import kr.choc.cgg.model.CorrectAnswer;
import kr.choc.cgg.model.DomainManager;
import kr.choc.cgg.model.rep.CorrectAnswerRepository;
import kr.choc.cgg.model.rep.SolutionInfoRepository;

@Controller
public class AnalysisController {

	@Autowired
	CorrectAnswerRepository caRepository;

	@Autowired
	SolutionInfoRepository siRepository;

	@GetMapping("/analysis")
	public String analysis(AnalysisResult result, Model model) {
		int oneTotal = 0;
		int oneScore = 0;
		int twoTotal = 0;
		int twoScore = 0;
		int threeTotal = 0;
		int threeScore = 0;
		int fourTotal = 0;
		int fourScore = 0;
		int fiveTotal = 0;
		int fiveScore = 0;

		List<Integer> number = new ArrayList<>();
		String fault = result.getFault();
		if (!"".equals(fault)) {
			String[] faultArr = fault.split(",");
			for (String string : faultArr) {
				number.add(Integer.parseInt(string));
			}
		}
		List<CorrectAnswer> caList = caRepository.findByYearAndMonthAndGrade(result.getYear(), result.getMonth(),
				result.getGrade());
		for (CorrectAnswer ca : caList) {
			switch (ca.getDomain()) {
			case 1:
				oneTotal += ca.getScore();
				if (!number.contains(ca.getNumber()))
					oneScore += ca.getScore();
				break;
			case 2:
				twoTotal += ca.getScore();
				if (!number.contains(ca.getNumber()))
					twoScore += ca.getScore();
				break;
			case 3:
				threeTotal += ca.getScore();
				if (!number.contains(ca.getNumber()))
					threeScore += ca.getScore();
				break;
			case 4:
				fourTotal += ca.getScore();
				if (!number.contains(ca.getNumber()))
					fourScore += ca.getScore();
				break;
			case 5:
				fiveTotal += ca.getScore();
				if (!number.contains(ca.getNumber()))
					fiveScore += ca.getScore();
				break;

			default:
				break;
			}
		}
		result.setScore(oneScore + twoScore + threeScore + fourScore + fiveScore);
		result.setOne(new DomainManager(oneTotal, oneScore, getRate(oneScore, oneTotal),
				siRepository.findByDomainAndLevel(1, getLevel(getRate(oneScore, oneTotal)))));
		result.setTwo(new DomainManager(twoTotal, twoScore, getRate(twoScore, twoTotal),
				siRepository.findByDomainAndLevel(2, getLevel(getRate(twoScore, twoTotal)))));
		result.setThree(new DomainManager(threeTotal, threeScore, getRate(threeScore, threeTotal),
				siRepository.findByDomainAndLevel(3, getLevel(getRate(threeScore, threeTotal)))));
		result.setFour(new DomainManager(fourTotal, fourScore, getRate(fourScore, fourTotal),
				siRepository.findByDomainAndLevel(4, getLevel(getRate(fourScore, fourTotal)))));
		result.setFive(new DomainManager(fiveTotal, fiveScore, getRate(fiveScore, fiveTotal),
				siRepository.findByDomainAndLevel(5, getLevel(getRate(fiveScore, fiveTotal)))));

		model.addAttribute("result", result);

		return "/view/result";
	}

	private Integer getRate(Integer score, Integer total) {
		return score * 100 / total;
	}

	private Integer getLevel(Integer rate) {
		if (rate == 100) {
			return 1;
		} else if (rate >= 72) {
			return 2;
		} else if (rate >= 50) {
			return 3;
		} else {
			return 4;
		}
	}
}
