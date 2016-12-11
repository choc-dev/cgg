package kr.choc.cgg.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class MockTest {

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
	
	@OneToMany(mappedBy="mockTest")
	@OrderBy("id ASC")
	private List<CorrectAnswer> correctAnswers;
	
	public MockTest() {
		super();
	}

	public MockTest(Integer grade, Integer year, Integer month) {
		super();
		this.grade = grade;
		this.year = year;
		this.month = month;
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
}
