package com.human.ex;
import java.util.*;

class Dog{
	public String name;
	public int age;
	public String color;

}
public class arrayTest {
	
	public static void main(String[] args) {
		
	//p.3  ���� ù ��° ȭ��ǥ ��ġ�� ���� 13�� �������� ��� �ؾ� �ϴ°�?
		int a[]=new int[12];
		a[2]=13;
	//p.3  ���� �� ��° ȭ��ǥ ��ġ�� ���� ���� �о� ������ ��� �ؾ� �ϴ°�?
		a[10]=4;
		System.out.println(a[10]);
		
	//p.4  ����  double�� �ڷ����� �����ϰ� 2.23,5.23,12.23 �̶�� ���ڸ�  �迭�� �־� ó�� �� ����. 
		double d[]= {2.23,5.23,12.23};
		
	//p.4 ���� �����  �Է��� �޾� ���� 4���� �Է¹޾� ����ϴ� ���α׷��� ����� ����.
		Scanner sc= new Scanner(System.in);
		System.out.println("���� 4���� �Է��Ͻÿ� ");
		String str="";
			for(int i=0; i<4; i++) {
			str=(sc.nextLine());
		}
		System.out.println(str);
		
	//p.4 ����  ������ Ŭ������ �迭�� ��� ����غ���.
		Dog dog[]=new Dog[3];
		dog[0]=new Dog();
		dog[0].name="������";
		dog[0].age=12;
		dog[0].color="black";
		
	//p.4 ����  �迭�� 1,2,3,4,5,6,..�� �־��.
		String str1[]= {"1","2","3","4","5","6",".","."};
		int a1[]={1,2,3,4,5,6};
		
	//p.4 ���� 3�� ��� 10���� �迭�� �����ؼ� ����ϴ� ������ ���غ���.
		int three[]=new int[10];
		for(int i=0; i<10; i++) {
			three[i]=i*3; 					
		}
			
	//p.5 ���� �迭�� ������ ���ڸ� �ְ� �� �߿��� �迭���� ���� ū�� ���ϱ� �迭���� ���� ������ ���ϱ�
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
		
	//p.5 ���� �迭�� ���� 3 �������Ѽ� ���� �迭�� �ֱ�.
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
		
	//p.6 ���� �׸��� ���� �迭�� ��Ҹ� �����ϼ���.	
		char arr[]= {'A','B','C','\0','\0','\0'};
		for(int i=2;i>0;i--) {
			arr[5-i]=arr[i];
		}
		System.out.println(Arrays.toString(arr));		
		
	//p.7 ���� �迭 a={1,2,3,4,5,6,7,8,9,10}�� �����ϸ�, ����ڷκ��� �ϳ��� ���� �Է¹޾�
	//�� ����ŭ �迭�� ���� �������� �̵��ϰ� �����ʿ��� 0�� ä��� ���α׷��� �ۼ��ϼ���.
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int input=9;
		for(int i=input; i<10; i++) {
			arr[i-input]=arr[i];
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
		
	//p.8 ���� �� �迭�� �����ϰ� �ε����� ���� �迭�� ���� ���ؼ� ���ο� �迭�� �־��.
		int a[]= {1,9,3,6,5,4,7,8,2,10};
		int b[]= {7,8,2,5,10,1,3,6,4,19};	
		int c[]= new int[10];
		for(int i=0; i<10; i++) {
			c[i]=a[i]*b[i];
		}
		System.out.println(Arrays.toString(c));
	
	//p.9 ���� Ű����� 5���� ���� ������ �Է��ϰ� �ְ� ������ ����ϴ� �ڵ�.	
		int input[]=new int[5];
		int a=0;
		int max=0;
		System.out.println("���� ������ �Է��ϼ���");
		for(int i=0; i<input.length; i++) {
			input[i]=Integer.parseInt(sc.nextLine());
		}	
		max=input[0];
		
		for(int i=0; i<input.length; i++) {
			System.out.println((i+1)+"��° ����� ���� ������ "+input[i]+"���Դϴ�.");
			if(max<input[i]) {
				max=input[i];
			}
			}
				System.out.println("�ְ� ������"+max);	

	//p.10 ���� Ű����� 5���� ���� ������ �Է��ϰ� 70�� �̻��� �л� ���� ��� ǥ��.
		int input[]=new int[5];
		int a=0;
		int count=0;
		System.out.println("���������� �Է��ϼ���.");
				
			for(int i=0; i<input.length; i++) {
				input[i]=Integer.parseInt(sc.nextLine());
			}
			for(int i=0; i<input.length; i++) {
			System.out.println((i+1)+"��° ����� ���� ������ "+ input[i] +" �Դϴ�.");
				if(input[i]>70) {
					count++;			
				}
					
			}
				System.out.println("70�� �̻��� �л��� "+count+"�Դϴ�.");	
					
	//p.11 ���� ������ ���� 5���� ����,����,���� ������ �Է¹޾� �� ���� ������ ����� ����ϴ� ���α׷�.
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
					System.out.print((i+1)+"�� �л� ���� ���� �Է� :");
					kor[i]=Integer.parseInt(sc.nextLine());
					System.out.print((i+1)+"�� �л� ���� ���� �Է� :");
					eng[i]=Integer.parseInt(sc.nextLine());
					System.out.print((i+1)+"�� �л� ���� ���� �Է� : ");
					mat[i]=Integer.parseInt(sc.nextLine());
					
					korSum=korSum+kor[i];
					engSum=engSum+eng[i];
					matSum=matSum+mat[i];
					
					korAve=korSum/5;
					engAve=engSum/5;	
					matAve=matSum/5;
				
				}
				System.out.println("���� ���� : "+korSum +" ���: "+korAve);
				System.out.println("���� ���� : "+engSum +" ���: "+engAve);		
				System.out.println("���� ���� : "+matSum +" ���: "+matAve);
				
	//p.11 ���� �� �ڸ����� ���� �Է¹޾� �迭 a(ũ�� 4)�� ��ҿ� ���ʴ�� �����ϰ�, ������ ���� ����ϴ� ���α׷�.
	
	//p.12 ���� �⼮ �����ϴ� �迭�� ���� 16���� �⼮ ���θ� ����ϴ� �迭�� ������
	//�⼮��Ȳ�� �Ǻ�����. 1.�⼮ �Է� 2.�Ἦ �Է� 3.�ʱ�ȭ(��� �⼮ Ȥ�� �Ἦ) 4.�⼮���� ���  5. ���α׷� ����
	
	//p.12 ���� ä�� ���α׷� �ټ� �� �ɻ������� ������ �Է��Ͽ� ��ȿ������ ����� ����ϴ� ���α׷��� �ۼ��Ѵ�. 
	//��ȿ������ �ְ����� �������� ������ �����̸� ����� ��ȿ������ ����Ѵ�.
	
	//p.13 ���� �ζ� ���α׷� 1���� 45������ �� �߿� 6���� ���ڸ� �Է��Ͽ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
	//��,�Է��ϴ� �߿� �̹� �Է��� ��ȣ�� ���� ��ȣ�� �Է��ϸ� �ߺ� ���� �޽����� ����ϰ� ���� �Է��Ѵ�.
	
	//p.13 ���� 1~9������ ���ڸ� �������� �޾Ƽ� �� ���ڰ� �� �� ��µǴ��� ����ϴ� ���α׷��� �����غ���
	//�󵵼��� ���� ���� ���ڴ�� ������� �������.
		
	//p.14 ���� ������ ���� ũ�Ⱑ 50�� �迭 a�� 1~50�� �����ϰ�, ���� ũ���� �迭 b�� �����ϴ� ���α׷��� �ۼ��ϼ���
	// ����ڷκ��� �Է¹��� ���� ����� �ش��ϴ� ��Ҵ� 0���� ����ϼ���.
	
	//���ʿ� 0�� ä��� ���·� ����
		
	//369���� �ش��� ����
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
