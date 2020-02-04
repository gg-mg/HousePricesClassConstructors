
/** 
 * GeorgeGichukiHw4.java
 * 
 * Author: George Gichuki	Class: Java CS-2163-CS02
 *   
 * Program Description:
 * This is an application program for calculation of the price per square foot of a house
 * and tax payable given the total price, square footage and tax percentage..
 */

import java.util.Scanner;

public class GeorgeGichukiHw4 {

	public static void main(String[] args) {

		// output some basic info
		System.out.println("Java, Monday & Wednesday, 11:00am, George Gichuki hw4");

		// define the input handler
		Scanner input = new Scanner(System.in);

		House myHouse = new House(295000.0, 3395.0);

		House clubHouse = new House(189000.0, 1675.0);

		House supaHouse = new House();

		// input the total price
		System.out.print("Please input the total price: ");
		double supaTotalPrice = input.nextDouble();

		// input the total square feet
		System.out.print("Please input the total square feet: ");
		double supaTotalSqf = input.nextDouble();

		supaHouse.setTotalPrice(supaTotalPrice);
		supaHouse.setTotalSquareFeet(supaTotalSqf);

		// input the total square feet
		System.out.print("Please input the house tax percentage for example 1.25: ");
		double taxPercentage = input.nextDouble();

		double myHousePpsf = myHouse.calcPricePerSqf();
		double myHousePTax = myHouse.calcPropertyTax(taxPercentage);
		double clubHousePpsf = clubHouse.calcPricePerSqf();
		double clubHousePTax = clubHouse.calcPropertyTax(taxPercentage);
		double supaHousePpsf = supaHouse.calcPricePerSqf();
		double supaHousePTax = supaHouse.calcPropertyTax(taxPercentage);

//		myHousePTax = myHouse.calcPropertyTax(taxPercentage);

		System.out.printf("Price per square foot is %6.1f\n", myHousePTax);

		// output the result
		System.out.printf("The price per square foot of the house is: $%.2f", taxPercentage);

		// close the scanner
		input.close();
	}

}
