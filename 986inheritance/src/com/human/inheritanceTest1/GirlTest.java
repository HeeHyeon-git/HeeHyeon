package com.human.inheritanceTest1;

public class GirlTest {

	public static void main(String[] args) {
		Girl[] girls = {new Girl("°©¼øÀÌ"), new GoodGirl("ÄáÁã"), new BestGirl("È²ÁøÀÌ")};
		//g2.show();
		for(Girl g : girls) {
			g.show();
		}
	}

}
