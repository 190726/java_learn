package com.sk.jpa.started.ch01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;

@Getter
//@Entity(name = "T_MEMBER")
@SequenceGenerator(name="MEMBER_SEQ_GEN",sequenceName = "SEQ_T_MEMBER",initialValue = 1)
public class Member{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="MEMBER_SEQ_GEN")
    private Long id;
	
	private String name;

	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
