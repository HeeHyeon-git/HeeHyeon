package com.human.ex;
//���������� public, private, default, protected
//public:    ��� ��ġ���� ���� ����
//private:   ���� Ŭ���� ���ο��� ���� ����
//default:	  ���� ��Ű������ ���� ����
//protected: ���� ��Ű���̰ų� �ٸ� ��Ű���̸� ��ӹ��� �ڽĿ����� ���� ����

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
		//mc2.i4=1; 	default�� ���� ��Ű�������� ��밡����.	
	}

}
