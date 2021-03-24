package edu.mtc.egr281.chapter09;

public class UnknownFlower extends Exception {
	
	
	public UnknownFlower(String newMessage) {
		super(newMessage);
	}
public UnknownFlower() {
	this("This is an Unknown Flower??");
}
}
