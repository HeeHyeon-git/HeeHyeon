package com.human.exInterfaceTest1;

public class CountTest {

	public static void main(String[] args) {
//		Countable[] m = { new Bird("���ٱ�"), new Bird("������"), new Tree("�������"), new Tree("�㳪��") };
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

		Countable [] c = {new Bird("���ٱ�",5), new Bird("������",2), 
				new Tree("�������",10), new Tree("�㳪��",7)};
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
