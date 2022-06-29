package com.sk.jpa.started;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import sun.util.logging.resources.logging;

public enum JpaTemplate {
	
	INSTANCE;
	
	public void persist(BusinessCallback callback) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sk_jpa_h2");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			
			callback.progress(em);
			
			System.out.println("=========before commit===============");
			tx.commit();
			System.out.println("=========after commit===============");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("==================================================");
			tx.rollback();
		}finally {
			em.close();
		}
		emf.close();
	}
	
	public void persistH2(BusinessCallback callback) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sk_jpa_h2");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			
			callback.progress(em);
			
			System.out.println("=========before commit===============");
			tx.commit();
			System.out.println("=========after commit===============");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("==================================================");
			tx.rollback();
		}finally {
			em.close();
		}
		emf.close();
	}

}
