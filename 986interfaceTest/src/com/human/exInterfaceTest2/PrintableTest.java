package com.human.exInterfaceTest2;

class Call{

	public void invoke(Printable p) {
		if(p instanceof A4) {
			((A4) p).a();
		}else if(p instanceof B4) {
			((B4) p).b();
		}
	}
	
}

public class PrintableTest {

	public static void main(String[] args) {
		Printable p = new B4();
		Call c =  new Call();
		c.invoke(p);
	}

}
