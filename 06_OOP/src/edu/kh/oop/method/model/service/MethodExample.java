package edu.kh.oop.method.model.service;

public class MethodExample {

	// 메서드가 호출될때마다 stack에 메서드를 실행한 이력이 쌓인다.
	// -> 메서드를 호출한 순서대로 쌓임.
	
	//main -> method1 -> method2
	//그리고 제일 마지막에 쌓인 순서대로 스택에서 나감
	//->LIFO (Last - Input - First -Out)
	//: 마지막에 들어온게 첫번째로 나간다 ==후입선출
	// method2 -> method1 -> main
	
	
	public void method1() {
		int result = method2(3,5); // method2()함수 호출
		System.out.println(result);
	}
	
	public int method2(int a ,int b) {
		int sum = a+b;
		return sum;
	}
}
