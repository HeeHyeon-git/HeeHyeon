package test;
class Car{
	public static int numOfCar=0;
	public static int numOfRedCar=0;	
	public String color;
	
	public Car() {}
	public Car(String color) {
		this.color=color;
		if(this.color=="red" || this.color=="RED" ) {	
			numOfRedCar++;
			numOfCar++;
		}else{
			numOfCar++;
		}
	}
	
	public static int getNumOfCar() {
		return Car.numOfCar++;
		
	}
	
	public static int getNumOfRedCar(){
		return Car.numOfRedCar++;	
	}

}
public class CarTest {

	public static void main(String[] args) {
	Car c1 = new Car("red");
	Car c2 = new Car("blue");		
	Car c3 = new Car("RED");	
	
	//System.out.println(c1.getNumOfCar());
	//System.out.println(c2.getNumOfCar());
	//System.out.println(c3.getNumOfCar());
//	System.out.println("-----------------");
//	
//	System.out.println(c1.getNumOfRedCar());
//	System.out.println(c2.getNumOfRedCar());
//	System.out.println(c3.getNumOfRedCar());
	System.out.printf("자동차 수 : %d, 빨간색 자동차수 : %d", Car.getNumOfCar(),Car.getNumOfRedCar());
	}

}
