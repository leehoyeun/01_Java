package edu.kh.inheritance.model.dto;


//상송방법 : 자식 extends 부모
public class Student extends Person {
	// Student 클래스에 Person 클래스 내용을 확장한다/연장한다
	//==Student 클래스에 Person 클래스의 필드,메서드를 추가하여 확장한다.
	
	//속성 (필드)
//	private String name;
//	private int age;
//	private String nationality;
	private int grade;
	private int classRoom;//반
	
	public Student(String name, int age, String nationality, int grade, int classRoom) {
		super(name,age,nationality);//Person의 매개변수생서자 의미
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
		this.grade = grade;
		this.classRoom = classRoom;
	}


	private String classRoom;


	public Student (String name,int age, String nationality,
						int grade , int classRoom) {
	super toString();
	//d
//	this.name = name;
//	this.age = age;
//	this.nationality = nationality;

	/*setName(name);
	setAge(age);
	setNationality(nationality);
	*/
	// 부모의 
	}
}
