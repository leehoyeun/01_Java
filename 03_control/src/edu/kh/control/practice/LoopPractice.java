package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		int input = sc.nextInt();
	
		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요. ");			
		}
		else {
			for(int i = 1 ; i <= input ;i++) {
				System.out.print(i+" ");
				
			
				
			
		}

	
	
	}
		
	
}
	public void ex2() {
		System.out.print("1이상의 숫자를 입력하세요 :");
		int input=sc.nextInt();
		
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else {
			for (int i = input ;i>=1; i--) {
				System.out.print(i+" ");
			}
		}
	}
	public void ex3() {
		
		System.out.print("정수를 하나 입력하세요 :");
		int input = sc.nextInt();
		int sum = 0;	
		
		for(int i=1 ; i<=input ; i++) {
			sum+=i;
			System.out.print(i);
			if(i == input) {
				System.out.print(i + "=" + sum);
				
				}
				else{
					System.out.print(i+"+");
					
				};	
			}
		
		}
	public void ex4() {
		
		System.out.print("첫 번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 :");
		int num2 = sc.nextInt();
		
		if(num1<1 ||num2 <1) {
			System.out.println("1이상의 숫자만 입력");
		}
		else {
			
			int start = num1 ;
			int end = num2;
			
			if(num1> num2) {
				start = num2;
				end = num1;
			}
		for(int i = start; i<=end;i++) {
			System.out.print(i+"");
		}
		}
	}
	public void ex5() {
		System.out.print("숫자 : ");
		int dan=sc.nextInt();
		
		System.out.println("======"+dan+"단======");
		for(int i =1 ; i<=9;i++) {
			System.out.printf(%d X %d =%d\n,dan,i,dan*i);
		}
	
	}
	public void ex6() {
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input<2||input>9) {
			System.out.println("2~9 숫자만 입력하세요");
		}else {
			//입력받은 숫자의 단부터 9단까지 단 증가하면서 반복 출력
			for(int dan= input;dan <=9;dan++) {
				System.out.println("====="+dan+"단=====");
				
				for(int i =1 ;i <=9;i++) {
					System.out.printf("%d X %d= %d\n"dan);
				}
			}
		}
		
	}
	public void ex7() {
	/*행(row)은 입력한 input 만큼
	 *열(col)은 현재행 (row)만큼 반복
	*
	**/
	System.out.print("정수입력 :");
	int input = sc.nextInt();
	
	for(int row = 1; row <= input;row++) {
		
		for(int col= 1; col <= row; col++) {
			System.out.print("*");
		}
			System.out.println();
	}
		
		
	}

}	
