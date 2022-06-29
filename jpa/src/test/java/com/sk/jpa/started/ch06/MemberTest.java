package com.sk.jpa.started.ch06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import com.sk.jpa.started.JpaTemplate;

class MemberTest {

	@Test
	void test() {
		
		JpaTemplate.INSTANCE.persist((EntityManager em) ->{
			business(em);
			}
		);
	}

	private void business(EntityManager em) {
		
//		Team team = new Team();
//		team.setName("인사팀");
//		em.persist(team);
//		
//		Member member1 = new Member();
//		member1.setName("문유진");
//		member1.changeTeam(team);
//		em.persist(member1);
//		
//		Member member2 = new Member();
//		member2.setName("이상국");
//		member2.changeTeam(team);
//		em.persist(member2);
		
//		team.getMember().add(member1);
//		team.getMember().add(member2); //객체지향적 설계
		
//		em.flush();
//		em.clear();
		
		//System.out.println("member1.getId()::" + member1.getId());
		
		Member findMember = em.find(Member.class, 2L);
		
		//List<Member> members = findMember.getTeam().getMember();
		
		//for(Member m : members) System.out.println(m.getName());
		//em.find(Team.class, 1L);
	}

}