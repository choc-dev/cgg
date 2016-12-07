package kr.choc.cgg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class TestInfo {
	
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
	
	@Column
	@JsonProperty
	private int day;
	
	@Column
	@JsonProperty
	private String host;
	
}
