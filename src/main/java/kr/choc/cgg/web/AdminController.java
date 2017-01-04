package kr.choc.cgg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.choc.cgg.model.CorrectAnswer;
import kr.choc.cgg.model.CorrectAnswerList;
import kr.choc.cgg.model.rep.CorrectAnswerRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	CorrectAnswerRepository correctAnswerrepository;

	@GetMapping("")
	public String adminMain() {
		return "/view/admin";
	}

	@PostMapping("/answer")
	public String answerInput(CorrectAnswerList answerList) {

		Integer year = answerList.getYear();
		Integer month = answerList.getMonth();
		Integer grade = answerList.getGrade();
		Integer[] numbers = answerList.getNumber();
		Integer[] answers = answerList.getAnswer();
		Integer[] scores = answerList.getScore();
		Integer[] domains = answerList.getDomain();
		String[] purposes = answerList.getPurpose();
		String[] explains = answerList.getExplain();

		for (Integer number : numbers) {
			CorrectAnswer correctAnswer = correctAnswerrepository
					.findByYearAndMonthAndGradeAndNumber(year, month, grade, number);
			if (correctAnswer == null) {
				correctAnswer = new CorrectAnswer(grade, year, month, number, answers[number - 1], scores[number - 1],
						domains[number - 1], purposes[number - 1], explains[number - 1]);
			} else {
				correctAnswer.setGrade(grade);
				correctAnswer.setYear(year);
				correctAnswer.setMonth(month);
				correctAnswer.setNumber(number);
				correctAnswer.setAnswer(answers[number - 1]);
				correctAnswer.setScore(scores[number - 1]);
				correctAnswer.setDomain(domains[number - 1]);
				correctAnswer.setPurpose(purposes[number - 1]);
				correctAnswer.setExplain(explains[number - 1]);
			}
			correctAnswerrepository.save(correctAnswer);
		}
		return "/view/admin";
	}

}
