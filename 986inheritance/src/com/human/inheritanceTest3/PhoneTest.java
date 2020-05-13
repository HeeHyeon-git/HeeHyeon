package com.human.inheritanceTest3;

public class PhoneTest {

	public static void main(String[] args) {
		Phone [] phone = {new Phone ("Ȳ����"), new TelePhone("�浿��","����"), 
				new Smartphone("�α���", "������")};
		
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
