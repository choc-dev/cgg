package kr.choc.cgg.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue
	@JsonProperty
	private Long id;

	@Column(nullable = false)
	@JsonProperty
	private Integer number;

	@Column(nullable = false)
	@JsonProperty
	private Integer answer;

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
	private String domain;

	@Column(nullable = false)
	@JsonProperty
	private String purpose;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", number=" + number + ", answer=" + answer + ", grade=" + grade + ", year=" + year
				+ ", month=" + month + ", domain=" + domain + ", purpose=" + purpose + "]";
	}
	
}
