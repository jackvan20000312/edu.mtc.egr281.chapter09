package edu.mtc.egr281.chapter09;

public class EGR281ArithmeticException extends Exception{


	private static final long serialVersionUID = -312174248104564079L;

	public EGR281ArithmeticException() {
		this("This is our own arithmetic exception.");
		
		
	}
	public EGR281ArithmeticException(String newMessage) {
		super(newMessage);
	}
	
}
