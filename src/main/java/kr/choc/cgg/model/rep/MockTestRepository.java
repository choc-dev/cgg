package kr.choc.cgg.model.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import kr.choc.cgg.model.MockTest;

public interface MockTestRepository extends JpaRepository<MockTest, Long> {
	MockTest findByGradeAndYearAndMonth(Integer grade, Integer year, Integer month);
}
