package adu.kh.generics;

public class Run {
	public static void main(String[] args) {
		
		//String 타입으로 Box 객체 생성
		Box<String> StringBox = new Box<String>();
		// T가 String 대체됨
		// ->필드도 String 타입,
		//getter/setter 에서 사용되는 타입도 String
		
		StringBox.setItem("안녕 제네릭?");
		System.out.println( StringBox.getItem());
	
		Box<Integer> intBox = new Box<>();
		// Java 7 버전 이상에서는 우변타입 생략가능 
		// 다이아 몬드 연산자 : 컴파일러가 좌변(Box<Integer> intBox)
		//				을 보고 우변타입을 추론하는것
		intBox.setItem(123);
		System.out.println(intBox.getItem());
		
		//제네릭은 객체(Reference Type)만 허용
		// -> 재네릭은 기본자료형(primitive type)인 int , double ,char 같은
		//  타입은 사용할수 없다
		// -> 대신 Wrapper 클래스를 사용
		/*
		 * byte     Byte
		 * short    Short
		 * int      Integer
		 * long     Long
		 * float    Float
		 * double   Double
		 * char     Character
		 * boolean  Boolean
		 * 
		 * */
		int num = 10;
		Integer num1 = num; //오토박싱(Auto-boxing)
							//기본형 -> 래퍼클래스 자동변환
		
		int num2 = num1;	// 오토언박싱(Auto-unBoxing)
							// 래퍼클래스 -> 기본형 자동변환
		
		int number = Integer.parseInt("100");
		//문자열을 정수값으로 변환해주는것
	}
}
