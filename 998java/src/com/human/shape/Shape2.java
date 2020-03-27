package com.human.shape;

import java.util.Scanner;

public class Shape2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		String seoul [] = {"2", "a","a","","4","Kim"};
		int a =0;
		int i =0;
	    int p =0;
	      
	    for(a = 0; a < seoul.length ;a++)
	    {	
	    	
	    	if(seoul[a].equals("Kim"))
	    	{
	    		p =a;
	    	}
	    	
	    	
	    }
	  String answer = "김서방은"+p+"에 있다";
	    System.out.println(answer);
	      
	      
	     
	   
		
	}
}
