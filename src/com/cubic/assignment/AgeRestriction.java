/**
 * 
 */
package com.cubic.assignment;

import java.io.*;
import java.util.Scanner;

/**
 * @author Bharat
 * 
 */
public class AgeRestriction {

	
	
	
	//declare variable
	int age;
	String name;
    //.............................................//
	
	
	
	//input from user  console and assign to variables
	int getAge() {
		Scanner ageScanner = new Scanner(System.in);
		int age = ageScanner.nextInt();
		return age;
		

	}

	String getNAme() {
		Scanner nameScanner = new Scanner(System.in);
		String name = nameScanner.nextLine();
		return name;

	}
	
	
	//..................................................//
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgeRestriction ar =new AgeRestriction();
		
		
		System.out.println("Can i Know Your Age: ");
		int age = ar.getAge();
		
		System.out.println("Can i Know Your Name: ");
		String name = ar.getNAme();
		
		if(age<16){
			
			System.out.println(name+ ":\nYou are not allowed to drive at the moment."+"\nYou are not allowed to vote at the moment."+"\nYou are not allowed to rent a car at the moment.");
			
			
			
			
		}else if (age >= 16 && age < 18){
			
			
			System.out.println(name+ "\nYou are not allowed to vote at the moment."+"\nYou are not allowed to rent a car at the moment.");
			
		}else if(age >= 18 && age < 25){
			
			
			System.out.println(name+ ":\nYou are not allowed to rent a car at the moment.");
			
		}else System.out.println(name+ "\nYou can do anything that is legal.");
			
		
		}
		
		
		
		
		

	}


