package com.human.inheritanceTest1;

public class GirlTest {

	public static void main(String[] args) {
		Girl[] girls = {new Girl("������"), new GoodGirl("����"), new BestGirl("Ȳ����")};
		//g2.show();
		for(Girl g : girls) {
			g.show();
		}
	}

}
