package kr.choc.cgg.model;

import java.util.Arrays;

public class CorrectAnswerList {

	private Integer[] number;

	private Integer[] answer;

	private Integer[] score;

	private Integer[] domain;

	private String[] purpose;

	private String[] explain;

	public Integer[] getNumber() {
		return number;
	}

	public void setNumber(Integer[] number) {
		this.number = number;
	}

	public Integer[] getAnswer() {
		return answer;
	}

	public void setAnswer(Integer[] answer) {
		this.answer = answer;
	}

	public Integer[] getScore() {
		return score;
	}

	public void setScore(Integer[] score) {
		this.score = score;
	}

	public Integer[] getDomain() {
		return domain;
	}

	public void setDomain(Integer[] domain) {
		this.domain = domain;
	}

	public String[] getPurpose() {
		return purpose;
	}

	public void setPurpose(String[] purpose) {
		this.purpose = purpose;
	}

	public String[] getExplain() {
		return explain;
	}

	public void setExplain(String[] explain) {
		this.explain = explain;
	}

	@Override
	public String toString() {
		return "AnswerList [number=" + Arrays.toString(number) + ", answer=" + Arrays.toString(answer) + ", domain="
				+ Arrays.toString(domain) + ", purpose=" + Arrays.toString(purpose) + ", explain="
				+ Arrays.toString(explain) + "]";
	}
}
