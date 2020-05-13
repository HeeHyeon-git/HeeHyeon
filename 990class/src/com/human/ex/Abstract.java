package com.human.ex;
abstract class AbstractClassEx{
	int num;
	String str;
	
	public AbstractClassEx() {
		System.out.println("AbstractClassEx constructor");
	}
	
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClassEx constructor");
		
		this.num = i;
		this.str = s;
	}
	
	public void fun1() {
		System.out.println("-- fun1() START --");
	}
	
	public abstract void fun2();
}

class ClassEx extends AbstractClassEx{
	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	public ClassEx(int i, String s) {
		super(i,s);
	}
	@Override
	public void fun2() {
			System.out.println("-- fun2() START --");
	}
}

public class Abstract {
	
	public static void main(String[] args) {
		AbstractClassEx ex = new ClassEx(10, "java");
		ex.fun1();
		ex.fun2();
	}

}
