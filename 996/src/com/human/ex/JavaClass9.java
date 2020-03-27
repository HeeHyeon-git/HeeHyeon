package com.human.ex;

import java.util.Random;
import java.util.Scanner;

public class JavaClass9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random R = new Random();
			
		String S[] = {"","A", "B", "C"};
		int i = 0;
		
		for(int i1 = 0 ; i1<3 ; i1++)
		{
			i = R.nextInt(3)+1;
			System.out.println(S[i]);
			try 
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return;
			}
			
		}
			
		
		
	
		
	}

}
