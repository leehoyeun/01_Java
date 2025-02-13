package edu.kh.op.practice;

import java.util.Scanner;

//기능 제공용 클래스
public class OperatorPractice {

	public void practice1() {
		/*
		 * 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		 * 인원 수와 사탕 개수를 키보드로 입력 받고
		 * 1인당 동일하게 나누가진 사탕 개수와 나눠주고
		 * 남은 사탕의 개수를 출력하세요.
		 * 
		 * [실행화면]
		 * 인원수 : 29
		 * 사탕 개수 :100
		 * 1인당 사탕 개수 :3
		 * 남는 사탕 개수 : 13
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수:");
		int input1=sc.nextInt();
		System.out.print("사탕 개수:");
		int input2=sc.nextInt();
		
		
		System.out.printf("1인당 사탕 개수:%d\n",input2/input1);
		//System.out.printf("%d-%d*%d\n",input2,3);
		System.out.printf("1인당 사탕개수:%d\n" , input2 % input1 );		
		
	
	}
}

	public void pratice3() {
		/*메소드 명 : public void practice3(){}
		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.

		[실행화면]
		국어 : 60
		영어 : 80
		수학 : 40
		합계 : 180
		평균 : 60.0
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("국어 : ");
		int eng = sc.nextInt();
		
		System.out.print("국어 : ");
		int math = sc.nextInt();
		
		int sum = kor +eng +math; 
		double avg = sum /3.0; //평균
		
		// 각 과목이 40점 이상이고 평균 60점 
		// 이상이여야 합격 그외불합격
		
		boolean result = (kor >= 40)(eng >= 40)(math >= 40)(avg >= 60);
	
	? 합격,불합격};
