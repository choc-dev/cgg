package kr.choc.cgg.model.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.choc.cgg.model.SolutionInfo;

public interface SolutionInfoRepository extends JpaRepository<SolutionInfo, Long>{
	SolutionInfo findByDomainAndLevel(Integer domain, Integer level);
}
