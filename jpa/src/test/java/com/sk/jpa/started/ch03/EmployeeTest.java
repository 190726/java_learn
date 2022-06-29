package com.sk.jpa.started.ch03;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import com.sk.jpa.started.JpaTemplate;

class EmployeeTest {

	@Test
	void test() {
		JpaTemplate.INSTANCE.persist((EntityManager em) ->{
			
			Address homeAddress = new Address("kyungkido", "namyan", "1001");
			Address workAddress = new Address("kyungkido2", "namyan2", "1002");
			Employee employee = new Employee();
			employee.setHomeAddress(homeAddress);
			employee.setWorkAddress(workAddress);
			
			em.persist(employee);
			
			Employee findEmployee = em.find(Employee.class, employee.getId());
			System.out.println(findEmployee);
			}
		);
	}

}
