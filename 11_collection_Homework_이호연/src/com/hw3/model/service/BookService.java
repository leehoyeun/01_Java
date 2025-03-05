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
	private List<Book> favlist = new ArrayList<Book>();


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

			menuNum=sc.nextInt();
		
			switch(menuNum) {
			case 1:System.out.println(addBook());break;
			case 2:showBookList(library);break;
			case 3:System.out.println(editBook());break;
			case 4:System.out.println(deletBook());break;
//			case 5:addFavorite();break;
//			case 6:deleteFavorite();break;
			case 7:showBookList(favlist);break;
			case 8:randomBook();break;
			case 0:System.out.println("종료되었습니다.");break;
			default:System.out.println("메뉴에 있는 번호만 입력하세요!");break;
			}
		}while(menuNum != 0);
		}catch (Exception e) {
			//Exception : 예외 클래스의 최상위 클래스
			System.out.println("예외 발생");
			e.printStackTrace();//예외추격
		}
	
	
	}
	
	//도서등록메서드
	
	public String addBook() {
		System.out.println("=====도서등록=====");
		
		System.out.print("도서번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		System.out.print("도서제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서저자 : ");
		String writer = sc.nextLine();
		
		System.out.print("도서가격 : ");
		int prize = sc.nextInt();
		sc.nextLine();
		System.out.print("도서출판사 : ");
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
	
	public String editBook() {
		showBookList(library);
		System.out.println("=====도서 수정=====");
		int editmenu = 0;
		
		System.out.println("수정할 도서 번호를 입력하세요 :");
		int bookNum = sc.nextInt();
		boolean flag = true;
		
		for (Book temp : library) {
			if(temp.getBookNum()==bookNum) {
				flag = false;
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정종료");
				
				System.out.print("어떤 정보를 수정하시겠습니까?");
				editmenu=sc.nextInt();
				sc.nextLine();
				
				switch(editmenu) {
				case 1 : System.out.println("===도서명 수정 ===");
				System.out.print("수정할 도서명을 입력하세요");
				String title = sc.nextLine();
				temp.setTitle(title);
				break;
				
				case 2 : System.out.println("===도서 저자 수정===");
						System.out.print("수정할 저자명을 입력하세요 :");
						String writer = sc.nextLine();
						temp.setWriter(writer);
						break;
						
				case 3 : System.out.println("===도서 가격 수정 ===");
						System.out.print("수정할 가격을 입력하세요 :");
						int price = sc.nextInt();
						temp.setPrice(price);
						break;
				case 4 : 
					System.out.println("===도서 출판사 수정===");
					System.out.print("수정할 출판사를 입력하세요 :");
					String publisher = sc.nextLine();
					temp.setPublisher(publisher);
					break;
					
				case 0 : System.out.println("종료합니다...");break;
				default:System.out.println("메뉴에 있는 번호만 선택하세요");break;
				
				
				
				
				}
				
			}
		}
		if(flag) {
			return "일치하는 도서 번호가 없습니다.";
		}return "수정 완료";
	}


	public String deletBook() {
		
		System.out.println("====도서삭제=====");
		showBookList(library);
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt();
		
		for(Book temp: library) {
			if(temp.getBookNum()==deleteNum) {
				int index= library.indexOf(temp);
				System.out.println("index 번호 : "+index);
				char answer = sc.next().toUpperCase().charAt(0);
				if(answer == 'Y') {
					library.remove(index);
					break;
					
				}
						
			}else {
				return "삭제를 진행하지 않습니다";
			}
		}
		return "삭제끝";
	}
	
	
	public void randomBook() {
		int max = library.size();
		int random = (int)Math.random()*max;
		System.out.println(library.get(random).getTitle());
	}
}

