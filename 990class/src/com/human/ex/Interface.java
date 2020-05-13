package com.human.ex;
class ImplementClass implements InterfaceA,InterfaceB,InterfaceC,InterfaceD{
	public ImplementClass() {
		System.out.println("ImplementClass constructor");
	}
	@Override
	public void funA() {System.out.println("-- funA START --");}
	@Override
	public void funB() {System.out.println("-- funB START --");}
	@Override
	public void funC() {System.out.println("-- funC START --");}
	@Override
	public void funD() {System.out.println("-- funD START --");}
	
}
interface InterfaceA {
	public void funA();
}
interface InterfaceB {
	public void funB();
}
interface InterfaceC {
	public void funC();
}
interface InterfaceD {
	public void funD();
}
public class Interface {

	public static void main(String[] args) {
		InterfaceA ia = new ImplementClass();
		InterfaceB iB = new ImplementClass();
		InterfaceC iC = new ImplementClass();
		InterfaceD iD = new ImplementClass();
		ia.funA();
	}

}
