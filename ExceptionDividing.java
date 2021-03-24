package edu.mtc.egr281.chapter09;

public class ExceptionDividing {

	public static int divide(int num, int denom) throws EGR281ArithmeticException {
		if(denom==0) {
			throw new EGR281ArithmeticException();	
		}//ending bracket of if
		return num/denom;
	}// ending bracket of method divide

}//ending bracket of class ExceptionDividing
