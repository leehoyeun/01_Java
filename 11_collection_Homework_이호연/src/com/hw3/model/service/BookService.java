package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	//필드
	private Scanner sc = new Scanner(System.in);
	
	// 도서를 저장할 목록 List
	private List<Book> library = new ArrayList<Book>();
	//부모타입 참조변수 = 자식객체의 주소 (다형성 중 업캐스팅)
	
	
	//즐겨찾기 도서를 저장할 목록 List
	private List<Book> fablist = new ArrayList<Book>();


	public BookService() {
		library.add(new Book("세이노의가르침","세이노",6480,"데이원"));
		library.add(new Book("문과남자의 과학공부","유시민",15750,"돌베개"));
		library.add(new Book("역행자","자청",17550,"웅진지식하우스"));
		library.add(new Book("꿀벌의예언","베르나르베르베르",15120,"열린책들"));
		library.add(new Book("도둑맞은집중력","요한하리",16920,"어크로스"));
	}

	//메서드
	
	
	
	//도서등록메서드
	
	public String addBook() {
		System.out.println("=====도서등록=====");
		
		System.out.println("도서번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		System.out.println("도서제목 : ");
		String title = sc.nextLine();
		
		System.out.println("도서저자 : ");
		String writer = sc.nextLine();
		
		System.out.println("도서가격 : ");
		int prize = sc.nextInt();
		sc.nextLine();
		System.out.println("도서출판사 : ");
		String publisher = sc.nextLine();
		
		Book newbook = new Book(title,writer,prize,publisher,bookNum);
		
		library.add(newbook);
		return"등록완료";
		
		
	}
	
	
	//도서 목록 조회용 메서드
	public void showBookList(List<Book> list) {
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요!");
			
		}else {
			for(Book temp : list) {
				System.out.println(temp);
			}
		}
	}

}

