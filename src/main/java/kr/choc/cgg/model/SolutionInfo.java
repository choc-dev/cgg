package kr.choc.cgg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class SolutionInfo {

	@Id
	@GeneratedValue
	@JsonProperty
	private Long id;

	@Column(nullable = false)
	@JsonProperty
	private Integer domain;

	@Column(nullable = false)
	@JsonProperty
	private Integer level;

	@Column(nullable = false)
	@JsonProperty
	private String description;

	@Column(nullable = false)
	@JsonProperty
	private String title;

	@Lob
	@Column(nullable = false)
	@JsonProperty
	private String solution;

	@Column(nullable = false)
	@JsonProperty
	private String style;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDomain() {
		return domain;
	}

	public void setDomain(Integer domain) {
		this.domain = domain;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
