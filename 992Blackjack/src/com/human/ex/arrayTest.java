package com.human.ex;
import java.util.*;

class Dog{
	public String name;
	public int age;
	public String color;

}
public class arrayTest {
	
	public static void main(String[] args) {
		
	//p.3  문제 첫 번째 화살표 위치에 숫자 13을 넣으려면 어떻게 해야 하는가?
		int a[]=new int[12];
		a[2]=13;
	//p.3  문제 두 번째 화살표 위치에 사라는 값을 읽어 오려면 어떻게 해야 하는가?
		a[10]=4;
		System.out.println(a[10]);
		
	//p.4  문제  double형 자료형을 선언하고 2.23,5.23,12.23 이라는 숫자를  배열에 넣어 처리 해 보자. 
		double d[]= {2.23,5.23,12.23};
		
	//p.4 문제 사용자  입력을 받아 과일 4개를 입력받아 출력하는 프로그램을 만들어 보자.
		Scanner sc= new Scanner(System.in);
		System.out.println("과일 4개를 입력하시오 ");
		String str="";
			for(int i=0; i<4; i++) {
			str=(sc.nextLine());
		}
		System.out.println(str);
		
	//p.4 문제  강아지 클래스를 배열에 담아 출력해보자.
		Dog dog[]=new Dog[3];
		dog[0]=new Dog();
		dog[0].name="곰곰이";
		dog[0].age=12;
		dog[0].color="black";
		
	//p.4 문제  배열에 1,2,3,4,5,6,..를 넣어보자.
		String str1[]= {"1","2","3","4","5","6",".","."};
		int a1[]={1,2,3,4,5,6};
		
	//p.4 문제 3의 배수 10개를 배열에 저장해서 출력하는 변수를 구해보자.
		int three[]=new int[10];
		for(int i=0; i<10; i++) {
			three[i]=i*3; 					
		}
			
	//p.5 문제 배열에 랜덤한 숫자를 넣고 그 중에서 배열에서 가장 큰수 구하기 배열에서 가장 작은수 구하기
		Random rd=new Random();
		int arr[]=new int[10];
		for(int i=0; i<10; i++) {
			arr[i]=rd.nextInt(10);
		}
//		int max=Integer.MIN_VALUE;
//		int min=Integer.MAX_VALUE;
//		int max=-1;
//		int min=100;
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0; i<10; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}	
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
		System.out.println(min);
		
	//p.5 문제 배열에 값을 3 증가시켜서 현재 배열에 넣기.
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<10; i++) {
			arr[i]=arr[i]*3;
		}
		int inputNum=6;
		for(int i=0; i<10; i++) {
			if(inputNum==arr[i]) {
				System.out.println("index : " + i);
			}
		}
		System.out.println(Arrays.toString(arr));
		
	//p.6
		int arr[]=new int[9];
		for(int i=0; i<9; i++) {
			arr[i]=i%3+1;
		}
		System.out.println(Arrays.toString(arr));
		
	//p.6 문제 그림과 같이 배열의 요소를 복사하세요.	
		char arr[]= {'A','B','C','\0','\0','\0'};
		for(int i=2;i>0;i--) {
			arr[5-i]=arr[i];
		}
		System.out.println(Arrays.toString(arr));		
		
	//p.7 문제 배열 a={1,2,3,4,5,6,7,8,9,10}을 생성하며, 사용자로부터 하나의 수를 입력받아
	//그 수만큼 배열의 값을 왼쪽으로 이동하고 오른쪽에는 0을 채우는 프로그램을 작성하세요.
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int input=9;
		for(int i=input; i<10; i++) {
			arr[i-input]=arr[i];
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
		
	//p.8 문제 두 배열을 선언하고 인덱스가 같은 배열에 값을 곱해서 새로운 배열에 넣어보자.
		int a[]= {1,9,3,6,5,4,7,8,2,10};
		int b[]= {7,8,2,5,10,1,3,6,4,19};	
		int c[]= new int[10];
		for(int i=0; i<10; i++) {
			c[i]=a[i]*b[i];
		}
		System.out.println(Arrays.toString(c));
	
	//p.9 문제 키보드로 5명의 시험 점수를 입력하고 최고 점수를 출력하는 코드.	
		int input[]=new int[5];
		int a=0;
		int max=0;
		System.out.println("시험 점수를 입력하세요");
		for(int i=0; i<input.length; i++) {
			input[i]=Integer.parseInt(sc.nextLine());
		}	
		max=input[0];
		
		for(int i=0; i<input.length; i++) {
			System.out.println((i+1)+"번째 사람의 시험 점수는 "+input[i]+"점입니다.");
			if(max<input[i]) {
				max=input[i];
			}
			}
				System.out.println("최고 점수는"+max);	

	//p.10 문제 키보드로 5명의 시험 점수를 입력하고 70점 이상의 학생 수를 세어서 표시.
		int input[]=new int[5];
		int a=0;
		int count=0;
		System.out.println("시험점수를 입력하세요.");
				
			for(int i=0; i<input.length; i++) {
				input[i]=Integer.parseInt(sc.nextLine());
			}
			for(int i=0; i<input.length; i++) {
			System.out.println((i+1)+"번째 사람의 시험 점수는 "+ input[i] +" 입니다.");
				if(input[i]>70) {
					count++;			
				}
					
			}
				System.out.println("70점 이상인 학생은 "+count+"입니다.");	
					
	//p.11 문제 다음과 같이 5명의 국어,영어,수학 성적을 입력받아 각 과목별 총점과 평균을 출력하는 프로그램.
				int kor[]=new int[5];
				int eng[]=new int[5];
				int mat[]=new int[5];
				int korSum=0;
				int engSum=0;
				int matSum=0;
				double korAve=0;
				double engAve=0;		
				double matAve=0;
				
				for(int i=0; i<5; i++) {
					System.out.print((i+1)+"번 학생 국어 성적 입력 :");
					kor[i]=Integer.parseInt(sc.nextLine());
					System.out.print((i+1)+"번 학생 영어 성적 입력 :");
					eng[i]=Integer.parseInt(sc.nextLine());
					System.out.print((i+1)+"번 학생 수학 성적 입력 : ");
					mat[i]=Integer.parseInt(sc.nextLine());
					
					korSum=korSum+kor[i];
					engSum=engSum+eng[i];
					matSum=matSum+mat[i];
					
					korAve=korSum/5;
					engAve=engSum/5;	
					matAve=matSum/5;
				
				}
				System.out.println("국어 총점 : "+korSum +" 평균: "+korAve);
				System.out.println("영어 총점 : "+engSum +" 평균: "+engAve);		
				System.out.println("수학 총점 : "+matSum +" 평균: "+matAve);
				
	//p.11 문제 네 자릿수의 수를 입력받아 배열 a(크기 4)의 요소에 차례대로 저장하고, 다음과 같이 출력하는 프로그램.
	
	//p.12 문제 출석 관리하는 배열을 만들어서 16명의 출석 여부를 출력하는 배열을 만들자
	//출석상황을 판별하자. 1.출석 입력 2.결석 입력 3.초기화(모두 출석 혹은 결석) 4.출석정보 출력  5. 프로그램 종료
	
	//p.12 문제 채점 프로그램 다섯 명 심사위원의 점수를 입력하여 유효점수와 평균을 출력하는 프로그램을 작성한다. 
	//유효점수는 최고점과 최저점을 제외한 점수이며 평균은 유효점수로 계산한다.
	
	//p.13 문제 로또 프로그램 1부터 45까지의 수 중에 6개의 숫자를 입력하여 출력하는 프로그램을 작성한다.
	//단,입력하는 중에 이미 입력한 번호와 같은 번호를 입력하면 중복 오류 메시지를 출력하고 새로 입력한다.
	
	//p.13 문제 1~9사이의 숫자를 랜덤으로 받아서 각 숫자가 몇 번 출력되는지 출력하는 프로그램을 구현해보자
	//빈도수가 가장 높은 숫자대로 순서대로 출력하자.
		
	//p.14 문제 다음과 같이 크기가 50인 배열 a에 1~50을 저장하고, 같은 크기의 배열 b에 복사하는 프로그램을 작성하세요
	// 사용자로부터 입력받은 수의 배수에 해당하는 요소는 0으로 출력하세요.
	
	//왼쪽에 0을 채우는 형태로 변경
		
	//369게임 해답지 변경
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
