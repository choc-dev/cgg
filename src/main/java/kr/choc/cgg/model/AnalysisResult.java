package kr.choc.cgg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class AnalysisResult {

	@Id
	@GeneratedValue
	@JsonProperty
	private Long id;

	@Column(nullable = false)
	@JsonProperty
	private Integer grade;

	@Column(nullable = false)
	@JsonProperty
	private Integer year;

	@Column(nullable = false)
	@JsonProperty
	private Integer month;

	@Column(nullable = false)
	@JsonProperty
	private String fault;

	@Column(nullable = false)
	@JsonProperty
	private Integer score;

	@Column(nullable = false)
	@JsonProperty
	private Integer scoreGrade;

	@Column(nullable = false)
	@JsonProperty
	private Integer rate;

	@Column(nullable = false)
	@JsonProperty
	private Long average;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getFault() {
		return fault;
	}

	public void setFault(String fault) {
		this.fault = fault;
	}
	
	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}
	
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getScoreGrade() {
		return scoreGrade;
	}

	public void setScoreGrade(Integer scoreGrade) {
		this.scoreGrade = scoreGrade;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Long getAverage() {
		return average;
	}

	public void setAverage(Long average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "AnalysisParam [id=" + id + ", grade=" + grade + ", year=" + year + ", month="
				+ month + ", fault=" + fault + "]";
	}
	
}
