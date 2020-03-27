package com.huma.ex;

class Rectangle {
	private int width = 0;
	private int height = 0;

	// 둘레
	public static int border(int w, int h) {
			return 2 * w+ 2 * h;
		}

	// 넓이
	public static int area(int w, int h) {
			return w * h;
		}
	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height<0) {
			this.height=0;
		}else {
			this.height = height;	
		}
	}

	// 둘레
	public int border() {
			return 2 *this.height+ 2 *this.width;
		}
	// 넓이
	public  int area() {
			return this.height * this.width ;
		}
	// setter,getter
	public void setWidth(int width) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public int getWidth() {
		return this.width;
	}

	// 생성자
	public Rectangle() {
	}

	public Rectangle(int length) {
		this(length, length);
	}

	public Rectangle(int width, int height) {
		if (width < 0 || height < 0) {
			this.width = 0;
			this.height = 0;
		}
		this.width = width;
		this.height = height;
	}
}

public class ClassStart8 {

	public static void main(String[] args) {
		// 사각형 넓이와 둘레 구하는 프로그램 구현

		int x = 10;
		int y = 20;

		Rectangle re = new Rectangle(x, y);
		// re.width=10; private 다른 클래스에서 접근 할 수 없다.
		// 캡슐화 직접 접근하면 음수가 들어갈 수 있다.
		
		int area = re.area();
		int border = re.border();

		System.out.println("출력 : area = " + area + ", border= " + border);
		//간단히 두수의 넓이와 둘레는 메소드 구현
		//System.out.println(Math.max(54, 2));
		
		//단순한 계산만 얻을 경우, static으로 하면 값이 계속 변하면서 저장안되고, 바로 나옴.
		System.out.println("출력 : area=" + Rectangle.area(15,11)
							+"border= " + Rectangle.border(10, 5));
		
	}

}
