package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public void practice1() {

		
		
		 /* 
		  * 문제1) 
	마트에서 고객에게 할인 혜택을 제공하려고 한다
	물건의 총 가격과 회원 여부를 입력받아, 
	회원이라면 10% 할인을 적용하고, 그렇지 
	않다면 5% 할인을 적용한 최종 가격을 출력해라

	메서드 : public void practice1() {}

	[실행화면]
	가격을 입력 하세요 : 10000
	멤버십 있으세요? (있으면 true / 없으면 false 
	입력) : true 할인을 포함한 최종금액 : 9000.0원


	가격을 입력 하세요 : 10000
	멤버십 있으세요? (있으면 true / 없으면 
	false 입력) : 
	false 할인을 포함한 최종금액 : 9500.0원

		 * */
		
	Scanner sc = new Scanner(System.in);
	System.out.print("가격을 입력하세요");
	int totalPrice = sc.nextInt();
	
	System.out.print("멤버십 있으세요 ? (있으면 true / 없으면 false입력) : ");
	boolean isMember = sc.nextBoolean();
	
	double discount = isMember ? totalPrice * 0.10 : totalPrice * 0.05;
	
	
	}

	
	public void practice2() {

		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("출금할 금액 입력:");
	int amount = sc.nextInt();
	
	int fiftyTh = amount / 50000; //5 만원짜리 지폐 개수
	
	//amount = amount % 50000;//5만원짜리 지폐 거르고 난뒤 나머지 금액 // 나머지 값을 amount 변수에 재대입해야 아래 다음 지폐에서 재사용할수 있음.
	
	amount %= 50000;//복합대입연산자 ( %와 대=을 합쳐 사용)
	
	/*
	 * += -= *= /=
	 * amount= amount - 50000;
	 * amoount -=50000;
	 * */
	
	int tenTh = amount / 10000; //1만원짜리 지폐 갯수
	
	int fiveTh = amount / 5000 //5천원짜리 지폐 갯수
	amount %= 5000;
	
	int oneTh = amount/1000; //1천원짜리 지폐 갯수
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		//첫번째 수가 두번째 수의 배수인지
		//첫번째 수가 두번째 수로 나누어 떨어진다는 뜻
		// 첫번째를 두번째로 나우었을때 나머지가 0이다
		
		
		
		
	}

}