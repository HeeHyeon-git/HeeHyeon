package com.human.ex;

public class JavaClass8 {

	public static void main(String[] args) {
		//String.format() 새로운 문자열을 만드는 함수, %s를 쓰면 그 다음 문자가 합쳐짐.
		String str1=String.format("안녕 내 이름은 %s","홍길동");
		System.out.println(str1);
		//여러개 문자열 처리 %s 여러개면 여러개 처리 가능
		str1=String.format("안녕 내 이름은 %s이고 사는 곳은 %s 다니는 " + 
				 "학교는 %s 입니다.","홍길동","대전","휴먼");		//첫 번째 데이터-홍길동이 앞자리에 두 번째 데이터 대전이 뒤자리에
		System.out.println(str1);
		
		str1=String.format("나이는 %d, 키는 %f", 20,170.3);
		System.out.println(str1);
		//%s는 문자열
		//%d는 정수
		//%f는 실수
		
		int i1=30;
		double d1=3.141592;
		String str2="안녕 하세요";
		//String.format을 사용해서 3개를 출력해보자
		str1=String.format("%d %f %s", i1,d1,str2);
		System.out.println(str1);
		System.out.println(String.format("%d %f %s", i1,d1,str2));
		
		str1=String.format(":%d:%-10d:%10d:", i1,i1,i1);//-10은 왼쪽으로 왼쪽정렬 10은 오른쪽 정렬
		                        //숫자가 10일 경우 10칸 중 앞에 8칸 띄어둠, 숫자가 100일 경우 10칸 중 7칸 띄움.
		System.out.println(str1);
		
		str1=String.format(":%f:%.3f:", d1,d1,d1);//소수점 3자리까지만 나타냄,
		//만약에 반올림이 되지 말아야 한다면 마지막 자리에서 -5해주기 ex)3.1415 -> 3.1410
		System.out.println(str1);
		
		str1=String.format("%%\"");//%가 문법과 겹쳐서 %% 두개 써줘야 1개로 출력됨, \""도 "한개로 출력
		System.out.println(str1);
		
		//%[-][0][전체자리수].[정밀도][변환문자]
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
	}

}
