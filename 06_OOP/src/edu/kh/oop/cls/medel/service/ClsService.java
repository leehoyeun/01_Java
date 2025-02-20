package edu.kh.oop.cls.medel.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService /*{ extends Studnet*/{
	//부모로 Studnt 클래스 상속받음
	//ClsService(자식)<- Student(부모)

	public ClsService() {
		
	}
	
	public void ex1() {
		Student std = new Student();		
		//public class 인 student 는 import 가능 (어디서든 접근가능)
		
		//testVO test = new TestVo();
		//(default) class 인 testVO는 imput 불가능(다른패키지 사용불가능)
	
		//필드 접근제한자 확인하기
	System.out.println(std.v1);
	//System.out.println(std.v2);
	//System.out.println(std.v3);
	//System.out.println(std.v4);
	
	//상속 관계에서 집적 접근 가능 범위 테스트
	// * 상속받으면 부모의 것도 마치 내것처럼 사용 !
	//System.out.println( v1 );
	//System.out.println(v2);
	//Student 클래스를 ClsService 가 상속받았으므로
	//Student 의 protected 변수인 v2는 직접접근 가능!
	
	//System.out.println(v3);//default 다은패키지 x
	//System.out.println(v4);//해당클래스 내부가 아닌 다른 클래스
	}
	
	public void ex2() {
		// static 필드 확인 예저
		
		// 학생 개체 2개 생성하기
		
		Student std1 = new Student();
		Student std2 = new Student();
		System.out.println(std1.shchoolName);
		System.out.println(std2.shchoolName);
		// schoolName 에 노란줄이 뜨는 이유 (경고) =>제대로 작성을 안해서
		
		// *** staic 이 붙은 변수(필드)는 '클래스명,변무셩'으로 사용해야함
		System.out.println(Student.shchoolName);
	
		Student.shchoolName="정보교율원";
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		System.out.println(studnt.schoolName);
		
		/*
		 * static
		 * 
		 * 공유 메모리 영영(또는 정적 메모링 영역) 이라고함.
		 * 
		 * ->프로그램 시작 시 static이 붙은 코드들이 모두
		 * static 영역에 생성되고,
		 * 프로그램이 종료될 때까지 사라지지 않음(정적)
		 * 그리고 , Static 영역에 생성된 변수는 어디서든지 공유 가능(공유)
		 * 
		 * 
		 * */
	
	
	
	
	}
	public void ex3() {
		// 생성자 확인 테스트
		
		//User 기본 생성자를 이용해서u1 객체 생성
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
	
		User u2 = new User();
	
		//문제점 : u1이 참고하고 있는 user 객체와
		//u2가 참고하고 있는 User 객체의 필드값이 모두 동일함
		//왜? 같은 기본생성자로 User 객체를 생성했기 때문이다
	
		System.out.println("===============");
		
		//해결방법 1: setter 를 이용해서 새로운값 재대입
		
		u2.setUserId("asd1234");
		u2.setUserPw("1q2w3e");
		u2.setUserName("김영희");
		u2.setUserAge(25);
		u2.setUserGender('여');
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		//해결방법 2 : 매개변수 생성자를 이용해서
		//객체가 생성될 때 부터 다르값으로 필드를 초기화
		User u3 = new User("test3","passworld1234");
		//매개변수 생성자
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
		
		
	}
	public void ex4() {
		//매개변수 생성자 예제
		User u1 = new User();
		User u2 = new User("user02","pass02");
		User u3 = new User("user03","pass03","김길동",30,'남');
		//매개변수 5개짜리 생성자 (전부 초기화)
		
		System.out.printf("u1:%s/%s/%s/%d/%c\n",
				u1.getUserId(),u1.getUserPw(),u1.getUserName(),
				u1.getUserAge(),u1.getUserGender());

		System.out.printf("u2:%s/%s/%s/%d/%c\n",
				u2.getUserId(),u2.getUserPw(),u2.getUserName(),
				u2.getUserAge(),u2.getUserGender());
	
		System.out.printf("u1:%s/%s/%s/%d/%c\n",
				u3.getUserId(),u3.getUserPw(),u3.getUserName(),
				u3.getUserAge(),u3.getUserGender());
	
		System.out.println(u1);
		System.out.println(u1.toString());
		//u1.toString
	}
}
