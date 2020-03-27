package com.human.ex;

import java.util.Scanner;
import java.util.Random;
public class JavaClass01 {

	public static void main(String[] args) {
		
		//지그재그 숫자 출력하기.
		int lineMax=0;
		int lineRev=0;
		
		for(int i=0; i<25;i++) {

			if(i%5==0) {
				System.out.println("");
				lineMax=i+5;
				lineRev++;
			}
			if(lineRev%2!=0){
			System.out.print("\t"+(i+1));
			}else {
				System.out.print("\t"+(lineMax-(i%5)));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
