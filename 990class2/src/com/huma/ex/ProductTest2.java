package com.huma.ex;
//상품관리 프로그램
//1. 상품등록
//2. 입고
//3. 출고
//4. 상품검색
//5. 상품재고 확인
class ProductManger{
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex=0;
	public Product [] arrProduct = new Product[10];
	
	public ProductManger() {}
	//1. 상품등록
	public void registTestData() {
		Product p1 = new Product("새우깡",100);
		registProduct(p1);
		Product p2 = new Product("연필",100);
		registProduct(p2);
		Product p3 = new Product("지우개",90);
		registProduct(p3);
		Product p4 = new Product("책",70);
		registProduct(p4);
		Product p5 = new Product("볼펜",90);
		registProduct(p5);
	}
	
	public void registProduct(Product p) {
		arrProduct[arrIndex++]=p;
		//arrProduct[Product.totalCount-1]=p;
	}
	public void registProduct() {
		//arrProduct[0]=new Product("새우깡", 10);
		System.out.println("상품명 등록 페이지");
		System.out.println("상품명>>");
		String name=sc.nextLine();
		System.out.println("등록개수>>");
		int count=Integer.parseInt(sc.nextLine());
		arrProduct[arrIndex++]
				=new Product(name, count);
	}
	
	//2. 입고
	public void inputProduct() {
		System.out.println("입고할 상품 입력>>");
		String name = sc.nextLine();
		System.out.println("입고할 상품 개수 입력>>");
		int count = Integer.parseInt(sc.nextLine());
		Product p= searchProduct(name);
		if(p==null) {
			System.out.println("없는 상품입니다.");
		}else {
			p.count=p.count+count++;
		}
		p.display();
	}
	
	//3. 출고
	public void outputProduct() {
		System.out.println("출고할 상품 입력>>");
		String name = sc.nextLine();
		System.out.println("출고할 상품 개수 입력>>");
		int count = Integer.parseInt(sc.nextLine());
		
		Product p= searchProduct(name);
		if(p==null) {
			System.out.println("없는 상품입니다.");
		}else {
			p.count=p.count-count;
		}
		p.display();
	}
	
	//4. 상품검색
	public Product searchProduct(String name) {
		Product returnValue=null;
		for(int i=0; i<arrIndex; i++) {
			if(arrProduct[i].name.equals(name)) {
				returnValue=arrProduct[i];
				break;
			};
		}
		return returnValue;
	}
	
	//5. 상품재고 확인
	public void displayProduct() {
		for(int i=0; i<Product.totalCount; i++) {
			arrProduct[i].display();
		}
	}	

	//6. play 함수 만들기
	public void start() {
		String op="";
		System.out.println("상품 관리를 도와 드리겠습니다. 다음 메뉴를 선택해주세요");
		while(!equals("6")) {
			System.out.println("1.상품 등록   2.입고  3.출고  4.상품 검색  5.상품재고 확인  6.종료 ");
			op=sc.nextLine();
			switch(op) {
			case "1":
				registProduct();
				break;
			case "2":
				inputProduct();
				break;
			case "3":
				outputProduct();
				break;
			case "4":
				System.out.println("찾으시는 상품의 이름을 입력해주세요");
				String name=sc.nextLine();
				Product returnValue=null;
				for(int i=0; i<arrIndex; i++) {
					if(arrProduct[i].name.equals(name)) {
						returnValue=arrProduct[i];
					}
				}	
				break;		
				
			case "5":
				displayProduct();
				break;
			default:
				System.out.println("잘못 누르셨습니다.");
			}
			
		}
		
	}


}
public class ProductTest2 {

	public static void main(String[] args) {
		
		ProductManger pm = new ProductManger();
		//pm.start() 함수 만들기
		pm.start();
//		pm.registProduct();
//		pm.registTestData();
//		pm.displayProduct();
		

	}

}
