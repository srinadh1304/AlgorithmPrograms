package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class InsertionSort<T extends Comparable<T>> {

	public void insertionSort(T[] wordArray) {

		int sizeOfArray = wordArray.length;

		for (int index = 1; index < sizeOfArray; ++index) {
			T current = wordArray[index];
			int previousIndex = index - 1;

			while (previousIndex >= 0 && wordArray[previousIndex].compareTo(current) > 0) {
				wordArray[previousIndex + 1] = wordArray[previousIndex];
				previousIndex = previousIndex - 1;
			}
			wordArray[previousIndex + 1] = current;
		}
		System.out.println("The sorted array is : ");
		printArray(wordArray);
	}

	public void printArray(T[] wordArray) {
		int sizeOfArray = wordArray.length;
		for (int index = 0; index < sizeOfArray; index++) {
			System.out.print(wordArray[index] + " ");
		}
	}

	public static void main(String[] args) {

		InsertionSort<Integer> sortObject = new InsertionSort<Integer>();
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
		sortObject.insertionSort(arrayToBoSorted);

	}

}