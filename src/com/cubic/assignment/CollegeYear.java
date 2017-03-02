/**
 * 
 */
package com.cubic.assignment;

import java.util.Scanner;

/**
 * @author Bharat
 * 
 */

public class CollegeYear {

	/**
	 * @param args
	 */
	int year;

	int yearReturn() {

		System.out.println("\nEnter year you are currently enrolled: ");
		Scanner yearScanner = new Scanner(System.in);

		year = yearScanner.nextInt();
		return year;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;

		CollegeYear clyr = new CollegeYear();
		

		while (true) {

			year = clyr.yearReturn();

			switch (year) {

			case 1:
				System.out
						.println("\nYou  currently enrolled in junior class\n");
				break;

			case 2:
				System.out
						.println("\nYou  currently enrolled in second class\n");
				break;

			case 3:
				System.out
						.println("\nYou  currently enrolled in third class\n");
				break;

			case 4:
				System.out
						.println("\nYou  currently enrolled in senior class\n");
				break;

			default:
				System.out.println("\nYou entered invalid entry \n ");

			}
			if (year == 0)
				break;

		}
		
		System.out.println("\nProgram Exit!!");
		
	}

}
