package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {
	
	public static void main(String[] args) {
		
	Random random = new Random();
	
	List<Friend> friendList = new ArrayList<>();
		
	friendList.add(new Friend("짱구"));
	friendList.add(new Friend("철수"));
	friendList.add(new Friend("유리"));
	friendList.add(new Friend("훈이"));
	friendList.add(new Friend("맹구"));
		
	//정리된 리스트에서 랜덤으로 하나 호출?
	
	int randomNum = (int)(Math.random()*friendList.size());
	
	Friend leader = friendList.get(randomNum);
	leader.pickLeader();
	}
}
 