package kr.choc.cgg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class CorrectAnswer {

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
	private Integer number;

	@Column(nullable = false)
	@JsonProperty
	private Integer answer;

	@Column(nullable = false)
	@JsonProperty
	private Integer score;

	@Column(nullable = false)
	@JsonProperty
	private Integer domain;

	@Column(nullable = false)
	@JsonProperty
	private String purpose;

	@Column(nullable = false)
	@JsonProperty
	private String explain;

	public CorrectAnswer() {
		super();
	}

	public CorrectAnswer(Long id, Integer grade, Integer year, Integer month, Integer number, Integer answer,
			Integer score, Integer domain, String purpose, String explain) {
		super();
		this.id = id;
		this.grade = grade;
		this.year = year;
		this.month = month;
		this.number = number;
		this.answer = answer;
		this.score = score;
		this.domain = domain;
		this.purpose = purpose;
		this.explain = explain;
	}

	public CorrectAnswer(Integer grade, Integer year, Integer month, Integer number, Integer answer, Integer score,
			Integer domain, String purpose, String explain) {
		super();
		this.grade = grade;
		this.year = year;
		this.month = month;
		this.number = number;
		this.answer = answer;
		this.score = score;
		this.domain = domain;
		this.purpose = purpose;
		this.explain = explain;
	}

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

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getAnswer() {
		return answer;
	}

	public void setAnswer(Integer answer) {
		this.answer = answer;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getDomain() {
		return domain;
	}

	public void setDomain(Integer domain) {
		this.domain = domain;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

}
