package com.huma.ex;
import java.util.*;
class Product{
	public static int totalCount=0;
	public String name;
	public int count=0;
	//입고,출고,내용
	public void add(int count) {
		this.count=this.count+count;
	}
	public void min(int count) {
		this.count=this.count-count;
	}
	public void display() {
		System.out.println("전체 상품 종류 개수 : "+Product.totalCount);
		System.out.println("상품 이름 : "+ this.name);
		System.out.println("상품 개수 : "+ this.count);
	}
	//생성자
	public Product() {
		Product.totalCount++;
	}
	public Product(String name) {
		this(name,0);
	}
	public Product(String name, int count) {
		this();
		this.name = name;
		this.count = count;
	}

	
}

public class ProductTest {
	
	public static void main(String[] args) {
		Product p1 = new Product("새우깡",100);
		Product p2 = new Product("연필",100);
		Product p3 = new Product("지우개",100);
		p1.display();
		p2.display();
		p3.display();
		
		//새우깡 4개 판매
		p1.min(4);
		//지우개 10개 입고
		p1.add(10);
		
		Product arr[] = new Product[5];
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		arr[3]= new Product("노트",10);
		
		//재고가 20이하인 제품을 출력하는 프로그램
		for(Product p:arr) {
			if(p!=null) {
				if(p.count<=20) {
					p.display();
				}
			}
		}
		
		//사용자의 입력을 받아 해당 품목 내용을 화면에 출력하자.		
		System.out.println("------------");
		String input="연필";
		for(Product p:arr) {
			if(p!=null) {
				if(p.name.equals(input)) {
					p.display();
				}
			}
		}
		
		//재고가 101이하인 제품을 출력하는 프로그램
		System.out.println("-------------");
		int number=101;
		for(int i=0; i<Product.totalCount; i++) {
			if(arr[i].count<number) {
				arr[i].display();
			}
		}
		
		//상품관리 프로그램
		//1. 상품등록
		//2. 입고
		//3. 출고
		//4. 상품검색
		//5. 상품재고 확인
		//6. 할인 상품
		
		// 요번주 여기까지 자바 마무리
		// html/css/javascript/jquery 다음주 2주
		// 다다음주 데이터 베이스 1달
		// jdbc,java 1달
		// jsp, spring 2달
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
