package com.human.ex;

public class game369 {

	public static void main(String[] args) {
		//3,6,9���� ������ �� �ڼ� , 10�� ����
		for(int i=1;i<100; i++) {
			if(i%10==0) {
				System.out.println(" ����  ");
				continue;
			}
			if(i>10 && i/10%10%3==0) {
				System.out.println(" ¦ ");
			}
			if(i%10%3==0) {
				System.out.print("¦");
			}else if(i>10 && i/10%10%3==0){
				
			}else {
				System.out.print(" "+i+" ");
			}
		}

	}

}
