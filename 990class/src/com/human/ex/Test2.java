package com.human.ex;
//접근제한자 public, private, default, protected
//public:    모든 위치에서 접근 가능
//private:   같은 클래스 내부에서 접근 가능
//default:	  같은 패키지에서 접근 가능
//protected: 같은 패키지이거나 다른 패키지이면 상속받은 자식에서만 접근 가능

class MyClass2 extends com.human.ex1.MyClass{
	public void test() {
		i1=1;
		//i2=1;
		//i3=1;
		i4=1; //protected 
	}
}
public class Test2 {

	public static void main(String[] args) {
		com.human.ex.MyClass mc = new com.human.ex.MyClass();
		mc.i1=1;	//public
		// mc.i2=1;   private
		mc.i3=1;	//default
		mc.i4=1;	//protected
	
		com.human.ex1.MyClass mc2 = new com.human.ex1.MyClass();
		mc2.i1=1;	
		// mc.i2=1;   
		//mc2.i3=1;	
		//mc2.i4=1; 	default는 같은 패키지에서만 사용가능함.	
	}

}
