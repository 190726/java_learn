package com.sk.jpa.started.ch02;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
//@Entity
public class Member{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String name;
	
	@Column(name = "create_date")
    private LocalDateTime createDate;
	
	//@Enumerated(EnumType.STRING)
	//@Enumerated(EnumType.ORDINAL)
	@Convert(converter = GradeConverter.class)
    private Grade grade;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Builder
	public Member(String name, LocalDateTime now, Grade grade) {
		this.name = name;
		this.createDate = now;
		this.grade = grade;
	}
}
