package edu.mtc.egr281.chapter09;

import java.util.Scanner;

public class SampleExceptionDriver2 {
public static void main(String[] args) {
Scanner kb = new Scanner(System.in);
int n, d;
for(int i = 0; i < 10; ++i) {
System.out.print("Enter n: ");
n = kb.nextInt();
System.out.print("Enter d: ");
d = kb.nextInt();
try {
System.out.println("n/d = " + (n/d));
} catch(ArithmeticException ae) {
System.out.print("Caught an exception:");
System.out.println(ae.getMessage());
i=i-1;
}// Ending bracket of try-catch
System.out.println("End of iteration #" + i);
}// Ending bracket of for loop
System.out.println("End of program");
kb.close();
}
}
