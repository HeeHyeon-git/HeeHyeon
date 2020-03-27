package com.human.ex;

		public class JavaClass {
			public static void main(String[] args) {
				//byte,short
			
				byte b1;
				//할당되지 않은 변수를 사용할 수 없다. 
				//System.out.println(b1);
				b1=10;
				System.out.println(b1);
				
				short s1=11;
				System.out.println(s1);
				
				int i1=10;
				System.out.println(i1);
				
				i1=20;
				i1=3*20+10;//연산식이 실행된 다음에 i1에 저장된다. 
				i1=10+3*20;//계산결과가 상위 계산과 비교해서 같음.
				//우선순위가 고려되어 실행된다.
				
				//1.i1.값을 10으로 변경
				//2.기존 i1값에 10을 추가하여 i1에 저장
				//3.i1값을 출력
				i1=10;
				i1=10+i1;
				i1=i1+10;
				//i1+=10; 위 2개와 같은 의미
				System.out.println(i1);
				
				//1.i2변수를 선언하여 10을 넣고
				//2.i2와 i1를 더한 값을 새로 선언한 i3에 넣어
				//3.i3을 출력
				int i2=10;
				int i3=i1+i2;
				System.out.println(i3);
				System.out.println(i1+i2);
				
				long l1=10l;
				System.out.println(l1);
				
				//float a=1.4;//error
				float a=1.4f;
				System.out.println(a);
				
				double b=3.14;
				System.out.println(b);
				
				String str="helloworld";
				System.out.println(str);
				
				//카페에 문제 올림. 입력변수에 데이터 넣으면 됨.
				//double b=3.14;
				//입력값은 변수에 넣어서 처리하시오 
				//입력값은 프로그램 중간에 상수로 처리하지 마시오.
				
				
				
				
				System.out.println(Math.sqrt(9));
				
				
				
	
				
					
		
	
		
	}

}
