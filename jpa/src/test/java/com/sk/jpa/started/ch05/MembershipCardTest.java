package com.sk.jpa.started.ch05;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import com.sk.jpa.started.JpaTemplate;

class MembershipCardTest {

	@Test
	void test() {
		
		JpaTemplate.INSTANCE.persist((EntityManager em) ->{
			business(em);
			}
		);
	}

	private void business(EntityManager em) {
		
		Member member = new Member();
		member.setName("sangkook");
		em.persist(member);
		
		MembershipCard msc = new MembershipCard("1001", member);
		
		em.persist(msc);
		
//		MembershipCard membershipCard = em.find(MembershipCard.class, 2L);
//		
//		System.out.println(membershipCard.getCardNumber());
//		
//		System.out.println(membershipCard.getMember());
	}

}
