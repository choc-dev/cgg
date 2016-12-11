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

	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_correctanswer_to_mocktest"))
	@JsonProperty
	private MockTest mockTest;

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

	public CorrectAnswer(Integer number, Integer answer, Integer score, Integer domain, String purpose, String explain, MockTest mockTest) {
		this.number = number;
		this.answer = answer;
		this.score = score;
		this.domain = domain;
		this.purpose = purpose;
		this.explain = explain;
		this.mockTest = mockTest;
	}

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

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public void setAnswer(Integer answer) {
		this.answer = answer;
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

	public MockTest getMockTest() {
		return mockTest;
	}

	public void setMockTest(MockTest mockTest) {
		this.mockTest = mockTest;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", number=" + number + ", answer=" + answer + ", domain=" + domain + ", purpose="
				+ purpose + "]";
	}

}
