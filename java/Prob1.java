// package com.euler.ashish;

public class Prob1 {

	private static int findSum(int num1, int num2, int max_val) {
		int sum = 0;
		for(int i = num1; i<max_val; i += num1) {
			sum += i;
		}
		for(int i = num2; i<max_val; i += num2) {
			if(i%num1 != 0) 
				sum += i;
		}
		return sum;
	}

	public static void main(String []args) {
		int num1 = 3;
		int num2 = 5;
		int max_val = 1000;

		System.out.println("The sum of all natural numbers below " + max_val + " that are multiples of " + num1 + " or " + num2 + " is " + findSum(num1, num2, max_val) + ".");
	}
}