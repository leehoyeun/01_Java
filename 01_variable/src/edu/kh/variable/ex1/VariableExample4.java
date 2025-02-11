package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {
		
		/*
		 * 강제 형변환
		 * 기존 자료형을 원하는 자료형으로 강제 변환 시기는 것
		 * 
		 * 1. 값의 법위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할 때
		 * 2. 출력되는 데이터의 표기법을 변환 시키고 싶을때
		 * 
		 * 
		 * *강제 형변환 방법
		 * 자료형을 변환시기고 싶은 값 또는 변수 앞에 (자료형)을 작성 
		 * 
		 * */
		
		double temp = 3.14;
		int num = (int)temp;
		
		System.out.println("temp:"+temp);//3.14
		System.out.println("num:"+num);//3
		// 실수형 double → 정수형 int 변환시 소수점 아래자리 손실(데이터손실)
		
		// int → byte 강제형변환
		
		int iNum = 290;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		//같은 정수형끼리의 변환시에도
		//값의 범위 차이 때문에 데이터 손실 발생!
		
		//char → int 강제 형변환
		char ch = 'A';
		System.out.println((int)ch);
		
		
		//int → char 강제형변환
		// 44085 
		
		int iNum3 = 44085;
		System.out.println((char)iNum3);//갵
		
		
		int i6 = 2147483647;//int의 최대값
		int result2 = i6+1;
		System.out.println(result2);//-2147483648
		
		
	}

}
