package myjava;

interface Drawable {
   void area();
   void volume();
}

 class Circle implements Drawable{
	

	@Override
	public void volume() {
		int r=5;
		System.out.println("Volume of circle:" +2 * 3.14 * r);
	}

	@Override
	public void area() {
		int r=4;
		System.out.println("Area of circle:" +3.14 * 3.14);
	}
}
 class Square implements Drawable{

	@Override
	public void area() {
		int a = 5;
		System.out.println("Area of square:" +a * a);
	}

	@Override
	public void volume() {
		int side = 4;
		System.out.println("Volume of square:" +side * side * side);
	}
	 
 }
 class Rectangle implements Drawable {

	@Override
	public void area() {
		int l =10;
		int b = 5;
		System.out.println("Area of rectangle:" +l * b);
	}

	@Override
	public void volume() {
		int l =10;
		int b = 5;
		int h = 6;
		System.out.println("Volume of rectangle:" +l * b * h);
	}
	 
 }

public class InterfaceExe
{

	public static void main(String[] args) {
		Drawable d = new Circle();
		d.area();
		d.volume();
		Drawable d1 = new Square();
		d1.area();
		d1.volume();
		Drawable d2 = new Rectangle();
		d2.area();
		d2.volume();

	}

}

