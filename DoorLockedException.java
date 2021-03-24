package edu.mtc.egr281.chapter09;

public class DoorLockedException extends Exception {


	private static final long serialVersionUID = 1L;

	public DoorLockedException(String newMessage) {
		super(newMessage);
	}
	public DoorLockedException() {
		this("Needs the Key!!");
	}
	
}
