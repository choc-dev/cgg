package kr.choc.cgg.model.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.choc.cgg.model.CorrectAnswer;

public interface CorrectAnswerRepository extends JpaRepository<CorrectAnswer, Long>{
	CorrectAnswer findByYearAndMonthAndGradeAndNumber(Integer year, Integer month, Integer grade, Integer number);
	List<CorrectAnswer> findByYearAndMonthAndGrade(Integer year, Integer month, Integer grade);
	List<CorrectAnswer> findByYearAndMonthAndGradeAndNumberIn(Integer year, Integer month, Integer grade, List<Integer> number);
}
