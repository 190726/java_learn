package com.sk.jpa.started.ch05;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
//@Entity
@NoArgsConstructor
@Table(name = "MEMBERSHIP_CARD", 
	   uniqueConstraints = {@UniqueConstraint(name="MEMBERSHIP_CARD_UNIQUE", columnNames = { "CARD_NUMBER" })}
	   //indexes = @Index(name="unique_idx_card_number", columnList = "CARD_NUMBER", unique = true)
)
public class MembershipCard {

	@Id
	@GeneratedValue
    private Long id;
	
	@Column(name = "CARD_NUMBER", nullable = false)
	private String cardNumber;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="member_id")
	private Member member;
	
	public MembershipCard(String cardNumber, Member member) {
		this.cardNumber = cardNumber;
		this.member = member;
	}
}
