package com.human.exInterfaceTest2;

public class TalkableTest {
	
	static void speak(Talkable talkable) {
		talkable.talk();
	}
	
	public static void main(String[] args) {
		
		speak(new Korean());
		speak(new American());
	}
	

}
