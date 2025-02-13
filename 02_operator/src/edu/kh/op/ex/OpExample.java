package edu.kh.op.ex;

import java.util.Scanner;

//예제 코드 작성용 클래스 (기능용/메서드용)
public class OpExample {
	
	public void ex1() {
		
	//증감(증가와감소) 연산자 : ++ , --
	// 1을 더하거나 감소시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		System.out.println("iNum1 : "+iNum1);
		System.out.println("iNum2 : "+iNum2);
		
	//전위 연산
		int temp1 = 5;
		
		System.out.println(++temp1+5);//11
		//             			6+5 -> 11
	//후위 연산
		int temp2 = 3;
		System.out.println(temp2--+2);
		//					3+2 -> 5
		//					3-- -> 2
		System.out.println(temp2);
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		System.out.printf("%d/%d%d\n",a,b,c);//4,4,7
		//					3++ + --5
		//                  3++ +   4(b)
		//       			c=7
		//					3++4
	
	}
		
	
	public void ex2() {
		
		//비교 연산자 : > , < , >= , <= , == , !=
		//비교 연산자의 결과는 항상 논리값(true/false)
		
		int a = 10;
		int b = 20;
		
		System.out.println((a==b)==false);
		//					false==false
		//					true
		
		
		int c= 4;
		int d= 5;
		System.out.println((++c != d)==(--c!=d));
		//              ++4(5)!= 5  =  --5(4) != 5
		//                   false   =  true
		//                       false

	System.out.println(100>99);
	System.out.println(100>= 100);
	System.out.println(100<= 102);
	System.out.println(42 < 100);
	
	// >= <= 같은 경우 =가 무조건 오른쪽으로 나오게 한다
	
	
	
	}
	
	public void ex3() {

		//논리연산자 : &&(AND)그리고, || (OR)또는 
		
		// && (AND) : 둘다 ture 면 true , 나머지 false
		//와,그리고,~면서,~부터,까지,~사이
		
		int a = 101;
		//a는 100이상 이면서 짝수인가?
		System.out.println((a>=100) &&(a % 2== 0));
		
		int b = 5;
		//b는 1 부터 10까지 숫자 범위에 포함되어 있는가?
		
		System.out.println((b>=1)&&(b<=10));
		
		// ||(OR) : 둘 다 false 면 false, 나머지 true
		// 또는 ,혹은 , ~거나
		
		int c = 10;
		// c는 10을 초과하거나 짝수인가?
				
		System.out.println((c > 10)||(c % 2==0));
		
		
		
	}
	
	public void ex4() {
		//삼항 연산자 : 조건식 ? ture 일때 수행될값 : false 일때 수횔될값
		// *조건식 : 연산결과가 true/flase 인 식
		
		int num = 30;
		
		//num 이 30보다 크면(초과)"num은 30보다 큰 수이다"
		// 아니면 "num은 30 이하의 수이다" 출력
		
		String result = num > 30 ? "num은 30보다 큰 수이다" : "num은 30 이하의 수이다";
		
		System.out.println(result);
		
		//------------------------------------
		// 입력받은 정수가 음수인지 양수인지 구분
		// 단,0은 양수로 처리
		
		//Scanner 생성
		
		//ex>
		//정수 입력 : 4
		//양수입니다.
		//-------------
		
		//정수 입력 : -5
		// 음수입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int input = sc.nextInt();

		String result2 = input >= 0 ? "양수입니다":"음수 입니다";
		System.out.println(result2);
	}
	
	


}
