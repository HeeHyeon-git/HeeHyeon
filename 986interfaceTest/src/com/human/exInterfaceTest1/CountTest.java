package com.human.exInterfaceTest1;

public class CountTest {

	public static void main(String[] args) {
//		Countable[] m = { new Bird("뻐꾸기"), new Bird("독수리"), new Tree("사과나무"), new Tree("밤나무") };
//
//		for (Countable e : m) 
//			e.count();
//		
//		for(int i = 0; i < m.length; i++) {
//			if(m[i] instanceof Bird) {
//				m[i].fly(); 
//			}else if(m[i] instanceof Tree) {
//				m[i].ripen();
//			}
//		}

		Countable [] c = {new Bird("뻐꾸기",5), new Bird("독수리",2), 
				new Tree("사과나무",10), new Tree("밤나무",7)};
		for(Countable m : c) {
			m.count();
		}
		for(int i = 0; i < c.length; i++) {
			if(c[i] instanceof Bird) {
				c[i].fly();
			}else if(c[i] instanceof Tree) {
				c[i].ripen();
			}
		}
		
	}

}
