package kr.choc.cgg.model.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kr.choc.cgg.model.CorrectAnswer;

public interface CorrectAnswerRepository extends JpaRepository<CorrectAnswer, Long>{
	CorrectAnswer findByNumberAndMockTestId(Integer number, Long MockTestId);
	
	@Query("select sum(c.score) as score from correct_answer c, mock_test m where m.year=:year and m.grade=:grade and m.month=:month and c.mock_test_id=m.id and c.number in (:faults)")
	CorrectAnswer findScore(@Param("year") Integer year, @Param("grade") Integer grade, @Param("year") Integer month, @Param("faults") List<Integer> faults); 

}
