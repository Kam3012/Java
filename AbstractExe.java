package myjava;

abstract class Shape{
	abstract void calculateArea();
	void SquArea() {
		int a =5;
		System.out.println("Area of square:" +a * a);
	}
	
}


class Circle1 extends Shape{

	@Override
	void calculateArea() {
		int radius = 5;
		System.out.println("Area of circle :" +3.14 * radius * radius);
		
	}
	
}

public class AbstractExe {

	public static void main(String[] args) {
		Circle1 c = new Circle1();
		c.calculateArea();
		Circle1 s = new Circle1();
		s.SquArea();
		
		
		

	}

}
