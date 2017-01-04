package kr.choc.cgg.model;

public class DomainManager {

	private Integer total;
	private Integer score;
	private Integer rate;
	private SolutionInfo info;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public SolutionInfo getInfo() {
		return info;
	}

	public void setInfo(SolutionInfo info) {
		this.info = info;
	}

	public DomainManager(Integer total, Integer score, Integer rate, SolutionInfo info) {
		super();
		this.total = total;
		this.score = score;
		this.rate = rate;
		this.info = info;
	}

}