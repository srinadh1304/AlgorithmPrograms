package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class BubbleSort <T extends Comparable<T>>{

	public void bubbleSorting(T[] numberArray) {

		int sizeOfArray = numberArray.length;

		for (int index = 0; index < sizeOfArray - 1; index++) {
			for (int index2 = 0; index2 < sizeOfArray - index - 1; index2++) {
				if (numberArray[index2].compareTo(numberArray[index2 + 1]) > 0) {
					T temporary = numberArray[index2];
					numberArray[index2] = numberArray[index2 + 1];
					numberArray[index2 + 1] = temporary;
				}
			}
		}
		System.out.println("The sorted array is : ");
		printArray(numberArray);
	}

	public void printArray(T[] wordArray) {
		int sizeOfArray = wordArray.length;
		for (int index = 0; index < sizeOfArray; index++) {
			System.out.print(wordArray[index] + " ");
		}
	}

	public static void main(String[] args) {

		BubbleSort<Integer> sortObject = new BubbleSort<Integer>();
		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Enter the Size Of The Array: ");
		int sizeOfArray = scannerObject.nextInt();
		Integer[] arrayToBoSorted = new Integer[sizeOfArray];

		System.out.println("Enter the Array Elements");
		for (int index = 0; index < sizeOfArray; index++) {
			Integer word = scannerObject.nextInt();
			arrayToBoSorted[index] = word;
		}
		scannerObject.close();

		System.out.println("The Array is : ");
		sortObject.printArray(arrayToBoSorted);
		System.out.println("");
		sortObject.bubbleSorting(arrayToBoSorted);

	}

}