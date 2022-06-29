package com.sk.jpa.started.ch04;

import java.util.Arrays;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import com.sk.jpa.started.JpaTemplate;

class BoardTest {
	
	@Test
	void test() {
		
		JpaTemplate.INSTANCE.persist((EntityManager em) ->{
			business(em);
			}
		);
	}
	
	void business(EntityManager em) {
		
//		BoardFile file = new BoardFile();
//		file.setFilename("file2.txt");
//		file.setFilepath("/path/2023");
//		
//		BoardFile file2 = new BoardFile();
//		file.setFilename("file3.txt");
//		file.setFilepath("/path/2024");
//		
//			
//		Board board = new Board();
//		board.setContent("content2");
//		board.setTitle("title2");
//		board.setBoardFiles(Arrays.asList(file, file2));
//		
//		em.persist(board);
		
		Board findBoard = em.find(Board.class, 1L);
		System.out.println(findBoard.getTitle());
		System.out.println(findBoard.getBoardFiles());
		
	}
}