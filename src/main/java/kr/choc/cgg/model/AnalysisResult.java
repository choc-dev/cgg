package kr.choc.cgg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnalysisResult {

	private Integer grade;

	private Integer year;

	private Integer month;

	private String fault;

	private Integer score;

	private DomainManager one;

	private DomainManager two;

	private DomainManager three;

	private DomainManager four;

	private DomainManager five;

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

	public DomainManager getOne() {
		return one;
	}

	public void setOne(DomainManager one) {
		this.one = one;
	}

	public DomainManager getTwo() {
		return two;
	}

	public void setTwo(DomainManager two) {
		this.two = two;
	}

	public DomainManager getThree() {
		return three;
	}

	public void setThree(DomainManager three) {
		this.three = three;
	}

	public DomainManager getFour() {
		return four;
	}

	public void setFour(DomainManager four) {
		this.four = four;
	}

	public DomainManager getFive() {
		return five;
	}

	public void setFive(DomainManager five) {
		this.five = five;
	}

	@Override
	public String toString() {
		return "AnalysisParam [grade=" + grade + ", year=" + year + ", month=" + month + ", fault="
				+ fault + "]";
	}

}
