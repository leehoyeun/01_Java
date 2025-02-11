package edu.kh.variable.practice;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		
		System.out.println( iNum1 / iNum2); // 2
		System.out.println( (int)dNum ); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (float)iNum1 ); // 10.0
		System.out.println( iNum1 /(float)iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( iNum1 / (int)fNum ); // 3
		//System.out.println( (iNum1 / fNum);// 3.3333333
		//float : 소수점 아래 8번째 자리까지 연산후 반올림
		//float은 23비트까지만 저장할 수 있어서 근사값이 빨리 끊어지고 반올림됨
		
		//float 비트수 : 32비트
		// → 저장방식: 23비트(가수) +8(지수) +1비트(부호)
		
		
		
		System.out.println( iNum1/(double)fNum ); // 3.3333333333333335
		//double :소수점 아래 16번째 자리까지 연산후 반올림
		//double은 52비트까지 저장할수 있어서 더 많은 자리수를 정확히 표현할수 있다
		//정밀도가 높아 마지막 값이 5
		
		//double비트수: 64비트
		// → 저장방식: 52비트(가수) +11(지수) +1비트(부호)
		
		System.out.println( "'"+ ch +"'" ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println("'"+(char)ch +iNum1+"'" ); // 'K'
		
	}

}
