package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class AnagramAndPalindrome extends PrimeNumbers {
	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);
		AnagramAndPalindrome primeNumbers = new AnagramAndPalindrome();
		ArrayList<Integer> primeNumbersArray = new ArrayList<Integer>();
		System.out.println("Enter the number to check if anagram exists: ");
		int userInput = scannerObject.nextInt();
		scannerObject.close();

		for (int index = 370; index <= 1000; index++) {
			boolean isPrime = primeNumbers.checkIfPrime(index);
			if (isPrime) {
				primeNumbers.checkIfAnagram(index, userInput);


			}
		}

	}
	public static void checkIfPalindrome(int number) {
		boolean foundPalindrome = false;
		int remainder=0,sum=0;
		while (number > 0) {
			remainder = number % 10; // getting remainder
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if(sum==number)
		{
			System.out.println("The number "+number+" is a palindrome and anagram and prime");
		}



	}

	static void updateFreq(int n, int [] freq)
	{ 
		while (n > 0)

		{
			int digit = n % 10;

			freq[digit]++;
			n /= 10;
		}
	}
	static void checkIfAnagram(int a, int b)
	{
		int [] freqA = new int[10];
		int [] freqB = new int[10];
		boolean isAnagram=true;
		updateFreq(a, freqA);
		updateFreq(b, freqB);
		for (int i = 0; i < 10; i++)
		{
			if (freqA[i] != freqB[i])
				isAnagram=false;
		}
		if(isAnagram==true)
		{
			checkIfPalindrome(a);
		}
		else
		{
			System.out.println("A number that is palindrome and anagram and prime does not exist");
		}
		
	}





}