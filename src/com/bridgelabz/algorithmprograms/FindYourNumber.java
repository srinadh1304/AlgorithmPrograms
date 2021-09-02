package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class FindYourNumber {
	
	public static Scanner scannerObject = new Scanner(System.in);
	
	public void findNumber(int low, int high) {
		
		if(low == high) {
			System.out.println("Your Number is : "+low);
			System.out.println("Intermediatory Number is: "+(low-1)+" and "+(low+1));
			return;
		}
		
		int middle = (low+high)/2;
		int choice;
		System.out.println("Press 1 if the number is between : "+low+" and "+middle);
		System.out.println("Press 2 if the number is between : "+(middle+1)+" and "+high);
		choice = scannerObject.nextInt();
		
		if(choice == 1) {
			findNumber(low, middle);
		}
		else {
			findNumber(middle+1, high);
		}
	}
	
	public static void main(String[] args) {
		
		FindYourNumber classObject = new FindYourNumber();
		System.out.println("Think of a number between 0 and 100");
		int N = Integer.parseInt(args[0]);
		classObject.findNumber(0, N-1);
		scannerObject.close();

	}

}
