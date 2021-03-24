package edu.mtc.egr281.chapter09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FlowerShop {

	public static DecimalFormat df = new DecimalFormat("$#,#0.00");
	public static String [] flowers = {"petunia", "rose", "violet", "daisy"};
	public static double[] costPerFlower = {1.50, 5.75, 2.25, 0.75};
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Welcome to the Flower Shop!!");
		System.out.println("We Have Petunia, Rose, Violet, and Daisy Flowers");
		System.out.print("Which Flower would you like to buy?");
		String flower=kb.nextLine();
		System.out.println("How many "+flower+"s did you want to buy?");
		int number=kb.nextInt();
		double cost = 0.0;
		for(int i =0; i<flowers.length; ++i) {
			if(flowers[i].equalsIgnoreCase(flower)) {
				cost=number*costPerFlower[i];
				break;
			}
			
		}
		System.out.println("Your Total Cost IS "+df.format(cost));
		
		
		
		kb.close();
	}
	
	public static String getFlowerName(Scanner keyboard) throws UnknownFlower{
		
		System.out.print("Which flower would you like to buy");
		String name = keyboard.nextLine();
		boolean isBadName = true;
		for(int i = 0; i<flowers.length; ++i) {
			if(flowers[i].equalsIgnoreCase(name)) {
				isBadName=false;
				break;
			}
		}
		if(isBadName) {
			throw new UnknownFlower();
		}
		
		
		
		
		
	}
	
}//ending bracket of class flowerShop
