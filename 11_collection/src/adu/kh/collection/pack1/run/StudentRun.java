package adu.kh.collection.pack1.run;

import adu.kh.collection.pack1.model.dto.StudentService;

public class StudentRun {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		//service.ex();
		service.displayMenu();
	}
}
