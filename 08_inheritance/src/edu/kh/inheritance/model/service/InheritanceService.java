package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService extends Person {
	

	//상속 확인 예제
	public void ex2() {
		
		Student std = new Student("홍길동",17,"한국",1,3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClass());
	
		Employee emp = new Employee("김노동",30,"한국","정보교육원")
		System.out.println(emp.getName());
		System.out.println(emp.setAge(getAge()));
		System.out.println(emp.setNationality(getNationality()));
		
	}
	public void ex4() {
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move();//오버라이딩 X Person(부모)의 메서드 수행
		// 사람은 움직일수 있다.
		
		emp.move();// 오버라이딩 0 ->Employee 에서 재정의한 메서드 수행
		// 오버라이딩된 move()
		
		emp.move(getName(), getAge());
	}
	//toString(오버라이딩 예제)
	public void ex4() {
		Person p = new Person("김철수",17,"한국");
		
		System.out.println(p.toString());
		System.out.println(p);
		
		Employee emp = new Employee
		System.out.println(emp);
	}
	}
	}