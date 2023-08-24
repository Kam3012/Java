package myjava;

class Overloadj{
	public static void calc(int a, int b) {
	      System.out.println(a+b);
	   }
	   public static void calc(float a, float b) {
	      System.out.println(a + b);
	      
	   }
	  
}
class Overridej extends Overloadj{
	public static void calc(int a, int b) {
	      System.out.println(a-b);
	   }
	   public static void calc(float a, float b) {
	      System.out.println(a - b);
	   }
	
	   
}
class Mul extends Overloadj{
	public static void calc(int a, int b) {
	      System.out.println(a*b);
	   }
	   public static void calc(float a, float b) {
	      System.out.println(a * b);
	   }
	
}
class Div extends Overloadj{
	public static void calc(int a, int b) {
	      System.out.println(a/b);
	   }
	   public static void calc(float a, float b) {
	      System.out.println(a / b);
	   }
	
}

public class PolymorphismExe {
	
	   
		   

	public static void main(String[] args) {
		Overloadj ol = new Overloadj();
		ol.calc(5, 10);
		ol.calc(10.5f, 5.5f);
		Overloadj or = new Overridej();
		or.calc(30, 40);
		or.calc(30.5f, 40.5f);
		Mul m = new Mul();
		m.calc(5, 10);
		m.calc(5.5f, 6.0f);
		Div d = new Div();
		d.calc(10, 5);
		d.calc(10.5f, 5.5f);
		
		
	}

}
