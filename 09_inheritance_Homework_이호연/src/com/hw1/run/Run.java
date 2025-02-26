package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {
	public static void main(String[] args) {
		
		Book books[]  = new Book[3];
		books[0] = new Novel("해리포터","JK 롤링","판타지");
		books[1] = new Textbook("자바프로그래밍","james Gosling","컴퓨터과학");
		books[2] = new Poetry("우리들의 사랑시", "김소월" , 30 );
		
		

		for (Book book:books) {
			book.displayInfo();
			System.out.println();
		}
		
		
		
		
		
}
}