package com.human.ex;

public class JavaClass5 {

	public static void main(String[] args) {
		//자동 형변환
		byte b1=10; //자료형이 다르면 변수에 값을 넣을 수 없다.
		short s1=10; //자동 형변환 되어 들어간다.
		char c1=10; //정수형 자료형은 int형 상수가 자동으로 형변환 되어 들어간다. 
		int i1=10;  //4byte
		long l1=10; //8byte
		//안되는 경우는 
		//int i2=l1; //작은 데이터를 큰 데이터에 넣으면 자동 형변환된다. 
					 //반대의 경우는 자동 형변환되지 않는다. (기본적으로는 이렇지만 안 되는 경우도 있음.)
		//bi=i1;
		//b1=s1;
		
		i1=i1+i1; //20
		//b1=b1+b1;//error int 크기보다 작은 자료형 연산은 
				  //int로 자동 형변환된다. 
		          //byte+byte=int
				  //short + short = int
		//i1=l1+10; //long + int = long
		l1=l1+i1;
		c1='A'+1; // char + int = int -> char
		c1='가'+'B';
		
		
		//실수
		float f1=10.f; //4byte
		double d1=10.; //8byte
		
		d1=f1;//double = float;
		//f1=d1; //error
		
		f1=i1; d1=i1; f1=l1; d1=l1;
		//
		//i1=fi; i1=d1; //error
		
		String str1="10";
		//i1=str1; error
		//str1=10; error
		str1=str1+10+10; //101010
		str1=10+10+str1; //2010
		//int + string = string
		//string + int = string
		//float + string = string
		
		//강제 형변환 : 캐스팅(casting)
		//사용방법은 (자료형) 소괄호안에 변경하고자하는 자료형을 넣어줌.
		b1=(byte)(b1+b1);
		i1=(int)l1; //크기가 달라서 손실이 생길 수 있음.(강제 형변환시 손실이 생겨 값이 달라질 수 도 있음, 값이 같을 때만 사용)
		f1=3.14f;
		i1=(int)f1; //3
		System.out.println(i1);//3만 들어가 있음. 
		f1=i1;
		System.out.println(f1);//3.만 들어가 있음.
		
		f1=(float)d1;//손실이 생길 수 있음.
		
		//숫자 자료형을 문자열로 변환하는 방법
		String str3 = f1+"";
		str3="10";
		i1=Integer.parseInt(str3); //i1이 정수 10이 된다.
		i1=Integer.valueOf(str3); //parseInt와 같은 의미.
		System.out.println(str3);

		str3="1.14";
		d1=Double.parseDouble(str3); //d1이 실수 1.14가 된다.
		System.out.println(str3);
		
		str3="1.14hi";//잘못된 문자열을 사용하면 문제가 발생한다. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
	}

}
