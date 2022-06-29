package com.sk.jpa.started.ch01;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import com.sk.jpa.started.BusinessCallback;
import com.sk.jpa.started.JpaTemplate;

class MemberTest {

	@Test
	void test() {
		
		JpaTemplate.INSTANCE.persist(new BusinessCallback() {
			
			@Override
			public void progress(EntityManager entityManager) {
				Member member = new Member();
				//m.setId(1L);
				member.setName("sk");
				System.out.println("=========before persist===============");
				entityManager.persist(member);
				System.out.println("=========after persist===============");
			}
		});
		
	}
}
