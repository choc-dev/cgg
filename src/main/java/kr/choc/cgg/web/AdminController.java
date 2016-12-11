package kr.choc.cgg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.choc.cgg.model.CorrectAnswer;
import kr.choc.cgg.model.CorrectAnswerList;
import kr.choc.cgg.model.MockTest;
import kr.choc.cgg.model.rep.CorrectAnswerRepository;
import kr.choc.cgg.model.rep.MockTestRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	CorrectAnswerRepository correctAnswerrepository;

	@Autowired
	MockTestRepository mockTestRepository;
	
	@GetMapping("")
	public String adminMain() {
		return "/view/admin";
	}

	@PostMapping("/answer")
	public String answerInput(Integer grade, Integer year, Integer month, CorrectAnswerList answerList) {
		
		MockTest mockTest = mockTestRepository.findByGradeAndYearAndMonth(grade, year, month);
		if(mockTest == null) {
			mockTest = mockTestRepository.save(new MockTest(grade, year, month));
		}
		
		Integer[] numbers = answerList.getNumber();
		Integer[] answers = answerList.getAnswer();
		Integer[] scores = answerList.getScore();
		Integer[] domains = answerList.getDomain();
		String[] purposes = answerList.getPurpose();
		String[] explains = answerList.getExplain();
		
		for (Integer number : numbers) {
			CorrectAnswer correctAnswer = correctAnswerrepository.findByNumberAndMockTestId(number, mockTest.getId());
			if(correctAnswer == null) {
				correctAnswer = new CorrectAnswer(number, answers[number-1], scores[number-1], domains[number-1], purposes[number-1], explains[number-1], mockTest); 
			} else {
				correctAnswer.setAnswer(answers[number-1]);
				correctAnswer.setScore(scores[number-1]);
				correctAnswer.setDomain(domains[number-1]);
				correctAnswer.setPurpose(purposes[number-1]);
				correctAnswer.setExplain(explains[number-1]);
				correctAnswer.setMockTest(mockTest);
			}
			correctAnswerrepository.save(correctAnswer);
		}
		return "/view/admin";
	}
	
}
