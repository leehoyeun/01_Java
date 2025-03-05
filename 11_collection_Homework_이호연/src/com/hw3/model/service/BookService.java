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
		library.add(new Book("세이노의가르침","세이노",6480,"데이원",1111));
		library.add(new Book("문과남자의 과학공부","유시민",15750,"돌베개",2222));
		library.add(new Book("역행자","자청",17550,"웅진지식하우스",3333));
		library.add(new Book("꿀벌의예언","베르나르베르베르",15120,"열린책들",4444));
		library.add(new Book("도둑맞은집중력","요한하리",16920,"어크로스",5555));
	}

	//메서드
	
	public void displayMenu() {
		
		int menuNum = 0;
		try {
		
		do {
			System.out.println("===도서 목록 프로그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴를 입력하세요 : ");
			menuNum = sc.nextInt();
			
			
			switch(menuNum) {
			case 1 :/*도서등록*/ break;
			case 2 :/*도서조회*/ break;
			case 3 :/*도서수정*/ break;
			case 4 :/*도서삭제*/ break;
			case 5 :/*즐겨찾기 추가*/ break;
			case 6 :/*즐겨찾기 삭제*/ break;
			case 7 :/*즐겨찾기 조회*/ break;
			case 8 :/*추천도서 뽑기*/ break;
			case 0 :/*프로그램 종료*/ break;
			
			}
		} 
			while(menuNum !=0);
		
		}catch (Exception e) {
			e.printStackTrace();
		}	
			
	
	}
	
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
			
		}else {//list를 순회하면서 각 Book 객체를 출력
			for(Book temp : list) {
				System.out.println(temp);//Book.toString();
			}
		}
	}

	//도서 수정용 메서드
	public void editBook() {
		showBookList(library);//등록된 도서를 출력하기
		
		System.out.println("=====도서수정=====");
		
		int editMenu = 0;//수정 메뉴 선택용 변수
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum= sc.nextInt();
				
		for (Book temp : library) {
			if(temp.getBookNum()==bookNum) {
				//입력한 도서번호와 도서 목록의 도서 번호가 일치하는걸 찾았을때
			
			}
		
		}
	}
	
}

