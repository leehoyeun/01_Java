package edu.kh.inheritance.model.dto;

//final 클래스 : 상속불가(누군가의 부모가 될 수 없다)
// -> 제공되는 클래스 그대로 사용해야하는 경우
// ex) String 클래스
	public /*final*/ class Employee extends Person {

	
	private String company;
	public Employee() {}
	
	//Person으로 붙처 상속받은 메서드 중
	//
	//@Override 어노테이션 : 해당 메서드가 오버라이딩 되었음을
	//컴파일러에게 알려주는 역할
	//->컴파일러에게 문법체크를 하도록 알린다
	//->부모에게 해당 메서드가 있는지 체크
	//->이름 , 매개변수 타입과 개수가 일치하는 여부 검사
	
	@Override
	public void move(String str, int num) {
	
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다");
	}
	
	@Override
	public void move(String str,int num) {
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다");
	}
	
	
	public Employee(String company) {
		super();
		this.company = company;
	}



	public String getCompany() {
		return company;
	}

	public Employee(String company) {
		super(name,age,nationality);
		this.company = company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"/"+company;
	}
	
	/*
	 * final 메서드 -> 오버라이딩 불가
	 * -메서드의 기능이 변하면 안되는 경우
	 * 
	 * */
	
	public final void onlyEmployee() {
		System.out.println("final 메서드입니다");
	}
}
