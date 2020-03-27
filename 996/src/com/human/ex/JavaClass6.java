package com.human.ex;

public class JavaClass6 {

	public static void main(String[] args) {
		//사용자 입력을 받아 보자.
		//사용자가 키보드로 입력한 데이터를 프로그램에서 받아서 처리하는 것.
		//int a //int a에서 a로 작업하듯이 여기서는 scanner로 작업함. 
		
		java.util.Scanner scanner //스캐너는 외부장치라고 함.
			=new java.util.Scanner(System.in);
		System.out.println("문자열을 입력해주세요>>");
		String str10=scanner.nextLine();//사용자 입력을 받아 문자열로 리턴해주는 함수
		System.out.println(str10+"을 입력하셨습니다.");
		
		//사용자 입력은 모두 문자열이다. 
		//숫자를 사용자로부터 받으려면 문자열을 숫자로 변경하는 함수를 사용하자.
		
		System.out.println("정수를 입력해주세요>>");
		String str11=scanner.nextLine();
		int i10=Integer.parseInt(str11);
		System.out.println("입력한 정수는;"+i10);
		
		//사용자에게 2수를 입력받아 더해서 출력해보자.
		System.out.println("정수를 입력해주세요>>");
		//String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		int i1=Integer.parseInt(str11);
		int i2=Integer.parseInt(str2);
		System.out.println("입력한 정수의 합은:"+(i1+i2)+"입니다.");
	
		
	
		
		
		System.out.println("프로그램 종료"); //콘솔 창에서 문자 입력 후 엔터 눌러주면 프로그램 종료로 뜸
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
	}

}
