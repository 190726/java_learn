package com.sk.jpa.started.ch03;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
	
	private String address1;
	private String address2;
	private String zipcode;
	
}
