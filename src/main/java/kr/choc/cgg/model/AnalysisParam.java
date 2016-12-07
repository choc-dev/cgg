package kr.choc.cgg.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class AnalysisParam {

	@Id
	@GeneratedValue
	@JsonProperty
	private Long id;

	@Column(nullable = false)
	@JsonProperty
	private int grade;

	@Column(nullable = false)
	@JsonProperty
	private int year;

	@Column(nullable = false)
	@JsonProperty
	private int month;

	@Column(nullable = false)
	@JsonProperty
	private String fault;

	@JsonProperty
	private LocalDateTime createDate = LocalDateTime.now();

	public String getFormattedCreateDate() {
		if (createDate == null) {
			return "";
		}
		return createDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public String getFault() {
		return fault;
	}

	public void setFault(String fault) {
		this.fault = fault;
	}

	@Override
	public String toString() {
		return "AnalysisParam [id=" + id + ", grade=" + grade + ", year=" + year + ", createDate=" + createDate + "]";
	}
}
