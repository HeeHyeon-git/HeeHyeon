package com.human.ex;

import java.util.Scanner;
import java.util.Random;
public class JavaClass02 {

	public static void main(String[] args) {
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		int randomNumber=rd.nextInt(10);
		boolean isOk=false;
		
		//�� �����صα�
		for(int i=1;i<11;i++) {
			System.out.println("0���� 9������ ���ڸ� �Է��ϼ���.");
			System.out.println("["+i+"��° ����]");
			int userNumber=Integer.parseInt(sc.nextLine());
			if(randomNumber>userNumber) {
				System.out.println(userNumber+" �� ū �� �Դϴ�.");
			}else if(randomNumber==userNumber) {
				System.out.println(i+" ��°  ���� �Դϴ�.");
				isOk=true;
				break;
			}else {
				System.out.println(userNumber+" �� ���� �� �Դϴ�. ");
			}
		}
		if(isOk==false) {
		System.out.println("10�� �ȿ� ������ ���߽��ϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}