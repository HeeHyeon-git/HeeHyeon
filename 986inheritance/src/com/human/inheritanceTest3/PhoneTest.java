package com.human.inheritanceTest3;

public class PhoneTest {

	public static void main(String[] args) {
		Phone [] phone = {new Phone ("황진이"), new TelePhone("길동이","내일"), 
				new Smartphone("민국이", "갤러그")};
		
		if(phone[0] instanceof Phone) {
			phone[0].talk();
		}
		if(phone[1] instanceof TelePhone) {
			 phone[1].autoAnswering();
		}
		if(phone[2] instanceof Smartphone) {
			 phone[2].playGame();
		}
	}
}
