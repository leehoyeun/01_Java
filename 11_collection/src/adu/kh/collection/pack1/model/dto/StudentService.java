package adu.kh.collection.pack1.model.dto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentService {

	// java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
	// *인터페이스 객체 생성 X,부모 참조변수 O

	// java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)

	// new ArrayList() : 기본생성자 -> 기본 크기 10짜리 리스트
	// 하지만 리스트의 크기는 늘었다 줄었다 하기 때문에 큰 의미 없음

	// 학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<>();// 검색 (조회) 효율적
	// private List<Student> studentList = new LinkedList<>();//추가 , 수정, 삭제 효율적
	// 다형성 중 업캐스팅 적용!
	// 부모타일(List)참조변수(StudentList) = 자식객체(ArrayList) 주소

	private Scanner sc = new Scanner(System.in);

	public StudentService() {
		studentList.add(new Student("홍길동", 23, "서울시 중구", 'M', 100));
		studentList.add(new Student("고영희", 23, "경기도 안산", 'M', 100));
		studentList.add(new Student("강아지", 30, "서울시 강남", 'F', 80));
		studentList.add(new Student("오미나", 27, "충북 청주", 'M', 90));
		studentList.add(new Student("박주희", 24, "전라도 순천", 'F', 70));
	}

	private List<Object> testList = new ArrayList<>();

	/*
	 * public void ex() {//List 테스트용 예제
	 * 
	 * 
	 * //List.add(Object e) : 리스트에 객체를 추가 //매개변수 타입이 Object == 모든 객체 매개변수로 전달할 수 있음
	 * 
	 * testList.add("문자열"); testList.add(new Student("홍길동",25,"서울시 중구",'M',90));
	 * testList.add(sc); testList.add(new Object());
	 * 
	 * //컬렉션 특징 : 여러 타입의 데이터를 저장할 수 있다
	 * 
	 * //
	 * 
	 * System.out.println(testList.get(0)); System.out.println(testList.get(1);
	 * System.out.println(testList.get(2)); System.out.println(testList.get(3));
	 * 
	 * // testList에 꺼내온 인덱스 요소가 Student 혹은 상속관계인지 검사 // 만약에 Student 라면 이름을 꺼내오고 싶다
	 * for(Object e : testList);{ System.out.println(((Student)e).getName()); } }
	 */
	/**
		 * 메뉴 출력용 메서드
		 * alt + shift + j : 메서드 설명용 주석
		 * 
		 * @author 이호연(dlghdus100@gmail.com)
		 */
		public void displayMenu() {
			
			int menuNum = 0;//메뉴 선택용 변수
			
			do {
				System.out.println("\n=====학생 관리 프로그램======");
				System.out.println("1.학생 정보 추가");
				System.out.println("2.학생 정보 전체 조회");
				System.out.println("3.학생 정보 수정");
				System.out.println("4.학생 정보 제거");
				System.out.println("5.이름으로 검색(일치)");
				System.out.println("6.이름으로 검색(포함)");
				System.out.println("7.나이순으로 정렬");//Comparable 사용
				System.out.println("8.이름으로 정렬");	//Comparator 사용
				System.out.println("0.프로그램 종료");
				
				System.out.print("메뉴 번호 선택 :");
						
				try {
					
					menuNum = sc.nextInt();
					sc.nextInt();
					
					switch(menuNum){
						case 1:System.out.println(addStudent());break; 
						case 2:selectAll(); break;
						case 3:System.out.println(updateStudent());break;
						case 4:removeStudent();break;
						case 5:/**/break;
						case 6:/**/break;
						case 7:/**/break;
						case 8:/**/break;
						case 0:System.out.println("프로그램 종료.."); break;
						default: System.out.println("메뉴에 작성된 번호만 입력하세요");
					}
				}catch(InputMismatchException e){
					System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요");

					sc.nextLine();
					menuNum=-1;// 첫 반복 시 잘못입력하는 경우
					//menuNum이 초기값인 0을 가지고 있어 반복문이 종료되는데,
					//이를 방지하기 위해서 임의값 -1 대입
				}
				
						
				
			}while(menuNum!=0);			
			
				
		
		
		}

	/**
	 * 1. 학생 정보 추가 메서드
	 * 
	 * @return 삽입 성공 시 "성공" , 실패 시 "실패" 문자열 반환
	 */
	public String addStudent() {
		// Checked Exception : 반드시 throws 구문이나 try-catch처리 강제
		// IOExcetion, SQLExeption...

		// Unchecked Exception : 강제처리 X, 예외 발생하면 자동으로
		// 상위 호출 메서드로 예외가 전파됨
		// InputMismatchException, NullpointerException,
		System.out.println("======학생 정보 추가======");

		System.out.println("이름:");
		String name = sc.next();

		System.out.println("나이 :");
		int age = sc.nextInt();
		sc.nextLine();// 입력버퍼 개행문자 제거

		System.out.println("사는곳 : ");
		String region = sc.nextLine();

		System.out.println("성별(M/F) :");
		char gender = sc.next().charAt(0);

		System.out.println("점수:");
		int score = sc.nextInt();

		// Student 새 객체 생성 후 studentList에 추가
		if (studentList.add(new Student(name, age, region, gender, score))) {

			return "성공";
		} else {
			return "실패";

		}

	}

	/**
			 *2. 학생 전체 조회 메서드
			 * 
			 * List가 비어있는 경우 "학생 정보가 없습니다"출력
			 * -있는 경우 전체 학생 출력
 
			 */
			public void selectAll() {
			System.out.println("=====학생 전체 조회=====");
			
			//studenList가 비어있는 지 확인
			//List에 저장된 데이터의 개수를 얻어오는 방법 : int List.size();
			
			//if(studentList.size() == 0){
			// boolean List.isEmpyt() : 컬렉션이 비어있다면 true 반환
			if(studentList.isEmpty()) {
				System.out.println("학생 정보가 없습니다");
				return; // 현재 메서드를 종료하고 호출한곳으로 돌아감.
			}
			
			// 일반 for 문
//			for(int i = 0;i<studentList.size();i++) {// -> length(x)
//				System.out.println(studentList.get(i));
//			}
			
			// 향상된 for 문(for each 문)
			// 컬렉션,배열의 모든 요소를 순차적으로 반복접근 할 수 있는 for문
			
			int index = 0;
			for(Student std : studentList) {
				System.out.print((index++) + "번 : ");
				System.out.println(std);
			}
			
			}

	/**
	 * 3. 학생 정보 수정 메서드
	 * 
	 * 학생 정보가 studentList에 하나라도 있는 검사, 없다면 "입력된 학생정보가 없습니다" 문자열 반환
	 * 
	 * 인데스 번호로 학생을 수정하려고하는데, 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할수 없습니다" 반환
	 * 
	 * -studentList 범위 내 인덱스번호인지 검사, 초과했다면 "범위를 넘선 값을 입력할수 없습니다" 반환
	 * 
	 * 수정할 때 1. index 번째에 저장된 학생 정보 수정 전 정보를 출력
	 * 
	 * 2.이름 , 나이 ,사는 곳 , 성별 ,점수 수정할 값 입력받기
	 * 
	 * 3.수정이 완료되었다면,"000의 정보가 변경되었습니다" 반환
	 * 
	 * @return
	 */
	public String updateStudent() {

		System.out.println("======학생 정보 수정=====");

		System.out.println("인덱스 번호 : ");
		int index = sc.nextInt();

		// 1) 학생 정보가 studentList에 하나라도 있는지 검사
		if (studentList.isEmpty()) {
			return "입력된 학생정보가 없습니다";

			// 2) 입력된 숫자가 0보다 작은지
		} else if (index < 0) {
			return "음수는 입력할수 없습니다";

			// 3) studentList 범위 내 인덱스번호인지 검사
		} else if (index >= studentList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다";
		} else {
			// 수정 코드 작성
			// 1.index 번째에 저장된 학생정보 출력
			System.out.println(index + "번째에 저장된 학생 정보");
			System.out.println(studentList.get(index));

			// 2.수정할 내용 입력받기

			System.out.println("이름:");
			String name = sc.next();

			System.out.println("나이 :");
			int age = sc.nextInt();
			sc.nextLine();// 입력버퍼 개행문자 제거

			System.out.println("사는곳 : ");
			String region = sc.nextLine();

			System.out.println("성별(M/F) :");
			char gender = sc.next().charAt(0);

			System.out.println("점수:");
			int score = sc.nextInt();

			// 입력받은 index번째에 수정할 학생정보를 세팅 -> 수정
			// index번째에 있던 기존 학생 정보가 반환되고, 그 객체를 temp에 저장
			Student temp = studentList.set(index, new Student(name, age, region, gender, score));

			return temp.getName() + "의 정보가 변경되었습니다.";

		}
	}

	/**
	 * 4. 학생 정보 제거 메서드
	 * 
	 * 수정과 같은 검사 후 삭제 시 "정말 삭제하시겠습니까 ? (Y/N) : Y를 입력했다면 해당 인덱스에 있는 객체 삭제 후 "000님의
	 * 정보가 제거되었습니다" 리턴 N을 입력했다면 "취소" 리턴
	 *
	 * @return
	 */
	public String removeStudent() {

		// Student List.remove(int index);
		// 리스트에서 index번째 요소를 제거
		// 이 때 제거된 요소가 반환됨.
		// *List 중간에 비어있는 인덱스가 없게 하기위해서
		// remove() 동작 시 뒤쪽 요소를 한칸씩 자동으로 당겨온다.

		System.out.println("=====학생 정보 제거=====");
		
		System.out.println("인덱스 번호 : ");
		int index = sc.nextInt();

		// 1) 학생 정보가 studentList에 하나라도 있는지 검사
		if (studentList.isEmpty()) return "입력된 학생정보가 없습니다";

			// 2) 입력된 숫자가 0보다 작은지
		if (index < 0) return "음수는 입력할수 없습니다";

			// 3) studentList 범위 내 인덱스번호인지 검사
		 if (index >= studentList.size())
			 return "범위를 넘어선 값을 입력할 수 없습니다";
		 
		 System.out.println("정말 삭제 하시겠습니까? (Y/N) :");
		 char ch = sc.next().toUpperCase().charAt(0);
		 // "y" -> "Y" -> 'Y'
		 
		 if(ch == 'Y') {
			 Student temp = studentList.remove(index);
			 return temp.getName()+"의 정보가 제거되었습니다";
		 }
		 return "취소";
		/* 
		 * 
		 * */
		
	}
}