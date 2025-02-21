package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;
import edu.kh.oop.method.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {
		
		MethodExample method =new MethodExample();
		//method.method1();
	
		
		MemberService servic = new MemberService();
		servic.displayMenu();
		//method2()메서드 호출
		//method1()메서드 실행
		//main 메서드 실행
	}
}
