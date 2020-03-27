package com.huma.ex;

class Rectangle {
	private int width = 0;
	private int height = 0;

	// �ѷ�
	public static int border(int w, int h) {
			return 2 * w+ 2 * h;
		}

	// ����
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

	// �ѷ�
	public int border() {
			return 2 *this.height+ 2 *this.width;
		}
	// ����
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

	// ������
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
		// �簢�� ���̿� �ѷ� ���ϴ� ���α׷� ����

		int x = 10;
		int y = 20;

		Rectangle re = new Rectangle(x, y);
		// re.width=10; private �ٸ� Ŭ�������� ���� �� �� ����.
		// ĸ��ȭ ���� �����ϸ� ������ �� �� �ִ�.
		
		int area = re.area();
		int border = re.border();

		System.out.println("��� : area = " + area + ", border= " + border);
		//������ �μ��� ���̿� �ѷ��� �޼ҵ� ����
		//System.out.println(Math.max(54, 2));
		
		//�ܼ��� ��길 ���� ���, static���� �ϸ� ���� ��� ���ϸ鼭 ����ȵǰ�, �ٷ� ����.
		System.out.println("��� : area=" + Rectangle.area(15,11)
							+"border= " + Rectangle.border(10, 5));
		
	}

}
