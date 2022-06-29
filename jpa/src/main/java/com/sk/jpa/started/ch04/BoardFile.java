package com.sk.jpa.started.ch04;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Embeddable
@Access(AccessType.FIELD)
public class BoardFile {
	
	@Column(table="BOARD_FILE")
	private String filepath;
	
	@Column(table="BOARD_FILE")
	private String filename;

}
