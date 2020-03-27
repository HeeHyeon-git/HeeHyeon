package com.human.ex;
import java.util.*;

public class JavaStart10 {
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	public static boolean isDouble(String s) {
	    try { 
	    	Double.parseDouble(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	public static void square(int a, int b) {
		int square=0;
		System.out.println(square=a*b);		
	}
	public static void square(double a, double b) {
		double square=0;
		System.out.println(square=a*b);
	}
	
	public static void triangle(int a, int b) {
		int triangle=0;
		System.out.println(triangle=(a*b)/2);
	}
	public static void triangle(double a, double b) {
		double triangle=0;
		System.out.println(triangle=(a*b)/2); 
	}
	
	public static void circle(int a) {
		System.out.println((a*a)*3.14);
	}
	
	public static void circle(double a) {
		double circle=0;
		System.out.println(circle=(a*a)*3.14);
	}

	
	
	public static void main(String[] args) {
		Scanner sc=new java.util.Scanner(System.in);
		
	//���� ���� ���ϱ�
	 System.out.println("� ������ ���̸� ���Ͻʴϱ� (1.��  2.�簢��  3.�ﰢ��)");
	 	int figure=Integer.parseInt(sc.nextLine());
	 	
	 if(figure==1) {
		 System.out.println("�������� �Է����ּ���");
		 String circleInput=sc.nextLine();
		 	if(isInteger(circleInput)) {
		 		int cirNum1=Integer.parseInt(circleInput);
		 		circle(cirNum1);
		 	}else if(isDouble(circleInput)) {
		 		double cirNum2=Double.parseDouble(circleInput);
		 		circle(cirNum2);
		 	}
		 }else if(figure==2) {
			 System.out.println("�簢���� �غ��� ���̸� �Է����ּ���");
			 String squareInput=sc.nextLine();
			 String squareInput2=sc.nextLine();
		 		if(isInteger(squareInput)) {
		 			int squareWidth=Integer.parseInt(squareInput);
		 			int squareHeight=Integer.parseInt(squareInput2);
		 			square(squareWidth, squareWidth);
		 		}else if(isDouble(squareInput)) {
		 			double squareWidth=Double.parseDouble(squareInput);
		 			double squareHeight=Double.parseDouble(squareInput);
		 			square(squareWidth, squareHeight);
		 		}
		 }else if(figure==3) {
		 		System.out.println("�ﰢ���� �غ��� ���̸� �Է����ּ���");
		 		String triangleInput=sc.nextLine();
			 		if(isInteger(triangleInput)) {
			 			int triangleWidth=Integer.parseInt(triangleInput);
			 			int triangleHeight=Integer.parseInt(triangleInput);	
			 			triangle(triangleWidth, triangleHeight);
				 	}else if(isDouble(triangleInput)) {
				 		double triangleWidth=Double.parseDouble(triangleInput);
				 		double triangleHeight=Double.parseDouble(triangleInput);
				 		triangle(triangleWidth, triangleHeight);
				 	}
		
		 }
 	


	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
	}
}