package edu.mtc.egr281.chapter09;

public class DoorLockedExceptionDriver {

	public static void main(String[] args) {
		
		try {throw new DoorLockedException();
		} catch(DoorLockedException dle) {
			System.out.println(dle.getMessage());
		}
		
		try {
			throw new DoorLockedException("Door number 204");
		} catch(DoorLockedException dle) {
			System.out.println(dle.getMessage());
		}
		
	}
	
}
