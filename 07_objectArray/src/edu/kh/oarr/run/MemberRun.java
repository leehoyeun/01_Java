
package edu.kh.oarr.run;

import edu.kh.oarr.model.vo.MemberService;

public class MemberRun {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		//service.ex();
		service.displayMenu();
		
	}

}
