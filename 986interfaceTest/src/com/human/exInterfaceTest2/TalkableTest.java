package com.human.exInterfaceTest2;

public class TalkableTest {
	private static void speak(American american) {
		System.out.println();
	}
	private static void speak(Korean korean) {
		
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
	

}
