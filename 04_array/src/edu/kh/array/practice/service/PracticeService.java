package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	
	public void ex1() {
		int[]arr= new int[9];
		int sum = 0;
		
		for (int i=0; i < arr.length ;i++) {
			arr[i]=i+1;
			// System.out.print(arr[i]+"");
			
			if ( i%2==0) {
				sum+=arr[i];
			}
	}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수번째 인덱스의 합 : "+sum);
	}	
	
	public void ex2() {
	 int[] arr = new int[9];
	 int sum = 0;
		
		for (int i = 0; i <arr.length;i++) {
			arr[i]= 9 - i;
			System.out.print(arr[i]+"");
			
			if(i%2==1) {
				sum += arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수번째 인덱스합:"+sum);
		
	}
	public void ex3() {
		System.out.print("양의정수:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if (input <= 0) {
			System.out.println("정수를 입력해주세요");
			return;
			
		}
		int [] arr= new int [input];
		 for (int i = 0; i < arr.length; i++) {
	            arr[i] = i + 1;
	            System.out.print(arr[i] + " ");
	        }
		
	}
	public void ex4() {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // 정수 5개를 저장할 배열 선언 및 할당

        // 배열 초기화 (사용자로부터 입력 받기)
        for (int i = 0; i < arr.length; i++) {
            System.out.print("입력 " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // 검색할 값 입력 받기
        System.out.print("검색할 값 : ");
        int searchValue = sc.nextInt();
        boolean found = false; // 검색 결과 확인 변수

        // 배열에서 검색 값 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                System.out.println("인덱스 : " + i);
                found = true;
                break; // 첫 번째로 발견된 경우 출력 후 종료
            }
        }

        // 검색 값이 배열에 없을 경우 출력
        if (!found) {
            System.out.println("일치하는 값이 존재하지 않습니다.");
        }

        sc.close(); // Scanner 닫기
    }
		
	public void ex5() {
		// 1. 사용자에게 문자열 입력받기
		System.out.print("문자열:");
		String str = sc.nextint();
		
		// 2. 사용자가 입력한 문자열을 하나하나 cahr 배열에 넣기
		char[] arr = new char[str.length()];
		
		
		// -> 사용자가 입력한 문자열의 길이만큼 char 배열을 할당
		// 반복문을 통해 str.charAt(i)값을 arr[i]에 담는 과정
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i);
		}
		
		// 3. 문자 입력받기 (검색할 문자)
		System.out.print("문자 : ");
		char ch = sc.nextline().charAt(0);
		
		// 4. 검색할 문자가 문자열에 몇개가 존재하는지 , 어느 인덱스에 있는지 파악
		int count = 0;
		//문자열에서 동일한 문자가 발견될때마다 1씩 증가
		System.out.println(str + "에"+ ch );
		
		//arr 배열의 인덱스 마다 접근하기 위해 반복문 사용
		
		for(int i = 0 ; i < arr.length;i++) {
			if (arr[i]==ch) {
				System.out.print(i+"");//해당되는 인덱스 이어서 출력해주시기
				count++;
			}
		}
		System.out.println();
		System.out.println(ch+"개수:"+count);
	}
	public void ex6() {
		
	}
	public void ex7() {
		
	}
	public void ex8() {
		
	}
	public void ex9() {
		
	}
	public void ex10() {
		
	}
	public void ex11() {
		
	}
	public void ex12() {
		
	}
	public void ex13() {
		// char 배열에 모든 글자 넣고 , 중복값을 출력만 하지 않는 방식
		Scaner sc = new Scaner(System.in);
		//1. 사용자에게 문자열 입력받기
		System.out.print("문자열");
		String str = sc.nextline();
		
		//2. 해당 문자열의 문자들을 char[]에 담기
		char[]arr = new char[str.length()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i);
		}
		//2.해당 문자열의 문자들을 char[]에 담기
		
		//3.char 배열에서 중복값 존재할 경우 출력X
		
		int count = 0;
		System.out.println("문자열에 있는 문자 : ");
		
		for (int i = 0;i < arr.length;i++) {
			boolean flag = true;
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					falg = false;
					break;
				}
			}
			if(flag) {
				if(i==0) {
					System.out.print(arr[i]);
				}else {
					System.out.print(","+arr[i]);
				}
				count++;
			}
		}
	
	}
	public void ex14() {
		
		// 1. 첫 배열 크기 지정
		System.out.print("배영의 크기를 입력하세요:");
		int size = sc.nextint();
		
		String[]arr=new String[size];
		
		sc.nextLine();//입력 버퍼에 남은 개행문자 제거
		// 2. 첫 배열에 저장할 문자열 입력받기
		for (int i =0;i < arr.length;i++) {
			System.out.print((i+1)+"번째 문자열");
			arr[i]= sc.nextline();
		}
		// 3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;
		
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까?(y/n):");
			char ch = sc.next().cartAt(0);
			
			
			//4. 값을 더 입력할 경우
			if(ch=='y'||ch=='Y') {
				
			//5. 더입력 받을 개수 입력 받기
				System.out.print("더 입력하고 싶은 개수 :");
				int addSize=sc.nextint();
			//6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
			//7. 배열 복사 + 새로운 문자열 입력받기
				
				for(int i = 0; i<newArr.length;i++) {
					if(i<arr.length) {
						newArr[i]=arr[i];
					}else {
						newArr[i]=nextLine();
						
					}
				}
				
			
			//8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr
				// 더입력? y
				// 위코드를 반복할때 기존 배열인 arr 의 길이를 기준으로 
				// newArr길이를 
				arr = newArr;
			
			}else if(ch=='n'||ch=='N') {
				break;
			}
			//값을 더 입력하지 않을 경우
			else {
				System.out.println("잘못 입력하셨습니다.다시입력하세요.");
			}
			//잘못 입력할 경우
			
			
			
			
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
		
	}

