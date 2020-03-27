package com.human.ex;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int input=8;
		for(int i=input; i<10; i++) {
			arr[i-input]=arr[i];
			//arr[i]=0;
		}
		for(int i=10-input; i<10; i++) {
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
