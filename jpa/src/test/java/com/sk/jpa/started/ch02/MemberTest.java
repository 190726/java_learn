package com.sk.jpa.started.ch02;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import com.sk.jpa.started.BusinessCallback;
import com.sk.jpa.started.JpaTemplate;

public class MemberTest {
	
	@Test
	void test() {
		
		JpaTemplate.INSTANCE.persist(new BusinessCallback() {
			
			@Override
			public void progress(EntityManager entityManager) {
				
				Member member = Member.builder().name("sangkook").now(LocalDateTime.now()).grade(Grade.S3).build();
				System.out.println("=========before persist===============");
				entityManager.persist(member);
				System.out.println("=========after persist===============");
				
			}
		});
		
		JpaTemplate.INSTANCE.persist(new BusinessCallback() {
			
			@Override
			public void progress(EntityManager entityManager) {
				
				Member member = entityManager.find(Member.class, 1L);
				System.out.println("=========before persist===============");
				System.out.println(member.toString());
				System.out.println("=========after persist===============");
				
			}
		});
		

	}

}
