package edu.mtc.egr281.chapter09;

import java.util.Scanner;

public class SampleExceptionDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n,d;

		System.out.print("Enter n: ");

		n = keyboard.nextInt();
		System.out.print("Enter d: ");

		d = keyboard.nextInt();
		
		try {
			System.out.println("n/d = " + (n/d));
			System.out.println("End of try Block");
		} catch(ArithmeticException ae) {
			System.out.println("Unusual event Ocurred");
			System.out.println(ae.getMessage());
			ae.printStackTrace(System.err);
		}
		
		
		
		
		
		System.out.println("End of program");
		keyboard.close();
		
	}
	
	
}
