package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		//1.객체 배열의 크기를 3으로 할당
		Employee emp [] = new Employee[3];
		
		//할당 한뒤 3개의 생성자를 이용하여 각각 생성
		emp[0] = new Employee(); // 기본생성자
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000,
							0.01, "01011112222", "서울 마곡");
		
	
		//생성한 후 출력
		for(int i = 0;i<emp.length;i++) {
			System.out.println("emp["+i+"]:"+emp[i].information());
			
			System.out.println("===============");
			
			emp[0].setEmpNo(0);
			emp[0].setEmpName("김말똥");
			emp[0].setDept("영업부");
			emp[0].setJob("팀장");
			emp[0].setAge(i);
		
		
		
			System.out.println("emp[0] :"emp[0].information());
			System.out.println("emp[1] :"emp[0].information());
			
			//3. 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
			//  연봉 = (급여+(급여*보너스포인트))*12
			int sum = 0;
			
			
			for(int i = 0;i<emp.length;i++) {
				int sumSalary = 
			sum += sumSalary;
			}
			
			System.out.println("==============");
			
			// 4. 세직원의 연봉 평균을 구하여 출력
			// 	위의 3번에서 sum 변수를 이용하여 평균을 냄
		}
		}

}
