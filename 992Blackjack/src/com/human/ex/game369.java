package com.human.ex;

public class game369 {

	public static void main(String[] args) {
		//3,6,9으로 끝나는 수 박수 , 10에 만세
		for(int i=1;i<100; i++) {
			if(i%10==0) {
				System.out.println(" 만세  ");
				continue;
			}
			if(i>10 && i/10%10%3==0) {
				System.out.println(" 짝 ");
			}
			if(i%10%3==0) {
				System.out.print("짝");
			}else if(i>10 && i/10%10%3==0){
				
			}else {
				System.out.print(" "+i+" ");
			}
		}

	}

}
