package com.human.ex;

public class JavaClass7 {

	public static void main(String[] args) {
		//1번문제
		java.util.Scanner scanner = new java. util.Scanner(System.in);
		System.out.println("학점 입력:");
		String 학점입력=scanner.nextLine();
		System.out.println("이름 입력:");
		String 이름입력=scanner.nextLine();
		System.out.println(이름입력+ "의" +"학점은" +학점입력+"입니다");
		
		//2번문제 
		System.out.println("키를 입력하세요(cm):");
		String str=scanner.nextLine();
		int i1=Integer.parseInt(str);
		System.out.println("m로 변환된 결과는 "+i1*0.01+ "m입니다.");
		
		//3번문제
		System.out.println("상자의 가로, 세로, 높이를 한번에 입력:");
		String 가로=scanner.nextLine();
		double d2=Double.parseDouble(가로);
		String 세로=scanner.nextLine();
		double d3=Double.parseDouble(세로);
		String 높이=scanner.nextLine();
		double d4=Double.parseDouble(높이);
		System.out.println("상자의 부피는"+(d2*d3*d4)+"입니다.");
		
		
		//4번문제
		
		System.out.println("평을 입력하세요:");
		String str5=scanner.nextLine();
		int i3=Integer.parseInt(str5);
		System.out.println((i3*3.3)+"평방미터입니다.");
		
		
		//5번문제
		System.out.println("질량:");
		String 질량=scanner.nextLine();
		int i4=Integer.parseInt(질량);
		System.out.println("속도:");
		String 속도=scanner.nextLine();
		int i5=Integer.parseInt(속도);
		System.out.println("운동에너지:"+(0.5*i4*i5*i5));
				
		
		//6번 문제
		System.out.println("당신의 이름은 무엇입니까?");
		String str11=scanner.nextLine();
		System.out.println("당신의 나이는 몇살입니까?");
		String str12=scanner.nextLine();
		int i12=Integer.parseInt(str12);
		System.out.println("당신의 키는 얼마입니까?");
		String str13=scanner.nextLine();
		int i13=Integer.parseInt(str13);
		System.out.println("당신의 몸무게는 얼마입니까?");
		String str14=scanner.nextLine();
		int i14=Integer.parseInt(str14);
		System.out.println("당신의 이름은" +str11+ "나이는" +i12+ "키는" +i13+ "몸무게는" +i14);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
