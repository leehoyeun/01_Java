package edu.kh.exception.run;

import edu.kh.exception.model.service.ExceptionService;
import edu.kh.exception.model.service.UserException;

public class ExceptionRun {
public static void main(String[] args) {
	try {
		new ExceptionService().ex5();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
}
}
