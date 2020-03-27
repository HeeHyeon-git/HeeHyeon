package com.human.shape;

import java.util.Scanner;

public class Shape1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int answer = 0,a=0,b=0,c=0,n=0;
		 
		n = sc.nextInt();
		
		for(a=2;a<=n;a++){
			c=0;
			
			for(b=1;b<=a;b++){
				if(a%b==0){
				c++;
				}
			}
			if(c==2){
				answer++;
			}
		}
		System.out.println(answer);
		
	
		
	}

}
