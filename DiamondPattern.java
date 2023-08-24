package myjava;


//Java Program to print
//Diamond Star Pattern
import java.util.*;
public class DiamondPattern {
	// Function to demonstrate pattern
	public static void main(String[] args)
	{
		int i, j;
//		int num = 1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter value:");
//		int n = sc.nextInt();
		// outer loop to handle upper part
		for (i = 1; i <= 5; i++) {
			// inner loop to print spaces
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			// inner loop to print stars
			for (j = 1; j <= 2 * i- 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// outer loop to handle lower part
		for (i = 5-1; i >= 1; i--) {
			// inner loop to print spaces
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			// inner loop to print stars
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	


	

}






