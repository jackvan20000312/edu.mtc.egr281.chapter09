package edu.mtc.egr281.chapter09;

import java.util.Scanner;

public class ExceptionDividingDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numerator, denominator;
		
		for( int i =0 ; i<5; ++i) {
			System.out.print("Enter Numerator: ");
			numerator=keyboard.nextInt();
			System.out.print("Enter Denominator: ");
			denominator=keyboard.nextInt();
			try {
			System.out.println(ExceptionDividing.divide(numerator,  denominator));
			}catch(EGR281ArithmeticException ae) {
				System.out.print("Caught An Exception: ");
				System.out.println(ae.getMessage());
			}
			
			System.out.println("end of Iteration #"+ i );
		}
		
		System.out.println("End of Program");
		keyboard.close();
		
	}// ending bracket of method main
	
}//ending bracket of class ExceptionDividingDriver
